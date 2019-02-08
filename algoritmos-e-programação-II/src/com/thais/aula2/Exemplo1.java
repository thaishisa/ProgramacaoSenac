package com.thais.aula2;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		int [] vet= {10,20,30,40,50,60};
		
		apresentarVetor(vet);
		
		int soma= somarVetor(vet);
		
		System.out.println("\n Soma = "+soma);

	}
	
	static void apresentarVetor(int []vetor) {
		
		for(int i=0; i<vetor.length;i++) {
			System.out.println(vetor[i]+ " ");
			
		}
	}
	
	static int somarVetor(int []vetor) {
	
		int soma=0;
		
		for (int i=0; i<vetor.length;i++) {
			soma=soma+vetor[i];
		}
	 return soma;
	}

}
