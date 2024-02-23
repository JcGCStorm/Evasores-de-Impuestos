/**
* Interfaz que define el comportamiento del cobrador de Memeflix y que se implementa a sus paquetes de pago. 
*/
public interface MemeflixCobrador {

     /**
     * Cobra al usuario especificado
     * @param usuario El usuario al que se le va a cobrar
     */
    void cobrar(Usuario usuario);
}
