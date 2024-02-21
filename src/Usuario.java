/**
 * Clase Usuario, un usuario tiene nombre, un monto de dinero, un número de meses
 * que varía según se contraten servicios y un plan para cada servicio, el cuál
 * también varia.
 */

public class Usuario implements Observador{
 
    String nombre;
    private CuentaBancaria cuenta;
    int[]     meses;
    String notificacion;
    MemeflixCobrador planMeme;
    HVO_MAXCobrador planHvo; 
    MomazonCobrador planMomazon; 
    ThisneyCobrador planThisney; 
    SpootifyCobrador planSpootify;
    /**
     * Constructor del Usuario.
     * @param nombre
     * @param dinero
     * @param meses
     * @param plan
     */

    public Usuario(String nombre, int saldoInicial, int[] meses, MemeflixCobrador planMeme, 
                   HVO_MAXCobrador planHvo, MomazonCobrador planMomazon, ThisneyCobrador planThisney,
                   SpootifyCobrador planSpootify){
        this.nombre = nombre;
        this.cuenta = new CuentaBancaria(saldoInicial);
        this.meses =  new int[5];
        this.planMeme = planMeme;
        this.planHvo = planHvo;
        this.planMomazon = planMomazon;
        this.planSpootify = planSpootify;
        this.planThisney = planThisney;
    }

    /**
     * Regresa el nombre del usuario
     * @return el nombre del usuario;
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el nombre del Usuario
     * @param nombre el nuevo nombre del Usuario
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Regresa los meses que lleava usuario
     * @return los mesesddd del usuario;
     */

     public int getMes(int index) {
        if (index >= 0 && index < meses.length) {
            return meses[index];
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    /**
     * Define un valor para los meses del Usuario
     * @param meses el nuevo nombre del Usuario
     */
    public void setMeses(int[] meses){
        this.meses = meses;
    }

    public void setMes(int index, int valor) {
        if (index >= 0 && index < meses.length) {
            meses[index] = valor;
        } else {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
    }

    @Override
    public void actualizar() {
  //      notificacion = planHvo.getNotificacion();
//	verNoticia();
        }

 //   public void verNoticia(){
  //      System.out.println("Querid@: " + nombre 
  //         + "\nSu suscripción de: " + getPlanHvo_MAX()
   //        + "\n: \n" 
   //        + notificacion);
    //    }    

    // Método para realizar un pago mensual y actualizar el saldo
    public void realizarPago(int monto) {
        cuenta.realizarPago(monto);
        System.out.println(nombre + " fué pagada con exito, se cobró un total de $" + monto + ". \nSaldo restante: $" + cuenta.getSaldo());
    }

    // Método para cambiar la versión de la suscripción
    public void cambiarVersion() {
        System.out.println(nombre + " ha cambiado la versión de su suscripción.");
    }

    public MemeflixCobrador getPlanMemeflix(){
        return planMeme;
    }

    public MomazonCobrador getPlanMomazon(){
        return planMomazon;
    }

    public SpootifyCobrador getPlanSpootify(){
        return planSpootify;
    }

    public ThisneyCobrador getPlanThisney(){
        return planThisney;
    }

    public HVO_MAXCobrador getPlanHvo_MAX(){
        return planHvo;
    }


}
