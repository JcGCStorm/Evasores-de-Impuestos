public class HVO_MAXPaqueteGratis extends HVO_MAX implements HVO_MAXCobrador {

    private double precio;
    HVO_MAXPaqueteNormal paqueteNormal = new HVO_MAXPaqueteNormal(0);
    
    public HVO_MAXPaqueteGratis(double precio) {
        this.precio = 0;
    }

    public double getPrecio() {
        return precio;
    }

    // meses HVO = 0

    @Override
    public void cobrar(Usuario usuario) {
        if(usuario.getMes(1) < 3){
            System.out.println( usuario.getNombre() + ", disfruta de tu suscripciónn de HVO_MAX gratuita, aún te quedan " 
            + (3 - usuario.getMes(1)) + " meses/es");
            usuario.setMes(1, (usuario.getMes(1) + 1));
        } else {
                System.out.println(usuario.getNombre() +", tú suscripciónn de HVO_MAX con paquete gratis ha expirado.");
                usuario.cambiarVersion();
                paqueteNormal.cobrar(usuario);
            }
        }
    }
