public class CuentaBancaria {
    private int saldo;
    Usuario usuario;

    public CuentaBancaria(int saldoInicial) {
        this.saldo = saldoInicial;
    }

    public int getSaldo() {
        return saldo;
    }

    public void realizarPago(int monto) {
        saldo -= monto;
    }

}