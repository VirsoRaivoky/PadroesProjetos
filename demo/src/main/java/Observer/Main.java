package Observer;

public class Main {

  public static void main(String[] args) {

    Usuario user = new Usuario("Wilson");
    
    Jogo j1 = new Jogo("Ultrakill");
    Jogo j2 = new Jogo("God Of War");
    Jogo j3 = new Jogo("Terraria");
    Jogo j4 = new Jogo("Bloodstained");
    Jogo j5 = new Jogo("Hellblade");

    user.addJogo(j1);
    user.addJogo(j2);
    user.addJogo(j3);
    user.addJogo(j4);
    user.addJogo(j5);

    user.removerJogo(j4);

    j1.AddLista(user);
    j2.AddLista(user);
    j3.AddLista(user);
    j4.AddLista(user);
    j5.AddLista(user);

    user.att();
  }
}
