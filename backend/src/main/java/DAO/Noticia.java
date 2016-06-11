package DAO;

public class Noticia {
	
	private Long id;
	private String titulo;
	private int numeroDeComentario;
	private String url;
	private Categoria categoria_id;
	

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getNumeroDeComentario() {
		return numeroDeComentario;
	}
	
	public void setNumeroDeComentario(int numeroDeComentario) {
		this.numeroDeComentario = numeroDeComentario;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public String getCategoria_id() {
		return categoria_id.getNome();
	}
	
	public Categoria getCategoriaId(){
		return categoria_id;
	}

	public void setCategoria_id(Categoria categoria_id) {
		this.categoria_id = categoria_id;
	}
	
	
}
