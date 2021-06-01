import java.util.*;
public class Main {
    public static void main(String[] args){
        SpeedLimit s=new SpeedLimit();
        Scanner sc=new Scanner(System.in);
        s.getSpeed(sc.nextInt());
        try{
            s.SpeedLimitCheck();
        }catch(SpeedException e){
            System.out.println("You are caught! Driving above 100! Lower your speed by:"+e.getSpeed());
        }
    }
}
