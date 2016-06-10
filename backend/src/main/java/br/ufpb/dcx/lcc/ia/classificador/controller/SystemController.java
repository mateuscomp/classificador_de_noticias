package br.ufpb.dcx.lcc.ia.classificador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.ufpb.dcx.lcc.ia.classificador.domain.News;
import br.ufpb.dcx.lcc.ia.classificador.service.NewsService;

@Controller
@RequestMapping(value = "/system")
public class SystemController {

	@Autowired
	private NewsService newsService;

	@ResponseBody
	@RequestMapping(value = "listNews", method = RequestMethod.GET)
	public List<News> listAllNews() {
		return newsService.getAllNews();
	}
	
	
}
