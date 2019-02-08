package com.thais.aula1.exercícios;

import java.util.Scanner;

public class Exercício3 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite um número natural: ");
		int num= scan.nextInt();
		
		while (num<0) {
			
			System.out.println("Digite um número natural: ");
			num= scan.nextInt();
		}
		
		int quadrado= calcularQuadrado(num);
		
		System.out.println("O quadrado do número "+num+" é: "+quadrado);
		

			
	}
	
	static int calcularQuadrado(int a) {
		
		int quadrado=0;
		int j=0;
	
		for (int i=1;;i++) {
			if (i%2!=0) {
				quadrado=quadrado+i;
				j++;
				
			} 
			 if(j==a) {
				break;
			}
			
		}
			
		
		return quadrado;
	}
	
}