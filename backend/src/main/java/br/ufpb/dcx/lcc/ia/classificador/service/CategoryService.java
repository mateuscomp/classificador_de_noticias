package br.ufpb.dcx.lcc.ia.classificador.service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufpb.dcx.lcc.ia.classificador.dao.springdata.repository.CategoryRepository;
import br.ufpb.dcx.lcc.ia.classificador.domain.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategories() {
		Iterator<Category> categoriesIterable = this.categoryRepository.findAll().iterator();
		List<Category> categoriesList = new LinkedList<Category>();
		while(categoriesIterable.hasNext()){
			categoriesList.add(categoriesIterable.next());
		}
		
		return categoriesList;
	}
}
