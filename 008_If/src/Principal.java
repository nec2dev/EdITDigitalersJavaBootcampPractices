
public class Principal {

	public static void main(String[] args) {
		/**
		 * Condicionales: lo que se encuentra dentro de los par�ntesis debe retornar
		 * verdadero o falso por lo que se usan los Operadores Relacionales
		 * (Comparaci�n) vistos en la secci�n anterior o simplemente usando variables de
		 * tipo boolean
		 */

		System.out.println("Condicional simple: if");
		// podemos preguntar directamente sin declarar variables

		if (10 > 5) {
			System.out.println("Verdad, es mayor");
		}

		// usando variables dentro del condicional
		int num1 = 12, num2 = 6;

		if (num1 > num2) {
			System.out.println("Verdad," + num1 + " es mayor que " + num2);
		}

		// usando una variable de tipo boolean
		// se puede pensar que para este tipo if funcione se deber�a colocar
		// (if (variableBoolean == true)), pero al ser boolean no se necesita la
		// comparaci�n.
		boolean variableBoolean;
		variableBoolean = true;

		if (variableBoolean) {
			System.out.println("La variable es: " + variableBoolean);
		}

		// se puede usar el if sin las llaves cuando lo que deber�a estar dentro solo
		// contiene una sola instruccion
		if (variableBoolean)
			System.out.println("La variable es: " + variableBoolean);

	}

}