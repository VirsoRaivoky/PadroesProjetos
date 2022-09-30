package strategy;

public class CalcularFP implements InterfaceCalculoJogo {

    @Override
    public double calcular(Jogo jogo, Cliente cliente) {
        return cliente.getSaldo() - jogo.getPreco();
    }

}
