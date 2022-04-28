package prueba1;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		int num1, num2, result;
		

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca el primer numero");
		num1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo número");
		num2 = sc.nextInt();
		
		
		result = num1 + num2;
		System.out.println("El resultado de la suma es:" + result);

		
		System.out.println("Nueva línea.");
		
	}

}
