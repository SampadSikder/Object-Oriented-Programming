class Cube extends Shape3D {
    public double side;
    public String y;
    public boolean b;
    public double res;

    public Cube(String x,boolean a,double side){
        super(x,a);
        this.side=side;
        this.y=x;
        this.b=a;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public String getColor() {
        return y;
    }

    public boolean getFilled() {
        return b;
    }
}
