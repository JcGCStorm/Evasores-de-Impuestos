public class ThisneyPaqueteTresMeses extends Thisney implements ThisneyCobrador {

    public int plan3Meses = 130;
    
    @Override
    public void cobrar(Usuario usuario){
        System.out.println("Tus tres meses gratis de Thisney comienzan ");
        usuario.realizarPago(plan3Meses);
        usuario.actualizar();
    }
}