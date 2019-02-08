package com.thais.aula2.exercícios;

public class Exercício2 {

	public static void main(String[] args) {
	
		int [] vetor= {5,8,9,1,-3,2,7};
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Valor "+(i+1)+" : "+vetor[i]);
		}
		
		int menor= apresentarMenor(vetor);
		
		System.out.println("O menor valor desse vetor é: "+menor);
	}
	
	static int apresentarMenor(int [] vetores) {
		
		int menor= Integer.MAX_VALUE;
		
		for(int i=0; i<vetores.length;i++) {
			if (vetores[i]<menor) {
				menor=vetores[i];
			}
		}
		return menor;
	}

}
