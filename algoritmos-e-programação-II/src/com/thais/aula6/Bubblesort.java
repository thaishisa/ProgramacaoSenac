package com.thais.aula6;

public class Bubblesort {

	public static void main(String[] args) {
		String[] nomes= {"g", "a","i","b", "h","d"};
		
		imprimirNomes(nomes);
		bubblesort(nomes);
		imprimirNomes(nomes);

	}
	
	static void imprimirNomes(String[] vetor) {
		for(int i=0;i<vetor.length;i++) {
			System.out.print(vetor[i]+",");
		}
		System.out.println();
	}
	
	static void bubblesort(String[] vetor) {
		for (int i=0;i<vetor.length-1;i++) {
			for(int j=0;j<vetor.length-1-i;j++) {
				if(vetor[j].compareToIgnoreCase(vetor[j+1])>0) {
					String aux=vetor[j+1];
					vetor[j+1]=vetor[j];
					vetor[j]= aux;
				}
			}
		}
	}

}
