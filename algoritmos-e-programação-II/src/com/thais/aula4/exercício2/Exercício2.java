package com.thais.aula4.exercício2;

public class Exercício2 {

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
