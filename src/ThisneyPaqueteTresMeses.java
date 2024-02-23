import java.util.List;
/**
 * Clase que representa un paquete de suscripcion de los primeros 3 meses a
 * Thisney
 * Extiende la clase Thisney e implementa la interfaz ThisneyCobrador
 */

public class ThisneyPaqueteTresMeses extends Thisney implements ThisneyCobrador {
    private double precio;
    ThisneyPaqueteNormal paqueteNormal = new ThisneyPaqueteNormal(precio);

    /**
     * Constructor para inicializar un paquete de suscripcion de los primeros 3
     * meses a THisney
     * 
     * @param precio El precio del paquete de suscripcion de los primeros 3 meses
     */
    public ThisneyPaqueteTresMeses(double precio) {
        this.precio = 130;
    }

    /**
     * Obtiene el precio del paquete de suscripcion de los primeros 3 meses
     * 
     * @return El precio del paquete de suscripcion de los primeros 3 meses
     */
    public double getPrecio() {
        return precio;
    }

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            ThisneyPaqueteTresMeses thisney = new ThisneyPaqueteTresMeses(precio);
            thisney.cobrar(usuario);
        }
    }

        /**
     * Implementacion del metodo de cobro para el paquete de suscripcion de los primeros 3 meses
     * a THisney
     * Cobra al usuario por el paquete de suscripcion de los primeros 3 meses
     * y realiza el pago
     * 
     * @param usuario El usuario al que se le cobrara por el paquete de suscripcion de los primeros 3 meses
     */
    @Override
    public void cobrar(Usuario usuario) {
        if(usuario.getMes(4) < 3){
            System.out.println( usuario.getNombre() + ", se cobrará tu suscripciónn de Thisney+ de $130,");
            System.out.println("tienes " + (3 - usuario.getMes(4)) + " mes/es para disfrutar la promoción.");
            usuario.realizarPago(usuario, precio);
            usuario.setMes(4, (usuario.getMes(4) + 1));
        } else {
            System.out.println(usuario.getNombre() + ", te recordamos que tú suscripciónn de Thisney+ con promoción\n de $130 ha expirado. Ahora pagarás $160");
            usuario.cambiarVersion();
            paqueteNormal.cobrar(usuario);
        }
    }
}