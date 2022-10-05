package Observer;

//Observador
public class Lista implements Observer, ListaJogos {

  public void notifyObserver(Observable observable, String message) {
    System.out.println("Porra" + observable);
  }

  public void semPromo() {
    System.out.println(" Jogo não está com nenhuma oferta");
  }

  public void promo() {
    System.out.println(" O jogo entrou em promoção! Aproveite!");
  }

  public void indisponivel() {
    System.out.println(" O jogo está indisponivel");
  }

  public void gratis() {
    System.out.println(" O jogo está gratuito por um periodo limitado! Corra antes que a promoção acabe!");
  }

  public void update(Observable observable, Object jogo, String state) {
    Jogo jogoO = (Jogo) jogo;
    String states = String.valueOf(jogoO);

    if (states.equals("SP")) {
      this.semPromo();
    }

    else if (states.equals("P")) {
      this.promo();
    }

    else if (states.equals(jogo)) {
      this.indisponivel();
    }

    else if (states.equals("G")) {
      this.gratis();
    }

  }

}
