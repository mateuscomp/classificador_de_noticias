package br.ufpb.dcx.lcc.ia.classificador.service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufpb.dcx.lcc.ia.classificador.domain.News;
import br.ufpb.dcx.lcc.ia.classificador.repository.NewsRepository;

@Service
public class NewsService {

	@Autowired
	private NewsRepository newsRepository;

	public List<News> getAllNews() {
		Iterator<News> newsIterable = this.newsRepository.findAll().iterator();
		List<News> newsList = new LinkedList<News>();
		while (newsIterable.hasNext()) {
			newsList.add(newsIterable.next());
		}
		return newsList;
	}
}
