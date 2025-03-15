import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private List<Veiculo> veiculosAlugados;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.veiculosAlugados = new ArrayList<>();
	}
	
	public void alugarVeiculo(Veiculo veiculo) {
		if(veiculo != null && veiculo.isAlugado() == false) {
			System.out.println(this.nome + " alugou um carro");
			veiculosAlugados.add(veiculo);
			veiculo.alugar();
		} else {
			System.out.println(this.getNome() + ", infelizmente o veiculo já está alugado");
		}
	}
	
	public void devolverVeiculo(Veiculo veiculo) {
		if(veiculo != null && !veiculosAlugados.isEmpty()) {
			System.out.println(this.nome + " devolveu um carro");
			veiculosAlugados.remove(veiculo);
			veiculo.devolver();
		}
	}

	public String getNome() {
		return nome;
	}

	public List<Veiculo> getVeiculosAlugados() {
		return veiculosAlugados;
	}
	
	@Override
	public String toString() {
		return "Nome -> " + this.getNome();
	}
	
	
}
