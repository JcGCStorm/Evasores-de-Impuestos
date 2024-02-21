public class Cliente implements Observador{
    private String nombre;
    private CuentaBancaria cuenta;
    private HVO_MAX plan;

    public Cliente(String nombre, int saldoInicial) {
        this.nombre = nombre;
        this.cuenta = new CuentaBancaria(saldoInicial);
    }

    @Override
    public void actualizar() {
        System.out.println("¡Nuevo contenido disponible:  !");
    }

    // Método para realizar un pago mensual y actualizar el saldo
    public void realizarPago(int monto) {
        cuenta.realizarPago(monto);
        System.out.println(nombre + " realizó un pago de $" + monto + ". Saldo restante: $" + cuenta.getSaldo());
    }

    // Método para cambiar la versión de la suscripción
    public void cambiarVersion() {
        System.out.println(nombre + " ha cambiado la versión de su suscripción.");
    }
}



