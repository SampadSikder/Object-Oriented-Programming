package Bkash;

public class Account {

    private String account_holder_name;
    private String account_phone_number;
    private double balance = 10000;
    //Constructor class
    public Account(String name,String account_phone_number){
        this.account_holder_name=name;
        this.account_phone_number=account_phone_number;
    }

    public void add_money(double amount){
        this.balance += amount;
        System.out.println("Add money: " + amount);
    }

    public void cash_out(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("Cash out: " + amount);
        }
        else {
            System.out.println("Failed to cash out due to balance limit");
        }
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