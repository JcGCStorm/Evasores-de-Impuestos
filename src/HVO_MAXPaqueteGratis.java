public class HVO_MAXPaqueteGratis extends HVO_MAX implements HVO_MAXCobrador {

    public int planNormal = 140;
    Servicios servicio;

    @Override
    public void cobrar(Usuario usuario){
        if (usuario.getMes(1) < 3) {
            System.out.println("Disfruta de tu suscripciónn de HVO_MAX gratuita, aún te quedan " 
            + (3 - usuario.getMes(1)) + " meses/es");
            usuario.setMes(1, (usuario.getMes(1) + 1));
        } else {
                System.out.println("Tú suscripciónn de HVO_MAX con paquete gratis ha expirado.");
                usuario.cambiarVersion();
            }
        }

    public void setNotificacion(String notificacion){
         notificacion = "";
    }

    @Override
    public String getNotificacion() {
        return notificacion;
        }
    }
