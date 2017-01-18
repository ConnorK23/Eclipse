package teoria;

import java.util.ArrayList;
import java.util.List;

public class Lista2 {

	public static void main(String[] args) {
		//creamos la lista vacia
				List<Integer> listaNumeros = new ArrayList<Integer>();
				System.out.printf("Tamaño de la lista %d%n", listaNumeros.size());
				listaNumeros.add(1);
				listaNumeros.add(2);
				listaNumeros.add(3);
				listaNumeros.add(4);
				System.out.printf("Tamaño de la lista %d%n", listaNumeros.size());
				System.out.printf("Primer elemento de la lista: %s%n", listaNumeros.get(0));
				System.out.printf("Ultimo elemento de la lista: %s%n", listaNumeros.get(listaNumeros.size()-1));
				System.out.printf("%s%n", listaNumeros);
				listaNumeros.add(0, 5);
				System.out.printf("%s%n", listaNumeros);
				listaNumeros.remove(0);
				System.out.printf("%s%n", listaNumeros);
				listaNumeros.remove("Luis");
				System.out.printf("%s%n", listaNumeros);
				//recorremos las listas
				for (Integer integer : listaNumeros) {
					if (integer % 2 == 0)
						System.out.printf("Los numeros pares de esta lista son: %s%n", integer);
				}
				//recorremos las listas
				for (Integer integer : listaNumeros) {
						System.out.println(integer);
				}
					
		

	}

}
