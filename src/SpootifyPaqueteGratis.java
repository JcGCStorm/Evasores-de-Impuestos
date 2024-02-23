public class SpootifyPaqueteGratis extends Spootify implements SpootifyCobrador {    
    
    private double precio;
    
    public SpootifyPaqueteGratis(double precio) {
        this.precio = 0;
    }

    public double getPrecio() {
        return precio;
    }

        // meses de Spootify = 3

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Disfrute del plan gratuito de Spootify.");
    }
}
