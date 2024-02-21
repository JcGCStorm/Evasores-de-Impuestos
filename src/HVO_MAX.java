public class HVO_MAX extends Servicios {

  String notificacion;

  /**
   * Implementación de la clase HVO_MAX que sobre escribe al metodo
   * {@Link #cobrar} y lo implementa según el plan que el usuario elija
   * Este metodo obtiene el plan del usuario, se cobra dependiendo de dicho plan
   * 
   * @param usuario el usuario al que se le está cobrando el servicio.
   */

  /* Objeto de contexto. */

  public String getNotificacion(){
		return notificacion;
	}

	public void setNotificacion(String nuevaNoticia){
		notificacion = nuevaNoticia;
	}

  public void cobrar(Usuario usuario) {
    HVO_MAXCobrador plan = usuario.getPlanHvo_MAX();
    plan.cobrar(usuario);
    usuario.actualizar();
  }
}

// metodos

