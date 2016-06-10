package br.ufpb.dcx.lcc.ia.classificador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.ufpb.dcx.lcc.ia.classificador.domain.Category;
import br.ufpb.dcx.lcc.ia.classificador.domain.News;
import br.ufpb.dcx.lcc.ia.classificador.service.CategoryService;

@Controller
@RequestMapping(value = "/system")
public class SystemController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "evaluateNew", method = RequestMethod.GET)
	@ResponseBody
	public List<Category> evaluate(News news) {
		 List<Category> categ = categoryService.getAllCategories();
		 
		 System.out.println(">>> Categories: " + categ.size());
		 return categ;
	}
}
