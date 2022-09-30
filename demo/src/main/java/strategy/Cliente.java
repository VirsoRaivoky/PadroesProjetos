package strategy;

public class Cliente {
    private String nome;
    private double saldo;
    private double saldoCred;
    private double saldoCD;

    public Cliente(String nome, double saldo, double saldoCred, double saldoCD) {
        this.nome = nome;
        this.saldo = saldo;
        this.saldoCred = saldoCred;
        this.saldoCD = saldoCD;
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

    public double getSaldoCD() {
        return this.saldoCD;
    }

}
