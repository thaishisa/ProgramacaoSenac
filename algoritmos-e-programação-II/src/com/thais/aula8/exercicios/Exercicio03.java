package com.thais.aula8.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite o qual termo gostaria de receber: ");
		int termo=scan.nextInt();
		
		int fibonnaci=gerarFibonacci(termo);
		
		System.out.println("O valor do termo "+termo+" é: "+fibonnaci);

	}
	
	
	
	public static int gerarFibonacci(int n) {
		
		if(n==0 ) {
			return 0;
		}else if (n==1) {
			return 1;
		}
		return gerarFibonacci(n-1)+gerarFibonacci(n-2);

	}

}
