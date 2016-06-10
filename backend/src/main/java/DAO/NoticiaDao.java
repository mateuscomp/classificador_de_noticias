package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;;

public class NoticiaDao {

	// conexão com o banco de dados
	private Connection connection;
	
	public NoticiaDao() throws runtimeException {
		this.connection = new ConFactory().getConnection();
	}
	
	// adicionando uma notícia
	public void adiciona(Noticia noticia) {
		String sql = "insert into noticias " + " values (?, ?, ?, ?)";
		
		try {
						
			// prepared statement para inserçao
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// seta os valores
			stmt.setLong(1, noticia.getId());
			stmt.setString(2, noticia.getTitulo());
			stmt.setInt(3, noticia.getNumeroDeComentario());
			stmt.setString(4, noticia.getUrl());
			stmt.setString(5, noticia.getCategoria_id());
			// executa
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	// retorna uma lista de noticias
	public List<Noticia> getLista() {
		
		try {
			List<Noticia> noticias = new ArrayList<Noticia>();
			PreparedStatement stmt = this.connection.prepareStatement("select * from noticias");
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				// id_categoria de noticia 
				Categoria id_categoria = new Categoria();
				
				// criando objeto Noticia
				Noticia noticia = new Noticia();
				noticia.setId(32l);
				noticia.setTitulo("titulo");
				noticia.setNumeroDeComentario(10);
				noticia.setUrl("url");
				noticia.setCategoria_id(id_categoria);
				
				// adicionando objeto a lista
				noticias.add(noticia);
							
			}
			rs.close();
			stmt.close();
			return noticias;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public void altera(Noticia noticia) {
		String sql = "update noticias set id = ?, titulo = ?, numero_de_comentario = ?, url = ?, categoria_id = ?";
		
		try {
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setLong(1, noticia.getId());
			stmt.setString(2, noticia.getTitulo());
			stmt.setInt(3, noticia.getNumeroDeComentario());
			stmt.setString(4, noticia.getUrl());
			stmt.setString(5, noticia.getCategoria_id());
			
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	// removendo noticia pelo id
	public void remove(Noticia noticia) {
		
		try {
			// prepared statement para inserçao
			PreparedStatement stmt = connection.prepareStatement("delete from noticias where id = ?");
			
			stmt.setLong(1, noticia.getId());
			stmt.execute();
			stmt.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
