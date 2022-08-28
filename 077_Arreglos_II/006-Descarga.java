import java.util.Arrays;
/**
 * @author EducacionIT
 * @class Principal
 * @date 10 jun. 2020
 */
public class Principal {

	public static void main(String[] args) {
		/**
		 * Arreglos
		 */
		// Declaracion del Arreglo con valores
		String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

		// Declaracion del Arreglo sin valores con tamano inicial y darle valores

		int[] diaNumeros = new int[7];

		diaNumeros[0] = 1;
		diaNumeros[1] = 2;
		diaNumeros[2] = 3;
		diaNumeros[3] = 4;
		diaNumeros[4] = 5;
		diaNumeros[5] = 6;
		diaNumeros[6] = 7;
		
		int[] numeros = {2,4,5,8,9,6};

		// imprimir los valores del vector
		System.out.println("dia de la semana en letras " + diasSemana[0] + ", en numero " + diaNumeros[0]);

		System.out.println("dia de la semana en letras " + diasSemana[3] + ", en numero " + diaNumeros[3]);

		// imprimir los valores del vector usando bucles
		System.out.println("Usando Bucles para recorrer el Vector");
		for (int i = 0; i < diaNumeros.length; i++) {
			System.out.println("dia de la semana en letras " + diasSemana[i] + ", en numero " + diaNumeros[i]);
		}
		
		//ordenamos el arreglo de semanas
		Arrays.sort(diasSemana);
		
		//imprimimos el arreglo en una sola linea 
		System.out.println(Arrays.toString(diasSemana));
		
		//comparamos arreglos
		System.out.println(Arrays.equals(numeros, diaNumeros));

	}

}
