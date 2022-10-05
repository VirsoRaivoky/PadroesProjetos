package State;

import java.lang.Thread.State;

public class Produto {

  private State state;

  public Produto() {
    state = new SOff(this);
  }

  public void setState(State state) {
    this.state = state;
  }

  public String Indisponivel() {
    return "Este produto não está disponivel no momento";
  }

  public String Disponivel() {
    return "O jogo já está disponivel! Aproveite!";
  }

  public String Promo() {
    return "O jogo está em promoção!";
  }

}
