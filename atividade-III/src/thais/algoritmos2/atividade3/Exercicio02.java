package thais.algoritmos2.atividade3;

public class Exercicio02 {

	public static void main(String[] args) {
		Fila f= new Fila();
		
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.enqueue(4);
		while(!f.isEmpty()) {
			int c=(int)f.dequeue();
			System.out.print(c+"");
		}
		
		//fura a fila com o numero 7, sendo o 7 agora o inicio da fila circular
		System.out.println("");
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.enqueue(4);
		f.furarFila(7);
		while(!f.isEmpty()) {
			int c=(int)f.dequeue();
			System.out.print(c+"");
		}
		
		
	}

}
