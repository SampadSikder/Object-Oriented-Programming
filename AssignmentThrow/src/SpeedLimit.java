public class SpeedLimit {
    private int speed;

    public void getSpeed(int speed){
        this.speed=speed;
    }

    public void SpeedLimitCheck() throws SpeedException{
        if(speed<=100){
            System.out.println("You are under speed limit!");
        }
        else{
            throw new SpeedException(speed);
        }
    }


}
