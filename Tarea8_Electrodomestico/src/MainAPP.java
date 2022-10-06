public class MainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Electrodomestico aux = new Electrodomestico(1,"rojo","n",5);
		//Ahora nos mostrara por pantalla que el consumo electrico no es el correcto y dejara el por defecto
		
		Electrodomestico aux1 = new Electrodomestico(3,"negro","A",10);
		Electrodomestico aux2 = new Electrodomestico(3,"negro","a",10);
		//Ahora no nos mostrara nada por pantalla independientemente de si la letra es uppercase o lowercase
		
		//Aqui vamos a hacer pruebas con lo de los colores, si por ejemplo le asignamos un color del enum
		Electrodomestico aux3 = new Electrodomestico(3,"azul","a",10);
		System.out.println(""+aux3.getColor());
		
		//Nos devolvera el color correcto, en cambio si ponemos un color que no esta dentro del enum...
		Electrodomestico aux4 = new Electrodomestico(3,"violeta","a",10);
		System.out.println(""+aux4.getColor());
		//Nos devolvera que tiene el color blanco por defecto
		
	}

}
