package restaurante;

public class Ingrediente {
 private String nome;
 private String dataValidade;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDataValidade() {
	return dataValidade;
}
public void setDataValidade(String dataValidade) {
	this.dataValidade = dataValidade;
}
public Ingrediente(String nome, String dataValidade) {
	super();
	this.nome = nome;
	this.dataValidade = dataValidade;
}


}
