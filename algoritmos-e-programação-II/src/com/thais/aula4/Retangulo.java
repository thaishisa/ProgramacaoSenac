package com.thais.aula4;

//exemplo de classe
//public classe NomeDaClasse (nome da classe tem que ser um substantivo, sem verbo
//nome do arquivo é NomeDaClasse.java
//se tiver varias classes dentro de um arquivo JAVA só uma delas pode ser public
public class Retangulo {
	
	//atributos-variavel de instancia
	//aqui está como public, mas pode mudar o modificador de acesso
	//letra minuscula,substantivo
	
	public float base;
	public float altura;
	//private float base,altura;
	
	//public float getBase(){
	//return base; }
	//public float getAltura(){
	//return Altura; }
	//public void setBase(){
	//}
	//public void setAltura(){
	//}
	
	
		
	
	
	//metodos
	// modificador de acesso   tipo de retorno   nome do metodo
	public float calcularArea() {
		return base*altura;
	}	
	
	public Retangulo(){}
	//o metodo construtor é criado automaticamente (invisivel) se você nao criar nenhum pra classe
	//se eu criar um metodo qualquer esse metodo padrao não é mais criado pelo java
		
	public Retangulo(float b) {
		base=b;
	}
	//eu não poderia criar
	//public Retangulo(float a){}
	//porque tem a mesma assinatura (conjunto do nome quantidade de parametros recebido e tipo de dados dos parametros)do metodo
	//construtor anterior
	
	public Retangulo(float b, float a) {
		base=b;
		altura=a;
	}
	
	
	//se eu declarar o metodo ou o atributo como static antes do modificador de acesso é somente se eu 
	//não necessitar de nenhum valor vindo do objeto (portanto sem logica criar o objeto) e somente de valores vindo da propria classe
	
	
	}

	
	

