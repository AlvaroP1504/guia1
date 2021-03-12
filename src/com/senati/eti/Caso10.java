package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1 : ");
		int radio = sc.nextInt();
		
		
		float area = (float) 3.1416 * (int)Math.pow(radio,2);
		float perimetro =(float)((float) 2 * 3.1416 * (radio));
		
		System.out.println("=========== resultados=============== ");
		System.out.println("Área...............: " + area);
		System.out.println("Perímetro..........: " + perimetro);

	}

}
