public class HVO_MAXPaqueteNormal extends HVO_MAX implements HVO_MAXCobrador {

    private double precio;
    
    public HVO_MAXPaqueteNormal(double precio) {
        this.precio = 140;
    }

    public double getPrecio() {
        return precio;
    }
// meses de HVO_MAX = 0
    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción de HVO_MAX para un dispositivo.");
            usuario.realizarPago(usuario, precio);
        }
    }
