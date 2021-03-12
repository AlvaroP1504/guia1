package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
			
		System.out.print("monto 1: ");
		float monto1 = sc.nextFloat();
		
		System.out.print("monto 2: ");
		float monto2 = sc.nextFloat();
		
		System.out.print("monto 3: ");
		float monto3 = sc.nextFloat();
		
		float sol1 = (float) ((monto1 + monto2)*0.2);
		
		float sol2 = (float) (monto3 * 0.8) ;
		
		float sol3 = (float) ((monto1 + monto2 + monto3)*0.92) ;
		
		System.out.println("=========== resultados===============");
		System.out.println("\nSolución 1................: " +"S/ "+ df.format(sol1)) ;
		System.out.println("Solución 2................: " +"S/ "+ df.format(sol2)) ;
		System.out.println("Solución 3................: " +"S/ "+ df.format(sol3)) ;

	}

}
