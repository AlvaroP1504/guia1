package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas: ");
		float horas = sc.nextFloat();
		
		System.out.print("Ingrese Tarifa por Hora: ");
		float tarifa = sc.nextFloat();
		
		float sueldo = horas * tarifa;
		
		float bono = (float)(sueldo * 0.05) ;
		
		float total = sueldo + bono;
		
		float tDolar = (float)(total / 3.24);
		
		System.out.println("=========== resultados=============== ");
		System.out.println("Sueldo..............: " + df.format(sueldo)) ;
		System.out.println("Bono................: " + df.format(bono) );
		System.out.println("Total...............: " + df.format(total) );	
		System.out.println("Total en dólares....: " + df.format(tDolar) );
	}

}
