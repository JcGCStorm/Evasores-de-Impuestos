public class CuentaBancaria {
    private double saldo;
    Usuario usuario;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void realizarPago(double monto) {
            saldo -= monto;
    }

}