import java.util.Scanner;
public class Principal {
	
	static int Sumar(int num1, int num2) {
		int resultado;
		resultado = num1+num2;
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Ingrese un n�mero entero: ");
		num1 = scanner.nextInt();
		System.out.println("Ingrese un segundo n�mero entero: ");
		num2 = scanner.nextInt();
		
		System.out.println("La suma de los dos n�meros ingresado es: " + Sumar(num1, num2));
		scanner.close();
	}
	
}
