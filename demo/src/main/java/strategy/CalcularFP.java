package strategy;

public class CalcularFP implements InterfaceCalculoJogo {
//! Teste
    @Override
    public double calcular(Jogo jogo, Cliente cliente) {
        return cliente.getSaldo() - jogo.getPreco();
    }

}
