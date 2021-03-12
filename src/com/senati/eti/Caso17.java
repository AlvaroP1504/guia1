package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Número de aprobados: ");
		int aprobados = sc.nextInt();
		
		System.out.print("Número de desaprobados: ");
		int desaprobados = sc.nextInt();
		
		System.out.print("Número de retirados: ");
		int retirados = sc.nextInt();
		
		float totalAlum =aprobados + desaprobados + retirados;
		
		float porAprobados = ((aprobados/totalAlum)*100);
		float porDesaprobados = ((desaprobados/totalAlum)*100);
		float porRetirados = ((retirados/totalAlum)*100);
		
		System.out.println("=========== resultados=============== ");
		System.out.println("Aprobados................: " + df.format(porAprobados)+"%") ;
		System.out.println("Desaprobados.............: " + df.format(porDesaprobados)+"%");
		System.out.println("Retiradoss...............: " + df.format(porRetirados)+"%");	
		
	}

}
