package com.thais.aula10;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Expressao PosFixa: ");
		String exp= scan.nextLine();
		System.out.println("Resultado: "+calcular(exp));
		

	}
	
	static int calcular(String exp) {
		Pilha p=new Pilha();
		for (int i=0; i<exp.length();i++) {
			if(exp.charAt(i)=='+') {
				int a=(int)p.pop();
				int b=(int)p.pop();
				p.push(a+b);
			}
			if(exp.charAt(i)=='*') {
				int a=(int)p.pop();
				int b=(int)p.pop();
				p.push(a*b);
			}
			if(exp.charAt(i)>='0'&& exp.charAt(i)<='9') {
				p.push(Character.getNumericValue(exp.charAt(i)));
				i++;
			}
			while (exp.charAt(i)>='0'&& exp.charAt(i)<='9') {
				int a=(int)p.pop()*10+ Character.getNumericValue(exp.charAt(i));
				p.push(a);
				i++;
			}
		}
		return (int)p.pop();
	}

}
