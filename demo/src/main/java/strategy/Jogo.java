package strategy;

public class Jogo {

    private String nomeJogo;
    private double preco;
    private double desconto;

    public Jogo(String nomeJogo, double preco, double desconto) {
        this.nomeJogo = nomeJogo;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNomeJogo() {
        return this.nomeJogo;
    }

    public double getPreco() {
        return this.preco;
    }

    public double getDesconto() {
        return this.desconto;
    }

}
