package ro.scoalainformala;

public class Square {
    private double latura;

    public Square(double latura){
        this.latura=latura;
    }
    public Square(){
        this.latura=latura;
    }

    public void setLatura(double latura) {
        this.latura = latura;
    }

    public double perimetru(){
        return (double)4*latura;
    }
    public double aria(){
        return (double)2*latura;
    }
}
