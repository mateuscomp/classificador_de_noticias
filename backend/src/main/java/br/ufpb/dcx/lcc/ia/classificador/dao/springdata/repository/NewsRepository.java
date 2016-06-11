package br.ufpb.dcx.lcc.ia.classificador.dao.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.ufpb.dcx.lcc.ia.classificador.domain.News;

@Repository
public interface NewsRepository extends CrudRepository<News, Long>{

}
