package thais.algoritmos2.atividade2;

/**
 * Criar uma classe TV com os atributos para representar o canal, volume se a tv esta ligada ou não
 * @author Thais Lima dos Santos, aluna de Engenharia da Computacao, ALGORITMOS E PROGRAMACAO II
 *
 */

public class Televisao {
	
	private int canal;
	private int volume;
	private boolean ligada;
	
	/**
	 * Metodo construtor que inicializa os atributos canal,volume e ligada da classe 
	 * @param canal
	 * @param volume
	 * @param ligada
	 */
	public Televisao(int canal, int volume, boolean ligada) {
		this.canal=canal;
		this.volume=volume;
		this.ligada=ligada;
	}
	/**
	 * Metodo que liga a televisao setando a variavel ligada como true
	 */
	public void ligarTelevisao() {
		ligada=true;
	}
	/**
	 * Metodo que desliga a televisao setando a variavel ligada como false
	 */
	public void desligarTelevisao() {
		ligada=false;
	}
	/**
	 * Metodo que imprime o estado atual da tv, se o atributo ligada for true a tv esta ligada, se false esta desligada
	 */
	public void imprimirEstado() {
		if (ligada) {
			System.out.println("A TV ESTA LIGADA");
		}else {
			System.out.println("A TV ESTA DESLIGADA");
		}
	}
	/**
	 * Metodo get do atributo canal, retorna o valor presente nesse atributo
	 * @return canal
	 */
	public int getCanal() {
		return canal;
	}
	/**
	 * Metodo get do atributo volume, retorna o valor presente nesse atributo
	 * @return volume
	 */
	public int getVolume() {
		return volume;
	}
	/**
	 * Metodo set do atributo canal, recebe como parametro o valor setado para canal
	 * e seta o valor no atributo se esse valor estiver entre 0 e 99
	 * @param canal
	 */
	public void setCanal(int canal) {
		if(canal>0 && canal<99) {
			this.canal=canal;
		}else {
			System.out.println("ESSE CANAL NAO EXISTE");
		}
	}
	/**
	 * * Metodo set do atributo canal,quando o metodo e chamado acrescenta em um
	 * o valor no atributo, se o atributo estiver entre 0 e 99
	 */
	public void setVolume() {
		if(this.volume>0 && this.volume <20) {
			this.volume++;
		}else {
			System.out.println("ESSE VOLUME NAO EXISTE");
		}
	}
}
