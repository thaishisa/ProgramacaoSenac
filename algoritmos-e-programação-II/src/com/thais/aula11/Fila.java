package com.thais.aula11;

public class Fila {
	
	private int inicio;
	private int fim;
	private Object []dados;
	
	public Fila() {
		dados=new Object[50];
		inicio=0;
		fim=0;
	}
	
	public boolean isEmpty() {
		return (fim==inicio);
	}
	
	public boolean isFull() {
		return (fim+1)%dados.length==inicio;
	}
	
	public void enqueue(Object x) {
		
		if(!isFull()) {
		
			dados[fim]=x;
			fim++;
			if(fim==dados.length) {
				fim=0;
			}
		}
	}
	public Object dequeue() {
		
		if(!isEmpty()) {
		
			Object x=dados[inicio];
			inicio++;
			if(inicio==dados.length) {
				inicio=0;
				
			}return x;
			
		}return null;
	}
	
	

}
