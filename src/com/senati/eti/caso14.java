package com.senati.eti;

import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número........: ");
		int n = sc.nextInt();
		
		int sumatoria =  ( n * (n + 1))/ 2;
		
		System.out.println("=========== resultados=============== ");
		System.out.println("Sumatoria...............: " + sumatoria );
		
		
	}

}
