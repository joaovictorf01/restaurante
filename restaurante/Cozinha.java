package restaurante;

import java.util.ArrayList;

public class Cozinha {
	private int horaAbertura;
	private int horaFechamento;
	private String pratoPrincipal;
	private ArrayList<Ingrediente> ingredientes;

	public int getHoraAbertura() {
		return horaAbertura;
	}

	public void setHoraAbertura(int horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	public int getHoraFechamento() {
		return horaFechamento;
	}

	public void setHoraFechamento(int horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	public String getPratoPrincipal() {
		return pratoPrincipal;
	}

	public void setPratoPrincipal(String pratoPrincipal) {
		this.pratoPrincipal = pratoPrincipal;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	// construtor
	public Cozinha(int horaAbertura, int horaFechamento, String pratoPrincipal) {

		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.pratoPrincipal = pratoPrincipal;
		
	}
	

	@Override
	public String toString() {

		String mostrar = " abre as: " + horaAbertura + "\nfecha as: " + horaFechamento + "\n prato principal:  "
				+ pratoPrincipal;

		return mostrar;

	}
	
	
}