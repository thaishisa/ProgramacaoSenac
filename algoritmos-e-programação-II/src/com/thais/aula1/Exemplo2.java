package com.thais.aula1;

public class Exemplo2 {

	public static void main(String[] args) {
		
		int s= soma1a10();
		System.out.println(" A soma de 1 a 10 é: "+s);
	}
	
	static int soma1a10() {
		
		int soma=0;
		for (int i=1; i<=10;i++) {
			soma=soma+i;
		}
		
		return soma;
	}

}
