package introduction;
/*
Counter class
 */
public class Counter {
    private int number=0;
    public int reused=0;

    void add(){
        number=number+1;
    }
    void initialize(){
        number=0;
        reused=reused+1;
    }
    public int getNumber(){
            return this.number; //this.number ei class er number indicate kore
    }
}
