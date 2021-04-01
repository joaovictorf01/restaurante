package restaurante;

import java.util.ArrayList;

public class Prato
  {
  private String nome;
  private ArrayList<Ingrediente> ingredientes;

  public Prato(String nome)
    {
    this.nome = nome;
    this.ingredientes = new ArrayList<Ingrediente>();
    }

    public String getNome()
    {
    return this.nome;
    }

  public void adicionarIngrediente(Ingrediente ingrediente)
    {
    this.ingredientes.add(ingrediente);
    }

  @Override
  public String toString()
    {
    String text = "";
    text += this.nome + "\n";
    text += "Ingredientes:\n";
    for(Ingrediente ingrediente : ingredientes)
      {
      text += ingrediente;
      }

    return text;
    }

  }
