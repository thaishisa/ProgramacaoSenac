package com.thais.aula4;

public class ExemploRetangulo2 {

	public static void main(String[] args) {
		
		Retangulo r1= new Retangulo();
		Retangulo r2=new Retangulo(3.0f);
		Retangulo r3=new Retangulo (2.5f,6.3f);
		
		System.out.println("Base: "+r3.base+" Altura: "+r3.altura);
		
		//System.out.println(r1.getBase());
		//System.out.println(r1.getAltura());
		//r1.setBase(3);
		//r1.setAltura(5);
	}

}
