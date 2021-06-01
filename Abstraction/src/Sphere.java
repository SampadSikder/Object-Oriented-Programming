import java.lang.Math;
class Sphere extends Shape3D{
    public double radius;
    public double result;
    String x;
    Boolean a;
    public Sphere(String x,boolean a,double radius){
        super(x,a);
        this.x=x;
        this.a=a;
        this.radius=radius;

    }
    public double area(){
        return 4*3.1416*Math.pow(radius,2);
    }
    public double volume(){
         return (4/3)*3.1416*Math.pow(radius,3);
    }

    @Override
    public String getColor() {
        return x;
    }
    public boolean getFilled(){
        return a;
    }
}
