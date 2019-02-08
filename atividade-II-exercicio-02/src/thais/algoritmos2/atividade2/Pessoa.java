package thais.algoritmos2.atividade2;

/**
 * Criar uma classe pessoa com os atributos para representar o nome, a idade, o peso e altura 
 * @author Thais Lima dos Santos, aluna de Engenharia da Computacao, ALGORITMOS E PROGRAMACAO II
 *
 */

public class Pessoa {
	
	private String nome;
	private int idade;
	private double peso, altura;
	
/**
 * Metodo construtor que inicializa os atributos nome, idade, peso e altura da classe
 * @param nome
 * @param idade
 * @param peso
 * @param altura
 */
	public Pessoa(String nome, int idade, double peso, double altura) {
		this.nome=nome;
		this.idade=idade;
		this.peso= peso;
		this.altura=altura;
	}
	/**
	 * Metodo get do atributo nome, retorna o valor presente nesse atributo
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Metodo get do atributo idade, retorna o valor presente nesse atributo
	 * @return idade
	 */	
	public int getIdade() {
		return idade;
	}
	/**
	 * Metodo get do atributo peso, retorna o valor presente nesse atributo
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * Metodo get do atributo altura, retorna o valor presente nesse atributo
	 * @return altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 *  Metodo set do atributo nome,recebe como parametro o valor de nome digitado pelo usuario,
	 *  o atributo recebe o valor digitado
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome=nome;
	}
	/**
	 *  Metodo set do atributo idade,recebe como parametro o valor de idade digitado pelo usuario,
	 *  o atributo recebe o valor digitado
	 * @param idade
	 */
	public void setIdade(int idade) {
		this.idade=idade;
	}
	/**
	 *  Metodo set do atributo peso,recebe como parametro o valor de peso digitado pelo usuario
	 *  o atributo recebe o valor digitado
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso=peso;
	}
	/**
	 *  Metodo set do atributo altura,recebe como parametro o valor de altura digitado pelo usuario
	 *  o atributo recebe o valor digitado
	 * @param altura
	 */
	public void setAltura(double altura) {
		this.altura=altura;
	}
	/**
	 * Metodo que calcula o IMC a partir dos valores nos atributos peso e altura,
	 * retorna o valor calculado
	 * @return
	 */
	public double calcularIMC() {
		return peso/(altura*altura);
	}
	/**
	 * Metodo que informa a categoria do IMC a partir do valor retornado pela funcao calcularIMC()
	 */
	public void informarCategoria() {
		if (calcularIMC()<18.5) {
			System.out.println("Categoria: Abaixo do peso");
		}else if(calcularIMC()>=18.5 && calcularIMC()<=24.9 ){
			System.out.println("Categoria: Peso Ideal");
		}else if(calcularIMC()>=25 && calcularIMC()<=29.9 ){
			System.out.println("Categoria: Sobrepeso");
		}else if(calcularIMC()>=30 && calcularIMC()<=34.9 ){
			System.out.println("Categoria: Obesidade grau I");
		}else if(calcularIMC()>=35 && calcularIMC()<=39.9 ){
			System.out.println("Categoria: Obesidade grau II");
		}else {
			System.out.println("Categoria: Obesidade grau III");
		}
		 
	}
}
