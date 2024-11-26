package classes;

public class Carro {
	
	private double velocidade = 0.0d;
	
	public Carro() {
		
	}
	
	public Carro(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar() {
		velocidade += 10;
	}
	
	public void freiar() {
		velocidade -= 10;
	}
	
	public void mostrarVelocidade() {
		System.out.println("Velocidade: "+ velocidade +" Km/h");
	}

}
