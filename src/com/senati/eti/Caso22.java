package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Apellidos y nombres: ");
		String nombre = sc.nextLine() ;
		
		System.out.print("Nota 1: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Nota 2: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Nota 3: ");
		float nota3 = sc.nextFloat();
		
		float promedio = (float) ((nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.5));
		
		System.out.println("=========== resultados===============");
		System.out.println("\nPromedio................: " + df.format(promedio)) ;
	}

}
