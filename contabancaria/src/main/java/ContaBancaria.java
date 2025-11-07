public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) return;
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor == 0) return;
        if (valor > saldo) return;
        saldo -=valor;
    }

    public double consultarSaldo() {
        double saldoConta = saldo;
        return saldoConta;
    }
}
