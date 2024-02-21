import java.util.ArrayList;
import java.util.List;

public class Servicios implements Sujeto{
    Usuario usuario;
    private List<Observador> observadores = new ArrayList<>();


    // Método para suscribir un observador al cliente
    @Override
    public void agregar(Observador observador) {
        observadores.add(observador);
    }
    
    // Método para cancelar la suscripción
    @Override
    public void eliminar(Observador observador) {
        // Lógica para cancelar la suscripción
        observadores.remove(observador);
        System.out.println(usuario + " ha cancelado su suscripción.");
    }

    @Override
    public void notificar(){
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
}
