package com.thais.aula4.exercício3;

public class Exercício3 {

	public static void main(String[] args) {
		
		Aluno a1=new Aluno("Ale");
		a1.setNota1(4.5f);
		a1.setNota2(5.0f);
		a1.setNota3(3.4f);
		System.out.println(a1.getNome());
		System.out.println(a1.calcularMedia());
		a1.imprimirResultado();

	}

}
