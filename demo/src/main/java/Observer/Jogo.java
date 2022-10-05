package Observer;

public class Jogo extends Observable implements ListaJogos {

  private String state;
  public String nome;
  public Lista lista;
  public Observer observer;
  
  public Jogo(String nome) {
    this.nome = nome;
  }

  public void semPromo() {
    state = "SP";
    System.out.println(nome + " não está com nenhuma oferta");
    this.setState();
  }

  public String getState() {
    return state;
  }

  public void promo() {
    state = "P";
    System.out.println(nome + " Está com um desconto");
    this.setState();
  }

  public void indisponivel() {
    state = "ND";
    System.out.println(nome + " Está indisponivel no momento");
    this.setState();
  }

  public void gratis() {
    state = "G";
    System.out.println(nome + " está gratuito por um periodo limitado! Corra antes que a promoção acabe!");
    this.setState();
  }

  public void setState() {
    setUpdate();
    notifyObserver(observer, state);
  }

  public String getNome() {
    return nome;
  }
}
