package cl.inacap.agenda;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

	static List<String> nombres = new ArrayList<>(); //Creación de la lista.
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		String respuesta;
		//Proceso de ingreso de datos a la agenda.
		do {
			System.out.println("Ingrese nombre del contacto");
			String Nombre = sc.nextLine().trim(); //Pide ingresar el nombre de la persona.
			nombres.add(Nombre); //Añade el nombre anteriormente ingresado a la lista llamada Nombres (Automaticamente se generan los indices).
			System.out.println("¿Desea ingresar otro? (Si/No)");
			respuesta = sc.nextLine().trim().toLowerCase();
		} while (respuesta.equalsIgnoreCase("si"));
		
		System.out.println("Cantidad de nombres:" + nombres.size()); //Imprime el largo de la lista.
		
		for (int i = 0; i < nombres.size(); ++i) {
			System.out.println("Indice [" + i + "] " + nombres.get(i)); //Imprime todos los indices de la lista.
		}
		
		System.out.println("Ingrese el indice de la persona a eliminar:");
		int posicion = Integer.parseInt(sc.nextLine().trim());
		nombres.remove(posicion); //Elimina el dato que está almacenado en dicho indice (Al eliminar un indice todos se ordenan).
		System.out.println("Personas en la lista");
		for (int i = 0; i < nombres.size(); ++i) {
			System.out.println("Indice [" + i + "] " + nombres.get(i)); //Imprime en pantalla todos los indices de la lista.
		}
		
		System.out.println("¿Esta Daniel en la lista? " + nombres.contains("Daniel")); //Retorna un booleano si el dato del argumento existe o no dentro de la lista.
		System.out.println("La posicion de Daniel es: " + nombres.indexOf("Daniel")); //Busca en la lista Nombres la posición del argumento que le entregamos.

	}
}
