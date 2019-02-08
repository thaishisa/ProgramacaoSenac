package com.thais.aula6;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int[] vetor= {38, 27, 43, 3, 9, 82, 10};
		imprimirVetor(vetor);
		insertionSort(vetor);

	}
	
	static void imprimirVetor(int[] vetor) {
		
		for(int i=0; i<vetor.length;i++) {
		System.out.print(vetor[i] +", ");
		}
	}
	
	static void insertionSort(int [] vetor) {
		for (int i=1; i<vetor.length;i++) {
			int aux= vetor[i];
			int j;
			
			for(j=i;j>0;j--) {
				if(vetor[j-1]<aux) {
					break;
				}
				vetor[j]=vetor[j-1];
			}
			vetor[j]=aux;
			
			
		}
	}

}
