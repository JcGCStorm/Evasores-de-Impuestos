import java.util.List;
/*
     * Interfaz para el observador, el cuál va a actualizar
     * un cambio cuándo el estado del sujeto se modifique.
     */
public interface Observador {
    
    /*
     * Actualiza un cambio del sujeto, aún falta poner
     * que parametros va a actualizar, de momento no he
     * puesto ninguno.
     */
    public void actualizar(List<Usuario> usuarios);
}
