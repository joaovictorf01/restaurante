package restaurante;

public class Funcionario {
private String  nome;
private String cargo;

public Funcionario(String nome , String cargo) {
	
	this.nome = nome;
	this.cargo = cargo;
	
}
@Override
public String toString() {
	
String info =" funcionários:" +   this.nome + "cargo " + this.cargo;

return info;

}
}

