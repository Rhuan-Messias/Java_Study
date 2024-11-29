package classes;

public class Elevador {
	
	private int andar = 0;
	private int totalAndares;
	private int capacidadeElevador;
	private int qntdPessoas;
	
	public Elevador() {
		
	}
	
	public Elevador(int capacidadeElevador, int totalAndares) {
		this.capacidadeElevador = capacidadeElevador;
		this.totalAndares = totalAndares;
		
	}
	
	public void entra() {
		if(this.qntdPessoas >= this.capacidadeElevador) {
			System.out.println("Capacidade máxima atingida!");
		}else {
			qntdPessoas += 1;
		}
	}
	
	public void sai() {
		if(this.qntdPessoas > 0) {
			qntdPessoas -= 1;
		}else {
			System.out.println("Não tem ninguém para sair!");
		}
	}
	
	public void sobe() {
		if(andar < totalAndares) {
			this.andar += 1;
		}
	}
	
	public void desce() {
		if(andar>0) {
			this.andar -= 1;
		}
	}
	
	public void getAndar() {
		System.out.println("Andar atual: " + this.andar);
	}
	
	public void getPessoas() {
		System.out.println("Quantidade de pessoas: " + this.qntdPessoas);
	}
	
	public void getCapacidade() {
		System.out.println("Capacidade máxima: " + this.capacidadeElevador);
	}
	
	public void getTotalAndares() {
		System.out.println("Total de andares: " + this.totalAndares);
	}
	
	public void getAll() {
		this.getAndar();
		this.getPessoas();
		this.getCapacidade();
		this.getTotalAndares();
	}
}
