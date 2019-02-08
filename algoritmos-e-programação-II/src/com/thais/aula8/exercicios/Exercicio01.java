package com.thais.aula8.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Digite o numero da base: ");
		int base=scan.nextInt();
		
		System.out.println("Digite o numero do expoente: ");
		int expoente=scan.nextInt();
		
		int potencia= gerarPotencia(base, expoente);
		
		System.out.println("A potencia e: "+potencia);
		

	}
	
	public static int gerarPotencia(int b, int e) {
		
		if(e==0) {
			return 1;
		}
		return b*gerarPotencia(b,e-1);
	}

}
