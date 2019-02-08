package com.thais.aula10;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
	Scanner scan= new Scanner (System.in);
	Pilha p=new Pilha();
	
	for (int i=0; i<15;i++) {
		
		
		System.out.println("Digite um numero: ");
		int n=scan.nextInt();
		
		if (n%2==0) {
			p.push(n);
		}else {
			p.pop();
		}
	}
	while(!p.isEmpty()) {
		int n=(int)p.pop();
		System.out.print(n+" ");
	}

	}

}
