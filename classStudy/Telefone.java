package classes;

public class Telefone {
	
	private int numMinutos = 0;
	private double preco = 2.0d;
	
	public Telefone() {
		
	}
	
	public Telefone(int numMinutos, double preco) {
		this.numMinutos = numMinutos;
		this.preco = preco;
	}
	
	public void duracaoLigacao(int a ) {
		this.numMinutos += a;
	}
	
	public void alteraPreco(double p) {
		this.preco = p;
	}
	
	public void mostrarConta() {
		System.out.println("Conta: " + numMinutos*preco);
	}
	
	
}
