
public class main {

	public static void main(String[] args) {
		
		Locadora locadora = new Locadora();
		
		Veiculo carro1 = new Carro("ferrari", "NLU-0980");
		Veiculo carro2 = new Carro("mercedes", "JNP-0341");
		
		Veiculo caminhao1 = new Caminhao("Truck", "ASL-9765");
		Veiculo caminhao2 = new Caminhao("ferrari", "JJP-1280");
		
		Veiculo moto1 = new Moto("Susuki", "ANP-1237");
		Veiculo moto2 = new Moto("ferrari", "GRB-9654");
		
		locadora.adicionarVeiculo(carro1);
		locadora.adicionarVeiculo(carro2);
		locadora.adicionarVeiculo(caminhao1);
		locadora.adicionarVeiculo(caminhao2);
		locadora.adicionarVeiculo(moto1);
		locadora.adicionarVeiculo(moto2);
		
		locadora.cadastrarCliente("Dory");
		locadora.cadastrarCliente("Carol");
		
		System.out.println(locadora.toString());
		
		System.out.println("");
		locadora.locarVeiculo(0, carro1);
		
		System.out.println("");
		locadora.locarVeiculo(1, carro1);
		
		System.out.println("");
		
		System.out.println(locadora.toString());
		
		System.out.println("");
		
		locadora.devolveVeiculo(0, carro1);
		
		
		
		
		
		
	}

}
