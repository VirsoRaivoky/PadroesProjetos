package Hook;

public class JogoSP extends Jogo {
  
  public JogoSP(String nome, double preco){
    super(nome, preco);
  }

  @Override
  protected double calcularPreco(){
    return this.getPreco();
  }

}
