import java.util.ArrayList;
import java.util.List;

public class HVO_MAX extends Servicios {

  String notificacion;
  HVO_MAXCobrador planHvo; 
  List<Usuario> usuarios = new ArrayList<>();


  /**
   * Implementación de la clase HVO_MAX que sobre escribe al metodo
   * {@Link #cobrar} y lo implementa según el plan que el usuario elija
   * Este metodo obtiene el plan del usuario, se cobra dependiendo de dicho plan
   * 
   * @param usuario el usuario al que se le está cobrando el servicio.
   */

	public void setNotificacion(String nuevaNoticia){
		notificacion = nuevaNoticia;
	}

  public String getNotificacion(){
    return notificacion;
  }

  public void cobrar(List<Usuario> usuario) {
    for (Usuario usuarios : usuarios) {
    HVO_MAXCobrador plan = usuarios.getPlanHvo_MAX();
    plan.cobrar(usuarios);
    usuarios.actualizar();
   }
 }
}
// metodos

