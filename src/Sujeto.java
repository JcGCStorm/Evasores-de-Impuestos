/* 
 * Interfaz creada para el sujeto, el cuál puede agregar y
 * eliminar observadores, además de actualizar cuándo sufre 
 * un cambio. 
*/

public interface Sujeto {
    
    /*
     * Agregar un observador al sujeto
     * @param observador el observador a agregar. 
     */
    public void agregar(Observador observador);

    /*
     * Elimina un observador al sujeto
     * @param observador el observador a eliminar. 
     */
    public void eliminar(Observador observador);

    /*
     * Notifica el estado del sujeto cada que se modifica
     * No recibe nada ya que solo va a notificar al observador
     * un nuevo cambio. 
     */
    public void notificar();

}
