public class SpeedException extends Exception{
    private int speed;

    public SpeedException(int speed){
        this.speed=speed;
    }
    public int getSpeed(){
        return speed-100;
    }

}
