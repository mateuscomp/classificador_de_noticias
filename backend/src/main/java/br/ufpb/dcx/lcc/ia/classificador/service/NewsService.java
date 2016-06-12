package br.ufpb.dcx.lcc.ia.classificador.service;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufpb.dcx.lcc.ia.classificador.dao.springdata.repository.NewsRepository;
import br.ufpb.dcx.lcc.ia.classificador.domain.News;

@Service
public class NewsService {

	@Autowired
	private NewsRepository newsRepository;

	private int numeroTotalDeNoticias;
	private int numeroTotalDeNoticiasDeSucesso;
	private int numeroTotalDeNoticiasDeNaoSucesso;

	public List<News> getAllNews() {
		Iterator<News> newsIterable = this.newsRepository.findAll().iterator();
		List<News> newsList = new LinkedList<News>();
		while (newsIterable.hasNext()) {
			newsList.add(newsIterable.next());
		}
		return newsList;
	}

	public boolean rank(String title) {
		numeroTotalDeNoticias = (new Long(newsRepository.count())).intValue();
		numeroTotalDeNoticiasDeSucesso = (new Long(newsRepository.countSuccesfulNews())).intValue();
		numeroTotalDeNoticiasDeNaoSucesso = numeroTotalDeNoticias - numeroTotalDeNoticiasDeSucesso;

		double multiplicacaoDasProbabilidadesDasPalavrasEmNoticiasDeSucesso = probabilityOfWords(title,
				numeroTotalDeNoticiasDeSucesso);
		double probabilidadesDeNoticiasDeSucesso = probability(numeroTotalDeNoticiasDeSucesso, numeroTotalDeNoticias);

		double multiplicacaoDasProbabilidadesDasPalavrasEmNoticiasDeNaoSucesso = probabilityOfWords(title,
				numeroTotalDeNoticiasDeNaoSucesso);
		double probabilidadesDeNoticiasDeNaoSucesso = probability(numeroTotalDeNoticiasDeNaoSucesso,
				numeroTotalDeNoticias);

		double probBefore = (multiplicacaoDasProbabilidadesDasPalavrasEmNoticiasDeSucesso * probabilidadesDeNoticiasDeSucesso)
				/ ((multiplicacaoDasProbabilidadesDasPalavrasEmNoticiasDeSucesso * probabilidadesDeNoticiasDeSucesso)
						+ (multiplicacaoDasProbabilidadesDasPalavrasEmNoticiasDeNaoSucesso
								* probabilidadesDeNoticiasDeNaoSucesso));
		
		double cem = 100.0;
		double probAfter = probBefore * cem;
		
//		boolean retorno = probAfter >= ClassificadorUtils.ACCEPTABLE_PERCENTUAL_TO_A_SUCCESFUL_NEWS;
		System.out.println("==================================================");
		System.out.println(">>> Total de notícias cadastradas: " + numeroTotalDeNoticias);
		System.out.println(">>> Total de notícias de sucesso: " + numeroTotalDeNoticiasDeSucesso);
		System.out.println(">>> Total de notícias de nao sucesso: " + numeroTotalDeNoticiasDeNaoSucesso);
		System.out.println("=====");
		System.out.println(">>> Probab. sucesso: " + probabilidadesDeNoticiasDeSucesso);
		System.out.println(">>> Probab. não sucesso: " + probabilidadesDeNoticiasDeNaoSucesso);
		System.out.println("=====");
		System.out.println(">>> Probabilidade  antes é: " + (new BigDecimal(probBefore).toPlainString()));
		System.out.println(">>> Probabilidade  depois é: " + 
				(new BigDecimal(probBefore).multiply(new BigDecimal(100.0)).toPlainString()));
//		System.out.println(">>> Retorno é: " + retorno);
		System.out.println("==================================================");

		return false;
	}

	private double probabilityOfWords(String title, int totalNumber) {
		double probab = 1.0;

		String[] words = title.split(" ");
		for (int i = 0; i < words.length; i++) {
			int countOfNewsThatHasTheWord = newsRepository.countNewsThatHasWord(words[i]);
			probab *= probability(countOfNewsThatHasTheWord, totalNumber);
			
			System.out.println("\t=====");
			System.out.println("\t>>> O count de '" + words[i] + "' é: " + countOfNewsThatHasTheWord);
			System.out.println("\t>>> O total para o calculo da proab é: " + totalNumber);
			System.out.println("\t>>> Probabilidade de '" + words[i] + "' é: " + probability(countOfNewsThatHasTheWord, totalNumber));
			System.out.println("\t=====");
		}
		System.out.println("==================================================");
		return probab;
	}

	private double probability(int partial, int total) {
		double partialDouble = partial * 1.0;
		double totalDouble  = total * 1.0;
		
		return (partialDouble / totalDouble);
	}
}
