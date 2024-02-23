import java.util.List;
public class SpootifyPaqueteGratis extends Spootify implements SpootifyCobrador {    
    
    private double precio;
    
    public SpootifyPaqueteGratis(double precio) {
        this.precio = 0;
    }

    public double getPrecio() {
        return precio;
    }

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            SpootifyPaqueteGratis spoti = new SpootifyPaqueteGratis(precio);
            // Realizar alguna acción con el usuario actual
            spoti.cobrar(usuario);
            // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
        }
    }

        // meses de Spootify = 3

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Querid@ " + usuario.getNombre() + ", estás disfrutando del plan gratuito de Spootify \n Si quieres quitar los anuncios contrata el PREMIUM " + usuario.getNombre() + ".");
    }
}
