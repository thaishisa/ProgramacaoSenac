package com.thais.aula6;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double[] valores= {1.5, 23, 12.1, 12.2, 1, 3.4, 3.3, 18, 9, 10.7};
		
		imprimirValores(valores);
		selectionSort(valores);
		System.out.println("");
		imprimirValores(valores);
	}	
		
		static void imprimirValores(double[] valores) {
			for (int i=0; i<valores.length; i++) {
				System.out.println(valores[i]+",");
			}	
		}
		
		static void selectionSort(double[] valores) {
			for(int i=0;i<valores.length-1;i++) {
				int max=i;
				for(int j=(i+1);j<valores.length;j++) {
					if(valores[j]>valores[max]) {
						max=j;
					}
				}
				if (i!=max) {
					troca(valores, i, max);
				}
			}
		}
		
		static void troca(double[] valores, int a,int b) {
			double aux= valores[a];
			valores[a]=valores[b];
			valores[b]=aux;
			
		}

	}


