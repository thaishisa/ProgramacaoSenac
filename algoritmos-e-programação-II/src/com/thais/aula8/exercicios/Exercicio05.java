package com.thais.aula8.exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		
		System.out.println("MDC= "+mdc(15,9));

	}
	
	static int mdc(int m, int n) {
		if (n>m) {
			return mdc(n,m);
		}
		if(n==0) {
			return m;
		}
		return mdc(n, m%n);
	}

}
