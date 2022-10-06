
public class Electrodomestico {
	
	//Constantes
	private static final String letra_defecto="F";
	
	protected double precio_base;
	protected String color;
	protected String consumo_electrico;
	protected int peso;
	
	
	public Electrodomestico() {
		this.precio_base=100;
		this.color="blanco";
		this.consumo_electrico=letra_defecto;
		this.peso=5;
	}
	
	public Electrodomestico(int precio, int peso) {
		this.precio_base=precio;
		this.peso=peso;
		this.color="blanco";
		this.consumo_electrico=letra_defecto;
	}
	
	public Electrodomestico(int precio, String color, String consumo_electrico, int peso) {
		this.precio_base=precio;
		
		if(compararEnum(color)) {
			this.color=color;
		}else {
			this.color="blanco";
		}
		
	
		if(consumo_electrico.matches("[a-fA-F]")){
			this.consumo_electrico=consumo_electrico;
		}else {
			System.out.println("Error al introducir el consumo_electrico, dejamos el por defecto");
			this.consumo_electrico=letra_defecto;
		}
		
		this.peso=peso;
	}
	
	private boolean compararEnum(String color) {
	
		if(color.equalsIgnoreCase(Colores.azul.toString())) {
			return true;
			
		}else if ((color.equalsIgnoreCase(Colores.rojo.toString()))){
			return true;
			
		}else if ((color.equalsIgnoreCase(Colores.gris.toString()))){
			return true;
			
		}else if ((color.equalsIgnoreCase(Colores.negro.toString()))){
			return true;
			
		}else if((color.equalsIgnoreCase(Colores.blanco.toString()))) {
			return true;
		}
		
		return false;
	}

	public double getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
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
