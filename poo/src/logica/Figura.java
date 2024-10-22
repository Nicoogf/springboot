package logica;

public abstract class Figura {

    protected  double x ;
    protected  double y ;

    public Figura(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public abstract double calcularArea() ;
}
