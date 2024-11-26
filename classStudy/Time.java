package classes;

public class Time {
	
	private int pontosGanhos = 0;
	
	public Time() {
		
	}
	
	public Time(int pontosGanhos) {
		this.pontosGanhos = pontosGanhos;
	}
	
	public void ganharPartida() {
		pontosGanhos += 3;
	}
	public void empatarPartida() {
		pontosGanhos += 1;
	}
	public void perderPartida() {
		
	}

	public int getPontosGanhos() {
		return pontosGanhos;
	}
	
}
