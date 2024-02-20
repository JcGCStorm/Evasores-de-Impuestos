/**
 * Clase Usuario, un usuario tiene nombre, un monto de dinero, un número de meses
 * que varía según se contraten servicios y un plan para cada servicio, el cuál
 * también varia.
 */

public class Usuario {
 
    String nombre;
    double dinero;
    int     meses;
    int[]   plan;

    /**
     * Constructor del Usuario.
     * @param nombre
     * @param dinero
     * @param meses
     * @param plan
     */

    public Usuario(String nombre,  double dinero, int meses, int[] plan ){
        this.nombre = nombre;
        this.dinero = dinero;
        this.meses =  meses;
      this.plan = new int[5];
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
     * Regresa el dinero del usuario
     * @return el nombre del usuario;
     */
    public double getDinero(){
        return dinero;
    }

     /**
     * Define el dinero del Usuario
     * @param nombre el nuevo nombre del Usuario
     */
    public void setDinero(double dinero){
        this.dinero = dinero;       
    }


    /**
     * Regresa los meses que lleava usuario
     * @return los mesesddd del usuario;
     */
    public int getMeses(){
        return meses;
    }

    /**
     * Define el dinero del Usuario
     * @param nombre el nuevo nombre del Usuario
     */
    public void setMeses(int meses){
        this.meses = meses;
    }


    /**
     * Metodo que obtiene el plan contratado por el usuario, solo erecorre el arreglo hasta llegar al 
     * valor deseado.
     * @param indice
     * @return
     */
    public int obtenerPlan(int indice){
        if (indice >= 0 && indice < plan.length){
            return plan[indice];
        } else {
          System.out.println("El indice no es valido");
          return -1;
        }
    }

    /**
     * Metodo que cambia el plan del usuario
     * @param indice
     * @param valor
     */
    public void cambiarPlan(int indice, int valor){
     if (indice >= 0 && indice < plan.length) {
       plan[indice] = valor;
   } else {
       System.out.println("Índice inválido");
      } 
    }
}
