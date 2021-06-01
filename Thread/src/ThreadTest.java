public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        BMHThread t1=new BMHThread();
        IITThread t2=new IITThread();
        DUThread t3=new DUThread();
        //t1.start();
        try {
            t1.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        t1.start();



        t2.start();
        t3.start();

    }
}
class BMHThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("Hello " +i);
    }
}

class IITThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("IIT " +i);
    }
}


class DUThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("DU: " +i);
    }
}
