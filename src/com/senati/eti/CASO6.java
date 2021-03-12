package com.senati.eti;

public class CASO6 {

	public static void main(String[] args) {
		// Aplicar CAST : Convertir un tipo de dato a otro
		
		int rp1 = (int)Math.pow(5, 3);
		
		float rp2 = (float)Math.pow(81, 1/2.0);
		
		float rp3 = (float)Math.pow(125, 1/3.0);

		float rp4 = (float)Math.pow(256, 1/4.0)+(float)Math.pow(25, 1/2.0);
		
		System.out.println("=========== ValoresIngresado ");
		System.out.println("Resultado 1..........: " + rp1);
		System.out.println("Resultado 2..........: " + rp2);
		System.out.println("Resultado 3..........: " + rp3);
		System.out.println("Resultado 4..........: " + rp4);

	}

}
