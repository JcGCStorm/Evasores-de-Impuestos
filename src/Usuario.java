public class Usuario {
 
    String nombre;
    double dinero;
    int planHVO;
    int planMemeflix;
    int planMomazon;
    int planSpootify;

    public Usuario(String nombre,  double dinero, 
                    int planHVO,
                    int planMemeflix,
                    int planMomazon,
                    int planSpootify){
        this.nombre       =  nombre;
        this.dinero       =  dinero;
        this.planHVO      = planHVO;
        this.planMemeflix = planMemeflix;
        this.planMomazon  = planMomazon;
        this.planSpootify = planSpootify;
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

    public int getPlanHVO(){
        return planHVO;      
    }

    public void setPlanHVO(int planHVO){
        this.planHVO = planHVO;
    }

    public int getPlanMemeflix(){
        return planMemeflix;      
    }

    public void setPlanMemeflix(int planMemeflix){
        this.planMemeflix = planMemeflix;
    }

    public int getPlanMomazon(){
        return planMomazon;      
    }

    public void setPlanMomazon(int planMomazon){
        this.planMomazon = planMomazon;
    }

    public int getPlanSpootify(){
        return planSpootify;      
    }

    public void setPlanSpootify(int planSpootify){
        this.planSpootify = planSpootify;
    }
}
