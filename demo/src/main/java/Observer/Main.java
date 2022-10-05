package Observer;

public class Main {
  
  public static void main(String[] args){
    Jogo jogo = new Jogo("Ultrakill");

    Lista lista = new Lista();

    jogo.addObserver(lista);
    
    jogo.gratis();
    jogo.indisponivel();
    jogo.semPromo();
    jogo.promo();

    jogo.notifyObserver(lista, "SP");
  }
}
