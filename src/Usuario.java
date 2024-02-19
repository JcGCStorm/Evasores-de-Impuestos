public class Usuario {
 
    String nombre;
    double dinero;
    int   HVO_plan;

    public Usuario(String nombre,  double dinero, int HVO_plan){
        this.nombre = nombre;
        this.dinero = dinero;
        this.HVO_plan = HVO_plan;
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

    public int getHVO_Plan(){
        return HVO_plan;
    }

    public void setHVO_Plan(int HVO_plan){
        this.HVO_plan = HVO_plan;
    }
}
