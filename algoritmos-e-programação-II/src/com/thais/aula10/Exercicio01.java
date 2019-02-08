package com.thais.aula10;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		Pilha p= new Pilha();
		System.out.println("Texto: ");
		String s= scan.nextLine();
		
		for (int i=0;i<s.length();i++) {
			p.push(s.charAt(i));
		}
		
		System.out.println("Texto invertido: ");
		
		while(!p.isEmpty()) {
			char c=(char)p.pop();
			System.out.print(c);
		}
		System.out.println("");

	}

}
