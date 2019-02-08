package com.thais.aula11;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Texto: ");
		String s= scan.nextLine();
		
		if(isPalindromo(s.toUpperCase())) {
			System.out.println("Palindromo!");
			
		}else {
			System.out.println("Nao e palindromo!");
		}
	}
	
	static boolean isPalindromo(String s) {
		
		Pilha p= new Pilha();
		Fila f= new Fila();
		for(int i=0; i<s.length();i++) {
			char c=  s.charAt(i);
			if(c!= ' ') {
				p.push(c);
				f.enqueue(c);
			}
		}
		while(!p.isEmpty()) {
			if(p.pop()!=f.dequeue()) {
				return false;
			}
			
		}return true;
	}

}
