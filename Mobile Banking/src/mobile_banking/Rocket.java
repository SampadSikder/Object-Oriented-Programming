package mobile_banking;

public class Rocket extends Account {
    public Rocket(String name,String account_phone_number,String pin){
        super(name,account_phone_number,pin);
        cashout_charge(6);
    }



}
