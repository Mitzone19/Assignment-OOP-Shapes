package ro.scoalainformala;

public class Triangle {
    private double latura1;
    private double latura2;
    private double latura3;
    private double baza;
    private double intaltime;

    public Triangle(double latura1,double latura2,double latura3,double baza,double intaltime){
        this.latura1=latura1;
        this.latura2=latura2;
        this.latura3=latura3;
        this.baza=baza;
        this.intaltime=intaltime;
    }
    public Triangle(){
        this.latura1=latura1;
        this.latura2=latura2;
        this.latura3=latura3;
        this.baza=baza;
        this.intaltime=intaltime;
    }
public void setAll(double latura1,double latura2,double latura3,double baza,double intaltime){
    this.latura1=latura1;
    this.latura2=latura2;
    this.latura3=latura3;
    this.baza=baza;
    this.intaltime=intaltime;
}
    public void setBaza(double baza) {
        this.baza = baza;
    }

    public void setIntaltime(double intaltime) {
        this.intaltime = intaltime;
    }

    public void setLatura1(double latura1) {
        this.latura1 = latura1;
    }

    public double getLatura2() {
        return latura2;
    }

    public void setLatura3(double latura3) {
        this.latura3 = latura3;
    }

    public double perimetru(){
        return (double)latura1+latura2+latura3;
    }
    public double aria(){
        return (double)baza*intaltime/2;
    }

}
