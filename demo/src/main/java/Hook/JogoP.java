package Hook;

public class JogoP extends Jogo {

  public double promo;

  public JogoP(String nome, double preco, double promo) {
    super(nome, preco);
    this.promo = promo;
  }

  @Override
  protected double calcularPreco() {
    return this.getPreco() + (getPromo() * this.getPreco());
  }
  
  public double mostrarPromo(){
    return getPromo() * 100;
  }

  public double getPromo() {
    return promo;
  }
}
