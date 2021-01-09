package mobile_banking;

public class Bkash extends Account {


    public Bkash(String name, String account_phone_number, String pin) {
        super(name, account_phone_number, pin);
        cashout_charge(5);
        //this.mobile_number=mobileNumber;
    }

}
