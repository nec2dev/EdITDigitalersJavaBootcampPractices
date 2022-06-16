
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Casteo Implicito
		 */

		// un byte el elemento numerico mas pequeño en Java
		byte miByte = 37;
		System.out.println(miByte);
		short miShort = miByte;
		System.out.println(miShort);
		int miInt = miShort;
		System.out.println(miInt);
		long miLong = miInt;
		System.out.println(miLong);
		float miFloat = miLong;
		System.out.println(miFloat);
		double miDouble = miFloat;
		System.out.println(miDouble);
		// un caracter tambien representa un numero entero ASCII por lo que podemos igualar un numerico a un caracter
		char miChar = 'P';

		miDouble = miChar;

		System.out.println("Casteo Implicito");

		System.out.println(miInt);

		System.out.println(miDouble);

		/*
		 * Casteo Explicito
		 */
		System.out.println("");
		System.out.println("");
		System.out.println("");
		// un double el elemento numerico mas grande en Java
		double miDouble2 = 5642.9856998613232313213213123302156464;
		System.out.println(miDouble2);
		float miFloat2 = (float) miDouble2;
		System.out.println(miFloat2);
		long miLong2 = (long) miFloat2;
		System.out.println(miLong2);
		int miInt2 = (int) miLong2;
		System.out.println(miInt2);
		short miShort2 = (short) miInt2;
		System.out.println(miShort2);
		byte miByte2 = (byte) miShort2;
		System.out.println(miByte2);
		char miChar2 = (char) miInt2;
		System.out.println(miChar2);
		System.out.println("Casteo Explicito");

		System.out.println(miByte2);

		System.out.println(miChar2);
	}

}
