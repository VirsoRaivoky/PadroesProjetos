package NullObject;

public class Main {

  public static void main(String[] args) {

    JogoAbstrato j1 = Jogo.getJogo("Ultrakill");
    JogoAbstrato j2 = Jogo.getJogo("God of War");
    JogoAbstrato j3 = Jogo.getJogo("Terraria");

    System.out.println("Jogos:");
    System.out.println(j1.getNome());
    System.out.println(j2.getNome());
    System.out.println(j3.getNome());

    if (j3 instanceof JogoNull) {
      System.out.println("Jogo 3 é Nulo!");
    }
  }
}
