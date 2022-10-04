package strategy;

public class Operacao {
  private Cliente cliente;
  private Jogo jogo;
  private InterfaceCalculoJogo calculoPrecoJogo;

  public Operacao(Cliente cliente, Jogo jogo, InterfaceCalculoJogo calculoPrecoJogo) {
    this.cliente = cliente;
    this.jogo = jogo;
    this.calculoPrecoJogo = calculoPrecoJogo;
  }
  
  public double calcularPreco(){
    return calculoPrecoJogo.calcular(jogo, cliente);
  }
  public Cliente getCliente() {
    return cliente;
  }

  public Jogo getJogo() {
    return jogo;
  }

  public InterfaceCalculoJogo getCalculoPrecoJogo() {
    return calculoPrecoJogo;
  }
}
