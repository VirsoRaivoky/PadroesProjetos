package State;


public class Produto {

  private State state;

  public Produto() {
    state = new SOff(this);
  }

  public void setState(State state) {
    this.state = state;
  }

  public String Gratis() {
    return "Este produto Está Gratuito! Aproveite!";
  }

  public String Disponivel() {
    return "O jogo já está disponivel, mas sem nenhum desconto :(";
  }

  public String Promo() {
    return "O jogo está em promoção!";
  }

  public String ColocarD() {
    return state._ColocarD();
  }

  public String RemoverP() {
    return state._RemoverPromo();
  }

}
