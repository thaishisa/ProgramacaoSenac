package com.thais.aula4.exercício3;

public class Aluno {

	private String nome;
	private float nota1;
	private float nota2;
	private float nota3;
	
	public Aluno(String n) { //public Aluno (String nome) se eu quiser usar o parametro com o mesmo nome do atributo
		nome=n;				 //this.nome = nome; 		  tenho que usar o "this." antes para diferenciar a atribuicao de um e de outro
	}
	
	public Aluno(String n, float n1,float n2,float n3) {
		nome=n;
		nota1=n1;
		nota2=n2;
		nota3=n3; 
	}
	
	public float calcularMedia() {
		return ((nota1+nota1+nota3)/3);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public float getNota1() {
		return nota1;
	}
	
	public void setNota1(float nota1) {
		this.nota1=nota1;
	}
	
	public float getNota2() {
		return nota2;
	}
	
	public void setNota2(float nota2) {
		this.nota2=nota2;
	}
	
	public float getNota3() {
		return nota3;
	}
	
	public void setNota3(float nota3) {
		this.nota3=nota3;
	}
	
	public void imprimirResultado() {
		if (calcularMedia()>=6.0f) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
}
