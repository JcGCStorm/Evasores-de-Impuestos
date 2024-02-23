import java.util.List;
public class MomazonPaqueteNormal extends Momazon implements MomazonCobrador {

    private double precio;
    
    public MomazonPaqueteNormal(double precio) {
        this.precio = 110;
    }

    public double getPrecio() {
        return precio;
    }

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            MomazonPaqueteNormal momazon = new MomazonPaqueteNormal(precio);
            // Realizar alguna acción con el usuario actual
            momazon.cobrar(usuario);
            // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
        }
    }

    // meses de Momazon = 2


    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción normal de Momazon.");
        usuario.realizarPago(usuario, precio);
    }
}
