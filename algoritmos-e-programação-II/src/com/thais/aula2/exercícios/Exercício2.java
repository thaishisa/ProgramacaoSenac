package com.thais.aula2.exerc�cios;

public class Exerc�cio2 {

	public static void main(String[] args) {
	
		int [] vetor= {5,8,9,1,-3,2,7};
		
		for(int i=0;i<vetor.length;i++) {
			System.out.println("Valor "+(i+1)+" : "+vetor[i]);
		}
		
		int menor= apresentarMenor(vetor);
		
		System.out.println("O menor valor desse vetor �: "+menor);
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
