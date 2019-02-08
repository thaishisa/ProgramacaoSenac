package com.thais.aula4;

public class ExemploRetangulo {

	public static void main(String[] args) {
		
		/*Variavel referencia para o Retangulo*/
		Retangulo r1=new Retangulo();
		Retangulo r2= new Retangulo();
		//Retangulo(tipo do dado) r2(variavel referencia)=new (cria o objeto) Retangulo() (metodo construtor de mesmo nome da classe)
		//se eu nao inicializar com o new, Retangulo r1; a variavel r1 está como null e nao aponta para lugar nenhum 
		//aparecera o nullPointerException
		r1.base=3;
		r1.altura=5;
		r2.base=4;
		r2.altura=2;
		System.out.println(r1.base);
		//Retangulo r2=r1;
		//ele não está criando um novo objeto, mas sim fazendo a variavel r2 apontar para o mesmo endereço de memoria que r1
		//se eu modificar posteriormente o r2.base ou r2.altura o objeto se modificará e portanto r1.base e r1.altura tambem
		
		float a1=r1.calcularArea();
		System.out.println("Area: "+a1);
		
	}

}
