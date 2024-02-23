/**
 * La clase CuentaBancaria representa una cuenta bancaria que contiene un saldo
 * y pertenece a los usuarios
 */

 public class CuentaBancaria {
    private double saldo;
    Usuario usuario;

    /**
     * Constructor para inicializar una CuentaBancaria con un saldo inicial
     * @param saldoInicial El saldo inicial de la cuenta bancaria
     */
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    /**
     * Obtiene el saldo actual de la cuenta bancaria
     * @return El saldo actual de la cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Realiza un pago desde la cuenta bancaria, disminuyendo el saldo
     * @param monto El monto del pago a realizar
     */
    public void realizarPago(double monto) {
            saldo -= monto;
    }

}