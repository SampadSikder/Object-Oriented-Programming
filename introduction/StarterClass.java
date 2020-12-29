package introduction;

public class StarterClass {
    public void startCounterProgram(){
        Counter car_park=new Counter();

        Counter entrance_DU, exitdoor; //object declare
        entrance_DU =new Counter();
        exitdoor=new Counter();  //assign object
        //exitdoor and entrance_du are counter functions object

        entrance_DU.initialize();

        entrance_DU.add();
        entrance_DU.add();

        //entrance_DU.number=10;

        exitdoor.initialize();
        exitdoor.add();

        car_park.initialize();
        int carpark=entrance_DU.getNumber()- exitdoor.getNumber();

        System.out.println("Entrance Value: " + entrance_DU.getNumber());//String is concated
        System.out.println("Car parking value: " + carpark);
        System.out.println("Car parking value: " + exitdoor.getNumber());

    }
}
