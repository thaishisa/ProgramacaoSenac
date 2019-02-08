package thais.algoritmos2.atividade3;

import java.util.Scanner;
/**
 * Uma  mensagem  é  criptografada  invertendo  cada  palavra  do  texto.  O  texto  “Uma   mensagem  confiden-
cial” criptografado fica “amU megasnem laicnedifnoc”. Utilizando a classe
Pilha.java
apresentada em aula,
implemente a criptografia e a decriptografia de mensagem.
Criar um programa que tenha o seguinte menu:
1 -  Criptografar Mensagem
2 -  Descriptografar Mensagem
0 -  Sai
 * @author thais
 *
 */

public class Exercicio01 {
	

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int opcao=1;
		
		while(opcao!=0) {
			
			System.out.println("");
			System.out.println("\n1) Criptografar Mensagem");
			System.out.println("2) Descriptografar Mensagem");
			System.out.println("0) Sair");
			System.out.println("\nDigite a opcao desejada: ");
			opcao= scan.nextInt();
			
			switch (opcao) {
			
			case 1:
				
				criptografar();
				
					break;
			case 2:
				
				descriptografar();
				
					break;

			case 0:
				
				opcao=0;
				break;
				
			}

		}

	}
	/**
	 * funcao para digitar mensagem
	 * @return
	 */
	static String digitarMensagem() {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Digite a mensagem: ");
		String mensagem= scan.nextLine();
		
		return mensagem;
	}
	
	
	/** 
	 * funcao de criptografia
	 */
	static void criptografar () {
		
		Pilha p=new Pilha();
		
		
		String mensagem= digitarMensagem();
		
		System.out.println("Criptografada: ");
		
		for (int i=0; i<mensagem.length();i++) {
			
			if(mensagem.charAt(i)!=' ') {
				p.push(mensagem.charAt(i));
			}else {
				
				while(!p.isEmpty());
				char c=(char)p.pop();
				System.out.print(c);
			
			}
		}	
	}
	
	/**
	 * funcao de descriptografia
	 */
	static void descriptografar () {
		Pilha p=new Pilha();
		
		
		String mensagem= digitarMensagem();
		
		System.out.println("Descriptografada: ");
		
		for (int i=0; i<mensagem.length();i++) {
			
			if(mensagem.charAt(i)!=' ') {
				p.push(mensagem.charAt(i));
			}else {
				
				while(!p.isEmpty());
				char c=(char)p.pop();
				System.out.print(c);
			
			}
		}
		
	}
		
	
			
			
	}

