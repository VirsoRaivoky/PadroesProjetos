package strategy;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Wilson", 29.99, 12, 0);
        Jogo jogo = new Jogo("Ultrakill", 27.99, 0.1);

        CalcularFP calc = new CalcularFP();
        System.out.println(calc.calcular(jogo, cliente));
    }

}
