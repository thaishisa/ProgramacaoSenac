package com.thais.aula8.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
			
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite o qual termo gostaria de receber: ");
		int termo=scan.nextInt();
		
		int padovan=gerarPadovan(termo);
		
		System.out.println("O valor do termo "+termo+" é: "+padovan);

	}
	
	
	
	public static int gerarPadovan(int n) {
		
		if(n<=2) {
			return 1;
		}
		return gerarPadovan(n-2)+gerarPadovan(n-3);

	}

}
