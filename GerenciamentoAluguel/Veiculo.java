
public abstract class Veiculo implements Alugavel {
	private String modelo;
	private String placa;
	private boolean alugado;
	
	public Veiculo(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
		this.alugado = false;
	}
	
	public void alugar() {
		System.out.println(this.modelo + " foi alugado");
		this.alugado = true; 
	}
	
	public void devolver() {
		System.out.println(this.modelo + " foi devolvido");
		this.alugado = false;
	}
	
	
	
	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public String Alugado() {
		if(this.alugado) {
			return "[Alugado]";
		}
		return "[Disponivel]";
	}
	public boolean isAlugado() {
		return this.alugado;
	}

	@Override
	public String toString() {
		return "Modelo -> " + this.getModelo() + " Placa -> " + this.getPlaca() + " " + this.Alugado();
	}
}
