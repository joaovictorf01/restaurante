package restaurante;

import java.util.ArrayList;

public class Cozinha {

	private String nome;
	private int horaAbertura;
	private int horaFechamento;
	private Prato pratoPrincipal;
	private ArrayList<Funcionario> funcionarios;
	
	public Cozinha(String nome, Prato pratoPrincipal, int horaAbertura, int horaFechamento) {
		this.nome = nome;
		this.pratoPrincipal = pratoPrincipal;
		this.horaAbertura = horaAbertura;
		this.horaFechamento = horaFechamento;
		
		this.funcionarios = new ArrayList<Funcionario>();
	}

	public void adicionarFuncionario( Funcionario funcionario)
    {
    this.funcionarios.add(funcionario);
    }

	@Override
	public String toString() {
		String text ="";
		
		text += "Restaurante: " + this.nome + "\n";
		text+=" abre as " + this.horaAbertura + "horas";
		text+=" fecha as " + this.horaFechamento + "horas";

 
		text += "Prato principal: " + this.pratoPrincipal;
		 text +="\n"+ this.funcionarios;
		
		return text;

	}
}