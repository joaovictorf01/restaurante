package restaurante;



public class Cozinha {
	
	private String nome;
	  private int horaAbertura;
	  private int horaFechamento;
	  private Prato pratoPrincipal;

	  public Cozinha(String nome, Prato pratoPrincipal, int horaAbertura, int horaFechamento)
	    {
	    this.nome = nome;
	    this.pratoPrincipal = pratoPrincipal;
	    this.horaAbertura = horaAbertura;
	    this.horaFechamento = horaFechamento;
	    }

	  @Override
	  public String toString()
	    {
	    String text = "";
	    text += "Restaurante: " + this.nome + "\n";
	    text += "Prato principal: " + this.pratoPrincipal;
	    return text;
	  	
	
}}