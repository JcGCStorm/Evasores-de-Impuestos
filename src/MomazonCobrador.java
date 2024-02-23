/**
* Interfaz que define el comportamiento del cobrador de Momazon y que se implementa a sus paquetes de pago. 
*/
public interface MomazonCobrador {

     /**
     * Cobra al usuario especificado
     * @param usuario El usuario al que se le va a cobrar
     */
    public void cobrar(Usuario usuario);
}
