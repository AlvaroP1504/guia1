package com.senati.eti;

import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1 : ");
		int lado1 = sc.nextInt();
		
		System.out.print("Ingrese lado 1 : ");
		int lado2 = sc.nextInt();
		
		int area = lado1 * lado2;
		int perimetro = 2*(lado1 + lado2);
		
		System.out.println("=========== resultados=============== ");
		System.out.println("Área...............: " + area);
		System.out.println("Perímetro..........: " + perimetro);

	}

}
