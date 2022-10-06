package NullObject;

public class JogoReal extends JogoAbstrato {
  
  public JogoReal(String nome){
    this.nome = nome;
  }

  @Override
  public String getNome(){
    return nome;
  }
}
