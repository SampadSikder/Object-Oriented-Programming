package atm_machine;
import java.util.Scanner;

public class TransactionClass {
    private String account_holder_name;
    private String account_phone_number;
    private int balance=10000;
    public int amount;

    //constructor

    public int getbalance(){
        return this.balance;
    }
    public void add_money(){
        balance+=amount;
    }
    public void withdraw(){
        balance-=amount;
    }


}
