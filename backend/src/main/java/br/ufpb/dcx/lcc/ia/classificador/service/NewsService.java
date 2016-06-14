package br.ufpb.dcx.lcc.ia.classificador.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufpb.dcx.lcc.ia.classificador.dao.springdata.repository.NewsRepository;
import br.ufpb.dcx.lcc.ia.classificador.domain.News;
import br.ufpb.dcx.lcc.ia.classificador.utils.ClassificadorUtils;

@Service
public class NewsService {

	private final int K = 1;

	@Autowired
	private NewsRepository newsRepository;

	private int numeroTotalDeNoticias;
	private int numeroTotalDeNoticiasDeSucesso;
	private int numeroTotalDeNoticiasDeNaoSucesso;

	private Map<String, Integer> successfulWords = new HashMap<String, Integer>();
	private Map<String, Integer> unsuccessfulWords = new HashMap<String, Integer>();

	public boolean rank(String title) {
		successfulWords = loadWords(this.newsRepository.getAllSuccessfulNews());
		unsuccessfulWords = loadWords(this.newsRepository.getAllUnsuccessfulNews());

		numeroTotalDeNoticias = (new Long(newsRepository.count())).intValue();
		numeroTotalDeNoticiasDeSucesso = (new Long(newsRepository.countSuccesfulNews())).intValue();
		numeroTotalDeNoticiasDeNaoSucesso = numeroTotalDeNoticias - numeroTotalDeNoticiasDeSucesso;

		double probabilidadeDasPalavrasDeNoticiasDeSucesso = probabilityOfWordsInSuccessfulNews(title, successfulWords);
		double probabilidadesDeNoticiasDeSucesso = probability(numeroTotalDeNoticiasDeSucesso, numeroTotalDeNoticias,
				K);

		double probabilidadeDasPalavrasDeNoticiasDeNaoSucesso = probabilityOfWordsInSuccessfulNews(title,
				unsuccessfulWords);
		double probabilidadesDeNoticiasDeNaoSucesso = probability(numeroTotalDeNoticiasDeNaoSucesso,
				numeroTotalDeNoticias, K);

		double probabilidadeTotal = ((probabilidadeDasPalavrasDeNoticiasDeSucesso * probabilidadesDeNoticiasDeSucesso)
				/ ((probabilidadeDasPalavrasDeNoticiasDeSucesso * probabilidadesDeNoticiasDeSucesso)
						+ (probabilidadeDasPalavrasDeNoticiasDeNaoSucesso * probabilidadesDeNoticiasDeNaoSucesso)));

		System.out.println("A probabilidade foi: " + probabilidadeTotal);
		return probabilidadeTotal >= ClassificadorUtils.ACCEPTABLE_PERCENTUAL_TO_A_SUCCESFUL_NEWS;
	}

	private double probabilityOfWordsInSuccessfulNews(String title, Map<String, Integer> wordsMap) {
		double probability = 1.0;

		String[] wordsOfTitle = title.split(" ");
		for (int i = 0; i < wordsOfTitle.length; i++) {
			String wordLower = wordsOfTitle[i].toLowerCase();
			if (wordsMap.containsKey(wordLower)) {
				int ocorrenciasDaPalavra = wordsMap.get(wordLower);
				probability *= (probability(1, ocorrenciasDaPalavra, K));
			} else {
				probability *= (probability(1, 0, K));
			}
		}
		return probability;
	}

	private Map<String, Integer> loadWords(List<News> list) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (News n : list) {
			String[] words = n.getTitle().split(" ");
			for (int i = 0; i < words.length; i++) {
				String word = words[i];
				if (map.containsKey(word.toLowerCase())) {
					Integer value = map.remove(word.toLowerCase());
					map.put(word.toLowerCase(), value++);
				} else {
					map.put(word.toLowerCase(), 1);
				}
			}
		}

		return map;
	}

	private double probability(int partial, int total, int k) {
		double partialDouble = (double) partial;
		double totalDouble = (double) total;

		return ((k + partialDouble) / (totalDouble + (k * 2)));
	}
}
