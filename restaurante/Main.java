package restaurante;

public class Main {

	public static void main(String[] args) {

		Ingrediente feijao = new Ingrediente("Feijão preto", 1, "20/06/2021");
		Ingrediente arroz = new Ingrediente("Arroz", 5, "10/05/2021");
		Ingrediente farinha = new Ingrediente("farinha", 1, "30/12/2021");

		Ingrediente CarnePorco = new Ingrediente("carne de porco", 1, "4/05/2021");

		Ingrediente linguica = new Ingrediente("linguiça ", 1, "15/06/2021");

		Prato feijoada = new Prato("Feijoada");
		feijoada.adicionarIngrediente(feijao);
		feijoada.adicionarIngrediente(arroz);
		feijoada.adicionarIngrediente(farinha);
		feijoada.adicionarIngrediente(CarnePorco);
		feijoada.adicionarIngrediente(linguica);
		Ingrediente molho = new Ingrediente("molho italiano ", 3, "10/05/2021");
		Ingrediente  macarrão = new Ingrediente(" macarrãozinho ", 5, "10/09/2021");
		Ingrediente  carne = new Ingrediente(" carne ", 5, "10/09/2021");
		Prato yakissoba=new Prato(" Yakissoba moda italiana" );
		yakissoba.adicionarIngrediente(carne);
		yakissoba.adicionarIngrediente(macarrão);
		yakissoba.adicionarIngrediente(molho);
		Ingrediente Champignon=new Ingrediente(" cogumelo Champignon", 2 , "25/04/2021");
		Ingrediente brócules=new Ingrediente("brócules " , 1 ,  "21/04/2021");
		Prato yakissobaChinesa=new Prato(" Yakissoba moda chinesa" );
		yakissobaChinesa.adicionarIngrediente(brócules);
		yakissobaChinesa.adicionarIngrediente(Champignon);
		
		yakissobaChinesa.adicionarIngrediente(carne);
		yakissobaChinesa.adicionarIngrediente(macarrão);
		
		
		
		
		
		Cozinha cozinhaMineira = new Cozinha("Restaurante mineiro", feijoada, 14, 20);

		Cozinha cozinhaChinesa = new Cozinha("Cozinha chinesa", yakissobaChinesa, 10, 21);

		Cozinha cozinhaItaliana = new Cozinha("Cozinha italiana", yakissoba, 10, 21);
		
		System.out.println(cozinhaMineira);
		System.out.println(cozinhaItaliana);

		System.out.println(cozinhaChinesa);
	}

}
