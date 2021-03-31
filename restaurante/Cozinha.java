package restaurante;

public class Cozinha {
	public int horaAbertura;
	public int horaFechamento;
	public String pratoPrincipal;
// construtor

	public Cozinha(int horaAbertura, int horaFechamento, String pratoPrincipal) {
		
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		this.pratoPrincipal = pratoPrincipal;
	}


	@Override
 public String toString() {
	
		String mostrar=" abre as: " + horaAbertura + 
				"\nfecha as: "  + horaFechamento+
				"\n prato principal:  " + pratoPrincipal;
		
	return mostrar ;
	
}
}