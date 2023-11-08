package ro.scoalainformala;

public class Rectangle {
    private double lungime;
    private double latime;
    public Rectangle(double lungime,double latime){
        this.lungime=lungime;
        this.latime=latime;
    }
    public Rectangle(){
        this.lungime=lungime;
        this.latime=latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double perimetru(){
        return (double) 2*lungime+2*latime;
    }
    public double aria(){
        return (double)lungime*latime;
    }
}
