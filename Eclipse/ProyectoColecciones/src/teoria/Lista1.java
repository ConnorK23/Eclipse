package teoria;

import java.util.ArrayList;
import java.util.List;

public class Lista1 {

	public static void main(String[] args) {
		//creamos la lista vacia
		List<String> listaCadenas = new ArrayList<String>();
		System.out.printf("Tamaño de la lista %d%n", listaCadenas.size());
		listaCadenas.add("Joaquin");
		listaCadenas.add("Luis");
		listaCadenas.add("Fernando");
		listaCadenas.add("Wenceslao");
		System.out.printf("Tamaño de la lista %d%n", listaCadenas.size());
		System.out.printf("Primer elemento de la lista: %s%n", listaCadenas.get(0));
		System.out.printf("Ultimo elemento de la lista: %s%n", listaCadenas.get(listaCadenas.size()-1));
		System.out.printf("%s%n", listaCadenas);
		listaCadenas.add(0, "Rodrigo");
		System.out.printf("%s%n", listaCadenas);
		listaCadenas.remove(0);
		System.out.printf("%s%n", listaCadenas);
		listaCadenas.remove("Luis");
		System.out.printf("%s%n", listaCadenas);
		//recorremos las listas
		for (String string : listaCadenas) {
			System.out.println(string);
		}
	}
}
