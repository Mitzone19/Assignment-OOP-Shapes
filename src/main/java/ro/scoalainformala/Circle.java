package ro.scoalainformala;

public class Circle  {
    private double raza;
    public Circle(double raza){
        this.raza=raza;
    }
    public Circle(){
        this.raza=raza;
    }
    public void setRaza(double x){
        this.raza=x;
    }
    public double perimetru(){
        return (double) 2 * Math.PI * raza;
    }
    public double aria(){
        return (double) Math.PI * raza * raza;
    }
}
