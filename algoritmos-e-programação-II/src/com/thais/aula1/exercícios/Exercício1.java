package com.thais.aula1.exercícios;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num= scan.nextInt();
		
		boolean s= imparPar(num);
		
		if (s==true) {
			System.out.println("Esse número é par");
		}else {
			System.out.println("Esse número é ímpar");
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
