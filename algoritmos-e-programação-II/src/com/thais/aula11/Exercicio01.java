package com.thais.aula11;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		Fila f=new Fila();
		
		System.out.println("Denominacao:" );
		String d= scan.nextLine();
		
		for(int i=0;i<d.length();i++) {
			if(Character.isUpperCase(d.charAt(i))){
				f.enqueue(d.charAt(i));
			}
		}
		
		System.out.println("Acronimo:");
		while(!f.isEmpty()) {
			char c=(char)f.dequeue();
			System.out.print(c);
		}
		
	}

}
