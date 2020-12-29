package Bkash;

public class Bank {
    public void start_banking(){
        Account fahad= new Account("Fahad","01732434234");

        fahad.add_money(1000);
        fahad.cash_out(100);


        System.out.println(fahad.getAccount_holder_name()+ "; "
                + fahad.getAccount_phone_number() + "; "
                + fahad.getbalance());

    }
}
