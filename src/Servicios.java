import java.util.ArrayList;
import java.util.List;

public class Servicios implements Sujeto{

    Usuario usuario;
	List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios(){
		return usuarios;
	}

    // Método para suscribir un observador al cliente
    @Override
    public void agregar(Usuario usuario) {
        usuarios.add(usuario);
    }

    
    // Método para cancelar la suscripción
    @Override
    public void eliminar(Usuario usuario) {
        // Lógica para cancelar la suscripción
        usuarios.remove(usuario);
        System.out.println(usuario + " ha cancelado su suscripción.");
    }

    @Override
    public void notificar(){
        for (Usuario usuario : usuarios) {
            usuario.actualizar();
        }
    }
}
