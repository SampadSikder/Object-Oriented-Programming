package mobile_banking;

public class Nagad extends Account{
    public Nagad(String name,String phone_number){
        super(name,phone_number);
        cashout_charge(3);
    }


}
