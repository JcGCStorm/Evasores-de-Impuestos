/**
* Interfaz que define el comportamiento del cobrador de HVO Max y que se implementa a sus paquetes de pago. 
*/
public interface HVO_MAXCobrador {
    
    /**
     * Cobra al usuario especificado
     * 
     * @param usuario El usuario al que se le va a cobrar
     */
    public void cobrar(Usuario usuario);
}
