package com.thais.aula11;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Texto: ");
		String s= scan.nextLine();
		
		boolean exp=verificarExpressao(s);
		
	}
	
	static boolean verificarExpressao(String s) {
		
		Pilha p= new Pilha();
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)=='(') {
				p.push(s.charAt(i));
			}
			if(s.charAt(i)==')') {
				if(p.pop()==null) {
					return false;
				}else {
					p.pop();
				}
			}
		}return true;
	}

}

