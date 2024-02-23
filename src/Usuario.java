import java.util.List;
import java.util.LinkedList;

/**
 * Clase Usuario, un usuario tiene nombre, un monto de dinero, un número de meses
 * que varía según se contraten servicios y un plan para cada servicio, el cuál
 * también varia.
 */

public class Usuario implements Observador{
 
    String nombre;
    private CuentaBancaria cuenta;
    int[]     meses;
    String notificacion;
    private List<Servicios> servicios;

    /**
     * Constructor del Usuario.
     * @param nombre
     * @param dinero
     * @param meses
     * @param plan
     */

    public Usuario(String nombre, int saldoInicial, int[] meses){
        this.nombre = nombre;
        this.cuenta = new CuentaBancaria(saldoInicial);
        this.meses =  new int[5];
        this.servicios = new LinkedList<>();
    }
    /**
     * Regresa el nombre del usuario
     * @return el nombre del usuario;
     */
    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return cuenta.getSaldo();
    }
    /**
     * Define el nombre del Usuario
     * @param nombre el nuevo nombre del Usuario
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Regresa los meses que lleava usuario
     * @return los mesesddd del usuario;
     */

     public int getMes(int index) {
        if (index >= 0 && index < meses.length) {
            return meses[index];
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    /**
     * Define un valor para los meses del Usuario
     * @param meses el nuevo nombre del Usuario
     */
    public void setMeses(int[] meses){
        this.meses = meses;
    }

    public void setMes(int index, int valor) {
        if (index >= 0 && index < meses.length) {
            meses[index] = valor;
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    @Override
    public void actualizar(List<Usuario> usuarios) {

        }

    // Método para realizar un pago mensual y actualizar el saldo
    public void realizarPago(Usuario usuario, double monto) {
        if(usuario.getSaldo() > monto){
        cuenta.realizarPago(monto);
        System.out.println("Su suscripción fué pagada con exito, se cobró un total de $" + monto + ". \n" + "Gracias por seguir con nosotros " + getNombre() + "\nSaldo restante: $" + cuenta.getSaldo() + "\n");
        } else {
            System.out.println("No fué posible realizar el pago, saldo insuficiente");
        }
    }

    // Método para cambiar la versión de la suscripción
    public void cambiarVersion() {
        System.out.println(nombre + " ha cambiado la versión de su suscripción.");
        
    }
}
