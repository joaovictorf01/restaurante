package restaurante;

public class Ingrediente {
	private String nome;
	  private String dataValidade;
	  private int quantidade;

	  public Ingrediente(String nome, int quantidade, String dataValidade)
	    {
	    this.nome = nome;
	    this.quantidade = quantidade;
	    this.dataValidade = dataValidade;
	    }

	  @Override
	  public String toString()
	    {
	    String text = "";
	    text += this.nome + "\n";
	    text += "Quantidade: " + this.quantidade + "\n";
	    text += "Data de validade: " + this.dataValidade + "\n";
	    return text;
	    }

 

}
