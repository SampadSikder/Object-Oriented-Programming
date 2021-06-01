public class MainClass {
    public static void main(String[] args){
        Sphere s=new Sphere("Blue",true,2.0);

        System.out.println(s.getColor()+" "+ s.getFilled()+" area: "+s.area()+" volume: "+s.volume());

        Cube c=new Cube("Green",false,2.0);

        System.out.println(c.getColor()+" "+ c.getFilled()+" area: "+c.area()+"volume: "+c.volume());

    }
}
