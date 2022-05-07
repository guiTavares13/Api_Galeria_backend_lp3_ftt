package beans;

import java.time.LocalDate;

public class Imagem {

	private Autor autor = new Autor();
	private int idautor = Autor.get.id();
    private int id;
    private String path;
    private String descricao;
    private LocalDate data;

    public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setId(String id) {
		if (id == null) {
			setId(0);
		} else {
		 setId(Integer.valueOf(id));
		}
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}