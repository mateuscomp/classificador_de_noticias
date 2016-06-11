package br.ufpb.dcx.lcc.ia.classificador.dao.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.ufpb.dcx.lcc.ia.classificador.domain.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
