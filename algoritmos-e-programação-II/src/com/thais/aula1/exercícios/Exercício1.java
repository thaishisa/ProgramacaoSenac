package com.thais.aula1.exerc�cios;

import java.util.Scanner;

public class Exerc�cio1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int num= scan.nextInt();
		
		boolean s= imparPar(num);
		
		if (s==true) {
			System.out.println("Esse n�mero � par");
		}else {
			System.out.println("Esse n�mero � �mpar");
		}	
	}
	
	static boolean imparPar(int x) { //ehPar(int x)
		
		boolean s= false;
		if (x%2==0) {
			s=true;	
		}
		return s;
	}

}
