package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingresos: ");
		float ingresos = sc.nextFloat();
		
		System.out.print("Ganancia Neta: ");
		float gananciaNeta = sc.nextFloat();
		
		float gasto = (float) ((ingresos - gananciaNeta)*0.88);
		
		System.out.println("=========== resultados===============");
		System.out.println("\nGasto................: " +"S/" + df.format(gasto)) ;
	}

}
