package com.thais.aula4.exerc�cio2;

public class Exerc�cio2 {

	public static void main(String[] args) {
		
		Contador c1=new Contador();
		System.out.println("Contador 1: "+ c1.getValor());
		c1.incrementar();
		c1.incrementar();
		c1.incrementar();
		System.out.println("Contador 1: "+c1.getValor());
		c1.zerar();
		System.out.println("Contador 1: "+c1.getValor());

	}

}
