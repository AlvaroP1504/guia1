package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Producto: ");
		String nombre = sc.nextLine() ;
		
		System.out.print("Precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		float importe = precio * cantidad;
		float igv = (float) (importe * 0.18);
		float descuento = (float) (importe *0.03);
		float total = importe - descuento + igv ;
		
		System.out.println("=========== resultados===============");
		System.out.println("\nImporte.................: " +"S/ "+ df.format(importe));
		System.out.println("IGV.....................: " +"S/ "+ df.format(igv));
		System.out.println("Descuento...............: " +"S/ "+ df.format(descuento));
		System.out.println("\nTOTAL A PAGAR...........: " +"S/ "+ df.format(total));



	}

}
