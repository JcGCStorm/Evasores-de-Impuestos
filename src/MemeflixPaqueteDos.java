public class MemeflixPaqueteDos extends Memeflix implements MemeflixCobrador { 
    private double precio;
    
    public MemeflixPaqueteDos(double precio) {
        this.precio = 170;
    }

    public double getPrecio() {
        return precio;
    }

    // meses de Memeflix = 2

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Cobrando " + precio + " por el plan de suscripción para dos dispositivos de HVO_MAX.");
        usuario.realizarPago(usuario, precio);
    }
}