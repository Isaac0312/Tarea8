
public class Persona {
	
	// 2 constantes para definir el sexo
	static final String Hombre = "H";
	static final String Mujer = "M";
	
	
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private int peso;
	private double altura;
	
	public Persona(String DNI) {
		this.nombre="";
		this.edad=0;
		this.peso=0;
		this.sexo=Hombre;
		this.altura=0;
		this.DNI=DNI;
	}
	
	public Persona(String nombre, int edad, String sexo,String DNI) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
		this.peso=0;
		this.altura=0;
		this.DNI=DNI;
	}
	
	public Persona(String nombre, int edad, int peso, String sexo, int altura,String DNI) {
		this.nombre=nombre;
		this.edad=edad;
		this.peso=peso;
		this.sexo=sexo;
		this.altura=altura;
		this.DNI=DNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public static String getHombre() {
		return Hombre;
	}

	public static String getMujer() {
		return Mujer;
	}
	
	
}
