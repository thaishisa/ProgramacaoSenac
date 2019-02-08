package com.thais.aula4.exercício1;
/**
 * Classe que representa uma lampada
 * @author Thais Lima
 *
 */

public class Lampada {
	
	private boolean acesa;//quando voce nao inicializa a variavel boolean ela é false
	
	public Lampada() {
		acesa=false;
	}
	
	public void desligar() {
		acesa=false;
	}
	
	public void ligar() {
		acesa= true;
	}
	public void imprimirEstado() {
		if (acesa==true) {
			System.out.println("Lampada acesa");
		}else {
			System.out.println("Lampada apagada");
		}
	}
	
	
	

}
