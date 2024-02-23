import java.util.List;

public class MemeflixPaqueteDos extends Memeflix implements MemeflixCobrador { 
    private double precio;
    
    public MemeflixPaqueteDos(double precio) {
        this.precio = 170;
    }

    public double getPrecio() {
        return precio;
    }

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            MemeflixPaqueteDos meme = new MemeflixPaqueteDos(precio);
            // Realizar alguna acción con el usuario actual
            meme.cobrar(usuario);
            // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
        }
    }

    // meses de Memeflix = 2

    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción para dos dispositivos de HVO_MAX.");
        usuario.realizarPago(usuario, precio);
    }
}