package com.thais.aula6;

public class Exercicio1 {

	public static void main(String[] args) {
	
		String []nomes= {"h","f","e","d","c","b","a"};
		imprimir(nomes);
		long inicio=System.currentTimeMillis();
		ordenar(nomes);
		long fim=System.currentTimeMillis();
		imprimir(nomes);
		long dif=fim-inicio;
		System.out.println(dif);
		

	}
	
	static void troca(String []vetor, int a, int b) {
		String aux= vetor [a];
		vetor[a]=vetor[b];
		vetor[b]=aux;
		
	}
	
	static void ordenar(String []nomes) {
		for (int i=0; i<nomes.length-1; i++) {
			for (int j=0; j<nomes.length-i-1;j++) {
				if (nomes[j].compareToIgnoreCase(nomes[j+1])> 0){
					//ao usar compareToIgnoreCase for <0 s1<s2 (significa q alfabeticamente s1 vem antes de s2 alfabeticamente
					//ao usar compareToIgnoreCase for ==0 s1<s2 (significa q alfabeticamente s1 � igual a s2 alfabeticamente
					//ao usar compareToIgnoreCase for >0 s1>s2 (significa q alfabeticamente s1 vem depois de s2 alfabeticamente
					troca(nomes,j,j+1);
				}
			}
		}
	}
	
	static void imprimir(String []nomes) {
		System.out.println();
		for (int i=0;i<nomes.length;i++) {
			System.out.println(nomes[i]);
		}
	}
	
}


