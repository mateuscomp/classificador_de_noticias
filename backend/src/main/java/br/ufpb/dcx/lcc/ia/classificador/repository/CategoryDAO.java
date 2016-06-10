package br.ufpb.dcx.lcc.ia.classificador.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.ufpb.dcx.lcc.ia.classificador.domain.Category;

@Repository
public interface CategoryDAO extends CrudRepository<Category, Long>{

}
