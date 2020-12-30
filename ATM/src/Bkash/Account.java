package Bkash;

public class Account {

    private String account_holder_name;
    private String account_phone_number;
    private double balance = 10000;
    private String pin;

    //Constructor class with name,phone number and pin
    public Account(String name,String account_phone_number,String pin){
        this.account_holder_name=name;
        this.account_phone_number=account_phone_number;
        this.pin=pin;
    }

    //Constructor without pin number to make new account without pin
    public Account(String name,String account_phone_number){
        this.account_holder_name=name;
        this.account_phone_number=account_phone_number;
        this.pin="\0";
    }


    //For those who didnt use pin during account making and those who want to change pin
    public boolean pin_update(String old_pin, String new_pin){
        if(this.pin=="\0"){
            this.pin=new_pin;
            System.out.println("New pin initialized! "+pin_print());
            return true;
        }
        else if(old_pin==this.pin){
            this.pin=new_pin;
            System.out.println("Pin updated! "+pin_print());
            return true;
        }
        else{
            System.out.println("Old pin doesnt match "+pin_print());
            return false;
        }

    }
    private String pin_print(){
        String new_pin_info = getAccount_holder_name()+ "Pin: " +this.pin;
        return new_pin_info;
    }

    public void add_money(double amount){
        this.balance += amount;
        System.out.println("Add money: " + amount + " "+ account_holder_name);
    }

    public void cash_out(double amount,String pin){

        if(pin!=this.pin){
            System.out.println("Pin doesn't match or is not updated!");}

        //Not proceed command when no pin is initialized
        else if(pin==this.pin && pin=="\0"){
            System.out.println("Pin not initialized");
        }
        else{
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Cash out: " + amount + account_holder_name);
                } else {
                    System.out.println("Failed to cash out due to balance limit");
                }
            }
    }



    public String toString(){
        return "Account: {" +"Account holder name "+ account_holder_name +" Account phone number "+account_phone_number+
                " Balance " + balance + "}";
    }

    public String getAccount_holder_name(){
        return this.account_holder_name;
    }

    protected String getAccount_phone_number(){
        return this.account_phone_number;
    }

    public double getbalance(){
        return this.balance;
    }


}