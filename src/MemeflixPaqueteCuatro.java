import java.util.List;
public class MemeflixPaqueteCuatro extends Memeflix implements MemeflixCobrador{
    private double precio = 200;
    
    public MemeflixPaqueteCuatro(double precio) {
        this.precio = 200;
    }

    public double getPrecio() {
        return precio;
    }

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            MemeflixPaqueteCuatro meme = new MemeflixPaqueteCuatro(precio);
            // Realizar alguna acción con el usuario actual
            meme.cobrar(usuario);
            // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
        }
    }

// meses de Memeflix = 1

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción para cuatro dispositivos de Memeflix.");
        usuario.realizarPago(usuario, precio);
    }
}
