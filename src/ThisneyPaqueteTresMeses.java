public class ThisneyPaqueteTresMeses extends Thisney implements ThisneyCobrador {
    private double precio;
    ThisneyPaqueteNormal paqueteNormal = new ThisneyPaqueteNormal(precio);
    
    
    public ThisneyPaqueteTresMeses(double precio) {
        this.precio = 130;
    }

    public double getPrecio() {
        return precio;
    }

        // meses de Thisney = 4

    @Override
    public void cobrar(Usuario usuario) {
        if(usuario.getMes(1) < 3){
            System.out.println( usuario.getNombre() + ", se cobrará tu suscripciónn de Thisney de $130,");
            usuario.setMes(1, (usuario.getMes(1) + 1));
            usuario.realizarPago(usuario, precio);
            System.out.println("aún te quedan " + (3 - usuario.getMes(1)) + " meses/es");
        } else {
                System.out.println(usuario.getNombre() +", tú suscripciónn de HVO_MAX con paquete gratis ha expirado.");
                usuario.cambiarVersion();
                paqueteNormal.cobrar(usuario);
            }
    }
}