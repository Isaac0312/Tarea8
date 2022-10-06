
public class Serie {
	private String titulo;
	private int num_temp;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		this.num_temp=3;
		this.entregado=false;
		this.titulo="";
		this.creador="";
		this.genero="";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		this.creador=creador;
		this.num_temp=3;
		this.entregado=false;
		this.genero="";
	}
	
	public Serie(String titulo, int num_temp, String genero, String creador) {
		this.titulo=titulo;
		this.num_temp=num_temp;
		this.genero=genero;
		this.creador=creador;
		this.entregado=false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNum_temp() {
		return num_temp;
	}

	public void setNum_temp(int num_temp) {
		this.num_temp = num_temp;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
}
