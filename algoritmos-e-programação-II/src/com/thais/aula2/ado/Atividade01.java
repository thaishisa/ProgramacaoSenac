package com.thais.aula2.ado;

import java.util.Scanner;

/**
 * Criar um programa para o gerenciamento de uma lista de nomes.
 * O nomes devem ser armazenados em um vetor do tipo String de tamanho 50.
 * 
 * @author Thais Lima dos Santos, aluna de Engenharia da Computacao, ALGORITMOS E PROGRAMACAO II
 */

public class Atividade01 {
	/**
	 * A funcao main e responsavel pela exibicao do menu e pedir que o usuario escolha uma das opcoes presentes no mesmo
	 * @param args
	 */

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		String [] nomes = new String[50];
		
		int opcao;
		
		for (int i=1, j=0;;i++) {
			
			System.out.println("\n1) Adicionar um novo nome");
			System.out.println("2) Apresentar os nomes");
			System.out.println("3) Pesquisar um nome");
			System.out.println("4) Remover um nome");
			System.out.println("0) Sair");
			System.out.println("\nDigite a opcao desejada: ");
			opcao= scan.nextInt();
			
			switch (opcao) {
			
			case 1:
				
				boolean cheia= verificarCheio(nomes);
				
				if (cheia==true){
					System.out.println("A fila esta cheia!");
					break;
				}
				
				adicionarNome(nomes);
				
				break;
				
			case 2:
				
				boolean vazia=verificarVazio(nomes);
				
				if(vazia==true) {
					
					System.out.println("A fila esta vazia!");
					break;
				}
				
				apresentarNome(nomes);
				
				break;
				
			case 3:
				
				pesquisarNome(nomes);
				
				break;
				
			case 4:
				
				removerNome(nomes);
				
				break;
				
			case 0:
				
				return;
				
			}
			
		}

	}
	
	/**
	 * A funcao verificarCheio verifica se a fila de nomes esta cheia e retorna true para a main se estiver cheia.
	 * Percorre a lista e verifica se todas as posicoes do vetor sao diferentes de null, se sim ela esta cheia.
	 * Recebe como parametro o vetor de String nomes e retorna um boolean true se cheia e false se ainda nao esta cheia. 
	 * @param nomes
	 * @return cheia
	 */
	static boolean verificarCheio (String [] nomes) {
	
		boolean cheia=false;
		int j=0;
	
		for (int i=0; i<nomes.length;i++) {
		
			if(nomes[i]!=null) {
				
				j++;
			
			}
		}
	
		if(j==(nomes.length-1)) {
			
			cheia=true;
			
		}
	
		return cheia;
	
	}
	/**
	 * A funcao adicionarNome adiciona o nome digitado pelo usuario na ultima posicao "livre" do vetor.
	 * A funcao adicionarNome utiliza a funcao verificarIgual para identificar se o nome digitado
	 * pelo usuario existe ou nao na fila, se ja existir o usuario deve digitar um nome novo enquanto esse houver um igual a ele na fila.
	 * Recebe como parametro o vetor de String nomes e nao retorna nenhum valor.
	 * @param nomes
	 * 
	 */
	
	static void adicionarNome(String []nomes) {
		
		Scanner scan= new Scanner(System.in);
		
		String nome;
		int posicao=0;
		
		for (int i=0, j=0; i<nomes.length && j!=1;i++) {
			
			if (nomes[i]==null) {
				
				nomes[i]=digitarNome();
				nome=nomes[i];
				posicao=i;
				
				if(i==0) {
					
					nomes[i]=null;	
				}
				
				int igual= verificarIgual(nomes,nome,posicao);
				
				while (igual!=-1) {
						
					nomes[i]=null;
						
					System.out.println("Esse nome ja existe em nossa lista");
						
					nomes[i]=digitarNome();
					nome=nomes[i];
					posicao=i;
						
					igual= verificarIgual(nomes,nome,posicao);
						
				}
					
				j++;
				nomes[i]=nome;
			}
			
		}
		
	}
	
	/**
	 * Verifica se o nome digitado pelo usuario ja existe em alguma posicao do vetor.
	 * Recebe como parametro o vetor de String de 50 posicoes, a string com o nome que deseja verificar se ja existe no vetor 
	 * e o ultimo parametro se refere ate que posicao deve-se percorrer para verificar se ja existe um nome igual a string digitada pelo usuario no vetor.
	 * Retorna a variavel igual, se o nome digitado ja existir na lista, a variavel retorna a posicao em que esse nome se encontra,
	 * caso contrario retorna o valor -1 indicando que o nome digitado nao existe na lista.
	 * @param nomes
	 * @param nome
	 * @return igual
	 */
	static int verificarIgual (String []nomes, String nome,int j) {
		
		int igual=-1;
		
		for(int i=0;i<j;i++) {
			
			if (nome.equalsIgnoreCase(nomes[i])){
				
				igual=i;
			
			}
		}
		return igual;
	}
	
