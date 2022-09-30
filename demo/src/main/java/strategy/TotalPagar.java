package strategy;

public class TotalPagar {
    private Cliente cliente;
    private Jogo jogo;
    private double preco;
    private double desconto;
    public InterfaceCalculoJogo calcularPrecoJogo;

    public TotalPagar(Cliente cliente, Jogo jogo, double preco, double desconto,
            InterfaceCalculoJogo calcularPrecoJogo) {
        this.cliente = cliente;
        this.jogo = jogo;
        this.preco = preco;
        this.desconto = desconto;
        this.calcularPrecoJogo = calcularPrecoJogo;
    }

   // public double calcularPrecoJogo() {
   //     return calcularPrecoJogo.calcular(jogo);
    //}

}
