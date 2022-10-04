package strategy;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Wilson", 100);
        Jogo jogo = new Jogo("Ultrakill", 10, 0.3);

        Operacao opFP = new Operacao(cliente, jogo, new CalcularFP());
        Operacao opPP = new Operacao(cliente, jogo, new CalcularPP());

        System.out.println("Jogo:" + jogo.getNomeJogo());
        System.out.printf("Preço: %2f \nSaldo: %2f \nSobrou: " + opFP.calcularPreco(), jogo.getPreco(),
                cliente.getSaldo());

        System.out.println("\n\nJogo:" + jogo.getNomeJogo());
        System.out.printf("Preço: %2f \nSaldo: %2f \nDesconto: %2f \nSobrou: " + opPP.calcularPreco(), jogo.getPreco(),
                cliente.getSaldo(), jogo.getDesconto());
    }

}
