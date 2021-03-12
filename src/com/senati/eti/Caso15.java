package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Cantidad : ");
		int cantidad = sc.nextInt();
		
		System.out.print("Ingrese Precio : ");
		float precio = sc.nextFloat();
		
		float importe = cantidad * precio;
		
		float dolar =(float) (importe / 3.24);
		
		float euro =(float) (importe / 3.75);
		
		System.out.println("=========== resultados=============== ");
		System.out.println("Importe...........: " + df.format(importe)) ;
		System.out.println("En Dolares........: " + df.format(dolar) );
		System.out.println("En Euros..........: " + df.format(euro) );
	}

}
