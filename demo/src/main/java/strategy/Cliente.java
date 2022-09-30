package strategy;

public class Cliente {
    private String nome;
    private double saldo;
    private double saldoCred;
    

    public Cliente(String nome, double saldo, double saldoCredD) {
        this.nome = nome;
        this.saldo = saldo;
        this.saldoCred = saldoCred;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getSaldoCred() {
        return this.saldoCred;
    }

}
