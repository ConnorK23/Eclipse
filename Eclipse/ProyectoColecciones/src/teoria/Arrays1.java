package teoria;

public class Arrays1 {

	public static void main(String[] args) {
		//creo la coleccion
		int[] coleccionEnteros = new int[3];
		//a�adimos elementos a la coleccion
		coleccionEnteros[0] = 1;
		coleccionEnteros[1] = 2;
		coleccionEnteros[2] = 3;
		//recorremos la coleccion
		for (int i = 0; i < coleccionEnteros.length; i++) {
			System.out.println(coleccionEnteros[i]);
		}
		//otra forma de recorrer la coleccion
		for (int i : coleccionEnteros) {
			System.out.println(i);
		}
		
		//coleccion de cadenas
		String[] coleccionCadenas = new String [4];
		coleccionCadenas[0] = "hola";
		coleccionCadenas[1] = " ";
		coleccionCadenas[2] = "mundo";
		coleccionCadenas[3] = "\n";
		//recorremos la coleccion
		for (String cadena : coleccionCadenas) {
			System.out.print(cadena);
		}
		//crear una coleccion de doubles inicializada
		double[] coleccionDouble = {1.2, 1.5, -23.65, 0.005, 7};
		//recorremos la coleccion
		for (double d : coleccionDouble) {
			System.out.printf("%9.3f", d );
		}
	}

}
