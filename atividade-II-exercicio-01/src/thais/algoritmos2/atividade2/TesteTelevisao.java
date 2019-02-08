package thais.algoritmos2.atividade2;
public class TesteTelevisao {

/**
 * Metodo main que testa os metodos da classe Televisao, um novo objeto TV criado  com a TV
desligada, o canal em 2 e o volume iniciado em 10.
 * @param args
 */
	public static void main(String[] args) {
		
		Televisao televisao1= new Televisao(2, 10, true);
		
		televisao1.imprimirEstado();
		System.out.println("O canal atual é: "+televisao1.getCanal());
		System.out.println("O volume atual é: "+televisao1.getVolume());
		
		System.out.println();
		
		televisao1.desligarTelevisao();
		televisao1.setCanal(25);
		televisao1.setVolume();
		
		televisao1.imprimirEstado();
		System.out.println("O canal atual é: "+televisao1.getCanal());
		System.out.println("O volume atual é: "+televisao1.getVolume());
		
		System.out.println();
		
		televisao1.ligarTelevisao();
		televisao1.setCanal(100);
		televisao1.setVolume();
		
		televisao1.imprimirEstado();
		System.out.println("O canal atual é: "+televisao1.getCanal());
		System.out.println("O volume atual é: "+televisao1.getVolume());
		
		System.out.println();
	}

}
