package work;

public class MainClass {
    public static void main(String[] args){
        Abstract obj=new Extension(5);
        obj.show();
    }
}
