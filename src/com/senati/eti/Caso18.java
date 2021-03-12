package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Base: ");
		float base = sc.nextFloat();
		
		System.out.print("Altura: ");
		float altura = sc.nextFloat();
		
		float area = (base*altura/2);
		
		System.out.println("=========== resultados=============== ");
		System.out.println("Área del triángulo................: " + df.format(area)+ " u2") ;
		
		
		
		
		
	}

}
