package com.thais.aula8.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite o numero natural: ");
		int num=scan.nextInt();
		
		gerarBinario(num);
		
	

	}
	
	
	
	public static void gerarBinario(int n) {
		
		if(n<2) {
			System.out.println(n);
		}else  {
			
			gerarBinario(n/2);
			System.out.println(n%2);

	}

}
	
}
