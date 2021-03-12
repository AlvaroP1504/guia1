package com.senati.eti;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo número: ");
		n2 = sc.nextFloat();
		
		float suma = n1 + n2;
		float resta = n1 - n2;
		float producto = n1 * n2;
		float division = n1 / n2;
		float resto = n1 % n2;
		 System.out.println("=========== ValoresIngresado ");
		 System.out.println("Número 1..........: " + suma);
		 System.out.println("Número 2..........: " + resta);
		 System.out.println("Número 3..........: " + producto);
		 System.out.println("Número 4..........: " + division);
		 System.out.println("Número 5..........: " + resto);
	}

}
