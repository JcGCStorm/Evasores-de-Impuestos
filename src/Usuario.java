public class Usuario {
 
    String nombre;
    double dinero;
    int     meses;
    int[]   plan;

    public Usuario(String nombre,  double dinero, int meses, int[] plan ){
        this.nombre = nombre;
        this.dinero = dinero;
        this.meses =  meses;
      this.plan = new int[6];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getDinero(){
        return dinero;
    }

    public void setDinero(double dinero){
        this.dinero = dinero;       
    }

    public int getMeses(){
        return meses;
    }

    public void setMeses(int meses){
        this.meses = meses;
    }

    
    public int obtenerPlan(int indice){
        if (indice >= 0 && indice < plan.length){
            return plan[indice];
        } else {
          System.out.println("El indice no es valido");
          return -1;
        }
    }

    public void cambiarPlan(int indice, int valor){
     if (indice >= 0 && indice < plan.length) {
       plan[indice] = valor;
   } else {
       System.out.println("Índice inválido");
      } 
    }
}
