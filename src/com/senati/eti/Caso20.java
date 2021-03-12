package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Precio de Costo: ");
		float costo = sc.nextFloat();
		
		System.out.print("Ganancia deseada: ");
		float ganancia = sc.nextFloat();
		
		float p_venta = (float)((float)(costo + ganancia)*1.42);
		
		System.out.println("=========== resultados===============");
		System.out.println("\nPrecio de venta................: " +"S/" +df.format(p_venta)) ;
	
	}

}
