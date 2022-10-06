import java.awt.Color;

public class Electrodomestico {
	
	//Constantes
	private static final String letra_defecto="F";
	
	protected double precio_base;
	protected Colores color;
	protected String consumo_electrico;
	protected int peso;
	
	
	public Electrodomestico() {
		this.precio_base=100;
		this.color=Colores.blanco;
		this.consumo_electrico=letra_defecto;
		this.peso=5;
	}
	
	public Electrodomestico(int precio, int peso) {
		this.precio_base=precio;
		this.peso=peso;
		this.color=Colores.blanco;
		this.consumo_electrico=letra_defecto;
	}
	
	public Electrodomestico(int precio, Colores color, String consumo_electrico, int peso) {
		this.precio_base=precio;
		this.color=color;
		if(!consumo_electrico.contains("[A-Fa-f]")){
			System.out.println("Error al introducir el consumo_electrico, dejamos el por defecto");
			this.consumo_electrico=letra_defecto;
		}else {
			this.consumo_electrico=consumo_electrico;
		}
		this.peso=peso;
	}

	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	public String getConsumo_electrico() {
		return consumo_electrico;
	}

	public void setConsumo_electrico(String consumo_electrico) {
		this.consumo_electrico = consumo_electrico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public static String getLetraDefecto() {
		return letra_defecto;
	}
	
	
}
