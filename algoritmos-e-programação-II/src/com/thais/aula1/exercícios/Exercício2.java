package com.thais.aula1.exercícios;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num1= scan.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int num2= scan.nextInt();
		
		int s= somaNumeros(num1, num2);
		
		System.out.println("A soma entre "+num1+" e "+num2+" é: \n"+s);
			
	}
	
	static int somaNumeros(int x, int y) {
		
		int soma=0;
		
		for(int i=x; i<=y;i++) {
			soma=soma+i;
		}
		return soma;
	}
	
}