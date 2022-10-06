package Observer;

public class Jogo implements Observer {
  private String nome;

  public Jogo(String nome) {
    super();
    this.nome = nome;
  }

  public void update() {
    System.out.println("O jogo: " + nome + ", Entrou em promoção!");
  }

  public void AddLista(Usuario lj) {
  }

  public String getNome() {
    return nome;
  }
}
