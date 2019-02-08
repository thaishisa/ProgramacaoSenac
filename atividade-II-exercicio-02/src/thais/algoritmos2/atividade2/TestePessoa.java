package thais.algoritmos2.atividade2;

import java.util.Scanner;

public class TestePessoa {
	
/**
 * Metodo main que testa os metodos da classe Pessoa. O teste deve ler os dados de
 * uma pessoa, criar um objeto do tipo Pessoa a partir desses dados e apresentar o nome, 
 * idade, IMC e categoria do IMC da pessoa.
 * @param args
 */

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		
		
		System.out.println("Digite seu nome: ");
		String nome=scan.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade= scan.nextInt();
		
		System.out.println("Digite seu peso: ");
		double peso=scan.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura=scan.nextDouble();
		
		Pessoa pessoa1= new Pessoa(nome, idade, peso, altura);
		
		System.out.println("Seu nome e: "+pessoa1.getNome());
		System.out.println("Sua idade e: "+pessoa1.getIdade()+" anos");
		System.out.println("Seu peso e: "+pessoa1.getPeso()+" kg");
		System.out.println("Sua altura e: "+pessoa1.getAltura()+" m");
		
		double imc=pessoa1.calcularIMC();
		
		System.out.println("Seu IMC e: "+imc);
		pessoa1.informarCategoria();
	}

}
