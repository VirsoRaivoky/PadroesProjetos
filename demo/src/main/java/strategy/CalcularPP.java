package strategy;

public class CalcularPP implements InterfaceCalculoJogo {

  @Override
  public double calcular(Jogo jogo, Cliente cliente) {
    return  cliente.getSaldo() - jogo.getPreco() + jogo.getDesconto()*jogo.getPreco();
  }

}
