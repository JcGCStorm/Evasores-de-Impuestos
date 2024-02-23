import java.util.List;
public class HVO_MAXPaqueteNormal extends HVO_MAX implements HVO_MAXCobrador {

    private double precio;
    
    public HVO_MAXPaqueteNormal(double precio) {
        this.precio = 140;
    }

    public double getPrecio() {
        return precio;
    }

    public void procesarUsuarios(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            HVO_MAXPaqueteNormal hvo = new HVO_MAXPaqueteNormal(precio);
            // Realizar alguna acción con el usuario actual
            hvo.cobrar(usuario);
            // Aquí puedes hacer cualquier otra acción que necesites con el usuario actual
        }
    }

// meses de HVO_MAX = 0
    @Override
    public void cobrar(Usuario usuario) {
        System.out.println("Querid@ " + usuario.getNombre() + "\n se está cobrando " + precio + " por el plan de suscripción de HVO_MAX para un dispositivo.");
            usuario.realizarPago(usuario, precio);
        }
    }
