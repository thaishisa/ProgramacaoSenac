package com.thais.aula7;

public class BuscaBinaria {

	public static void main(String[] args) {
		int [] valores= {3,2,21,6,8};
		
		insertionSort(valores);
		int pos=buscaBinaria(valores,6);
		System.out.println("Posicao do dado= "+pos);

	}
	
	static void insertionSort(int []valores) {
		for (int i=1; i<valores.length;i++) {
			int aux= valores[i];
			int j;
			
			for(j=i;j>0;j--) {
				if(valores[j-1]<aux) {
					break;
				}
				valores[j]=valores[j-1];
			}
			
			valores[j]=aux;
		}
	}
	
	static int buscaBinaria(int [] valores, int a) {
		int inicio=0;
		int fim= valores.length-1;
		
		while(inicio<=fim) {
			int meio= (inicio+fim)/2;
			if (valores[meio]==a) {
				return meio;
			}
			if(valores[meio]<a) {
				fim=meio-1;
			}else {
				inicio=meio+1;
			}
		}
		return -1;
	}

}
