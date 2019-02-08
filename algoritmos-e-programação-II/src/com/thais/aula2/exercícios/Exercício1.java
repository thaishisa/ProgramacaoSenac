package com.thais.aula2.exercícios;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		int [] vetores= new int[10];
		
		for(int i=0; i<vetores.length;i++) {
			System.out.println("Valor "+(i+1)+" : ");
			vetores[i]= scan.nextInt();
		}
		
		trocarValores(vetores);
		
		for(int i=0;i< vetores.length;i++) {
			System.out.println("Valor "+(i+1)+" : "+vetores[i]);
		}
	}
	
	static void trocarValores (int [] vetor) {
		 
		for(int i=0; i<vetor.length;i++) {
			
			if (vetor[i]%2==0) {
				vetor[i]=0;
			}else {
				vetor[i]=1;
			}
		}	
	}

}
