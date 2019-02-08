package com.thais.aula11;

public class TesteFila {

	public static void main(String[] args) {
		
		Fila f=new Fila();
		
		f.enqueue('a');
		f.enqueue('b');
		f.enqueue('c');
		while(!f.isEmpty()) {
			char x= (char)f.dequeue();
			System.out.println(x);
		}

	}

}
