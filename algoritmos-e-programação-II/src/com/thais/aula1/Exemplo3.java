package com.thais.aula1;

import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num= scan.nextInt();
		
		int s= soma1aN(num);
		System.out.println("A soma de 1 a "+num+" é: "+s);
		
	}
	
	static int soma1aN(int x) {
		
		int soma=0;
		for (int i=1;i<=x; i++) {
			soma=soma+i;
		}
		
		return soma;
	}

}
