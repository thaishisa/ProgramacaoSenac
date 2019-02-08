package com.thais.aula6;

public class Selectionsort {

	public static void main(String[] args) {
		int[] vetor= {38, 27, 43, 3, 9, 82, 10};
		selectionSort(vetor);
		imprimir(vetor);
		
	}
	
	static void selectionSort(int [] vetor) {
		for(int i=0; i<vetor.length-1;i++) {
			int min=i;
			for(int j=(i+1);j<vetor.length;j++) {
				if(vetor[j]<vetor[min]) {
					min=j;
				}
			}
			if(i!=min) {
				int aux= vetor[i];
				vetor[i]=vetor[min];
				vetor[min]=aux;
			}
		}
	}
	
	static void imprimir(int[] vetor) {
		
		for(int i=0; i<vetor.length;i++) {
		System.out.print(vetor[i]+", ");
		}
	}
	
}
