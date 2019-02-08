package com.thais.aula10;

public class TestaPilha {

	public static void main(String[] args) {
		
		Pilha p=new Pilha();
		p.push(1);
		p.push(2);
		p.push(3);
		while(!p.isEmpty()) {
			int x=(int)p.pop(); // (int)p.pop() porque o valor retornado pelo pop e um tipo object
			//o (int) e para fazer a conversao de valores
			System.out.print(x+" ");
		}
	}

}