/**
 * Verifica se a lista de nomes esta vazia, retornando true se a lista estiver vazia.
 * Percorre a lista e verifica se todas as posicoes do vetor sao diferentes de null, se todas forem null a lista esta vazia.
 * Recebe como parametro o vetor de String nomes e retorna um boolean true se vazia e false se houver pelo menos uma posicao do vetor preenchida.
 * @param nomes
 * @return vazia
 */
	static boolean verificarVazio (String []nomes) {
	
		boolean vazia=false;
		int j=0;
	
		for (int i=0; i< nomes.length;i++) {
			
			if(nomes[i]!=null) {
				
				j++;
			
			}
		}
		
		if(j==0) {
			
			vazia=true;
		}
		
		return vazia;
	}
	/**
	 * Esta funcao percorre o vetor de nomes e apresenta os valores que ja existem no mesmo.
	 * Recebe como parametro o vetor de String nomes e nao retorna nenhum valor.
	 * @param nomes
	 */
	
	static void apresentarNome(String []nomes) {
		
		for(int i=0;i<nomes.length;i++) {
			
			if(nomes[i]!=null) {
				
				System.out.println("Nome "+(i+1)+" : "+nomes[i]);
			}
		}
	}
	
	/**
	 * A funcao pesquisarNome utiliza a funcao verificarIgual para identificar se o nome digitado 
	 * pelo usuario existe ou nao na fila, imprimindo uma mensagem se nao existir e outra se existir e a posicao em que se encontra.
	 * Recebe como parametro o vetor de String nomes e nao retorna nenhum valor.
	 */
	
	static void pesquisarNome(String [] nomes) {
		
		String nome=digitarNome();
		
		int tamanho=nomes.length;
		
		int encontrado= verificarIgual(nomes,nome,tamanho);
		
		if(encontrado!=-1) {
			
			System.out.println("Esse nome foi encontrado na fila na posicao "+encontrado+" do vetor");
			
		}else {
			System.out.println("Esse nome nao foi encontrado na fila");
			
		}
	}
	
	/**
	 * A funcao removerNome utiliza a funcao verificarIgual para identificar se o nome digitado
	 * pelo usuario existe ou nao na fila, imprimindo uma mensagem se nao existir e se existir esse nome e deletado da fila
	 * passando todos os nomes da lista que vem apos o nome deletado para uma posicao anterior.
	 * Recebe como parametro o vetor de String nomes e nao retorna nenhum valor.
	 * @param nomes
	 */
		
		static void removerNome(String [] nomes) {
			
			String nome=digitarNome();
			
			int tamanho=nomes.length;
			
			int encontrado= verificarIgual(nomes,nome,tamanho);
			
			if(encontrado==-1) {
				
				System.out.println("Esse nome nao foi encontrado na fila");
				
			}else {
				
				for (int i=encontrado;i<(nomes.length-1);i++) {
					
					nomes[i]=nomes[i+1];
				}
			}	
		}
		
		/**
		 * A funcao digitarNome pede para que o usuario insira um nome para inserir/remover/pesquisar. 
		 * Retorna a String com o nome digitado pelo usuario.
		 * @return
		 */
		static String digitarNome() {
			
			Scanner scan= new Scanner(System.in);
			
			System.out.println("Digite um nome: ");
			String nome=scan.nextLine();
			
			return nome;
		}
	}
