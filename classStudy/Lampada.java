package classes;

public class Lampada {
	
	private int estado = 0;
	
	public Lampada() {
		
	}
	
	public Lampada(int estado) {
		this.estado = estado;
	}
	
	public void ligar() {
		this.estado = 1;
	}
	
	public void desligar() {
		this.estado = 0;
	}
	
	public void mostrarEstado() {
		if(estado == 1) {
			System.out.println("Ligado");
		}else {
			System.out.println("Desligado");
		}
			
	}	
}
