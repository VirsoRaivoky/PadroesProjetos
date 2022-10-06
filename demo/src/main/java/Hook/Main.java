package Hook;

public class Main {

  public static void main(String[] args) {
    JogoSP jsp = new JogoSP("Ultrakill", 40);
    JogoP jp = new JogoP("Terraria", 20, 0.4);

    System.out.println("jogo: " + jsp.getNome() + "\nEstá custando: " + jsp.calcularPreco());
    System.out.println("=======================================");
    System.out.println(
        "\njogo: " + jp.getNome() + "\nEstá Custando: " + jp.calcularPreco() + "\ncom uma promoção de: "
            + jp.mostrarPromo() + "%");
  }
}
