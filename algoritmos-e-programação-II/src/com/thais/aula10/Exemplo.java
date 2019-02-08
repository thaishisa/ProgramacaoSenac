package com.thais.aula10;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int n,r;
		
		Pilha p= new Pilha();
		System.out.println("Numero natural: ");
		n=scan.nextInt();
		
		do {
			r=n%2;
			p.push(r);
			n=n/2;
		}while (n!=0);
		
		System.out.println("Em binario: ");
		while(!p.isEmpty()) {
			r=(int)p.pop();
			System.out.print(r);
		}
		

	}

}
