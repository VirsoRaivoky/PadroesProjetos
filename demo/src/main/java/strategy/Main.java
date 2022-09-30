package strategy;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Wilson", 100, 12);
        Jogo jogo = new Jogo("Ultrakill", 10, 0.3);

        CalcularFP calc = new CalcularFP();
        CalcularPP calcP = new CalcularPP();

        System.out.println("Jogo:" + jogo.getNomeJogo());
        System.out.printf("Preço: %2f \nSaldo: %2f \nSobrou: " + calc.calcular(jogo, cliente) ,jogo.getPreco(), cliente.getSaldo() );
            
        System.out.println("\n\nJogo:" + jogo.getNomeJogo());
        System.out.printf("Preço: %2f \nSaldo: %2f \nDesconto: %2f \nSobrou: " + calcP.calcular(jogo, cliente) , jogo.getPreco(), cliente.getSaldo(), jogo.getDesconto() );
    }

}
