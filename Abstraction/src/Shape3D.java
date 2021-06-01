abstract class Shape3D implements Comparison{
    private String x;
    private boolean a;

    public Shape3D(String x, boolean a) {
        this.x=x;
        this.a=a;
    }
    public abstract double area();
    public abstract double volume();
    public abstract String getColor();
    public abstract boolean getFilled();

    @Override
    public int CompareTo() {
        return 0;
    }
}
