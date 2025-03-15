import java.util.ArrayList;
import java.util.List;

public class Locadora {
	private List<Veiculo> veiculosDisponiveis;
	private List<Cliente> clientes;
	
	public Locadora() {
		this.veiculosDisponiveis = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}
	
	public void adicionarVeiculo(Veiculo veiculo) {
		if(veiculo != null) {
			this.veiculosDisponiveis.add(veiculo);
		}
	}
	
	public void cadastrarCliente(String nome) {
		clientes.add(new Cliente(nome));
	}
	
	public void locarVeiculo(int indice, Veiculo veiculo) {
		if(veiculo != null) {
			this.clientes.get(indice).alugarVeiculo(veiculo);
		}
	}
	
	public void devolveVeiculo(int indice, Veiculo veiculo) {
		if(veiculo != null) {
			this.clientes.get(indice).devolverVeiculo(veiculo);
		}
	}
	
	
	
	public List<Veiculo> getVeiculosDisponiveis() {
		return veiculosDisponiveis;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	@Override
	public String toString() {
		return "Status dos veiculos: \n" + "Locadora \n" + this.getVeiculosDisponiveis();
	}
}
