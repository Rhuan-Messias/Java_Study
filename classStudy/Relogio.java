package classes;

public class Relogio {
	
	private int hora = 6;
	
	public Relogio() {
		
	}
	
	public Relogio(int hora) {
		this.hora = hora;
	}
	
	public void adicionarHora() {
		if(hora != 23) {
			hora += 1;
		}else {
			hora = 0;
		}
	}
	
	public void subtrairHora() {
		if(hora != 0) {
			hora -= 1;
		}else {
			hora = 23;
		}
	}
	
	public void mostrarHora() {
		System.out.println("hora -> " + hora + ":00");
	}
	
	

}
