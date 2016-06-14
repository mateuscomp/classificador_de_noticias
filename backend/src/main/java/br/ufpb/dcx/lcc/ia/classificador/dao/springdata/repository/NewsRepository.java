package br.ufpb.dcx.lcc.ia.classificador.dao.springdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.ufpb.dcx.lcc.ia.classificador.domain.News;
import br.ufpb.dcx.lcc.ia.classificador.utils.ClassificadorUtils;

@Repository
public interface NewsRepository extends CrudRepository<News, Long> {

	@Query("SELECT count(n) FROM News n WHERE LOWER(n.title) LIKE LOWER(CONCAT('%',:title, '%'))")
	public int countNewsThatHasWord(@Param("title") String word);

	@Query("SELECT count(n) FROM News n WHERE n.numberOfComments >= " + ClassificadorUtils.NUM_COMENTARIOS_NOTICIA_SUCESSO)
	public long countSuccesfulNews();

	@Query("SELECT n FROM News n WHERE n.numberOfComments >= " + ClassificadorUtils.NUM_COMENTARIOS_NOTICIA_SUCESSO)
	public List<News> getAllSuccessfulNews();
	
	@Query("SELECT n FROM News n WHERE n.numberOfComments < " + ClassificadorUtils.NUM_COMENTARIOS_NOTICIA_SUCESSO)
	public List<News> getAllUnsuccessfulNews();
}
