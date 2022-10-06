package State;

public class Main {

    public static void main(String[] args) {
        Produto produto = new Produto();

        SimularS(produto);

    }

    public static void SimularS(Produto produto) {
        System.out.println(produto.ColocarD());
        System.out.println(produto.ColocarD());
        System.out.println(produto.RemoverP());

    }

}
