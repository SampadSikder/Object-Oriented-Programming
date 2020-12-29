package Bkash;

public class Bank {
    public void start_banking(){
        String fahad_pin="1234";
        String adeb_pin="2345";
        Account fahad= new Account("Fahad","01732434234",fahad_pin);
        Account adeb=new Account("Adeb","01231324545",adeb_pin);

        System.out.println("Initial balance of fahad: "+fahad.toString());
        System.out.println("Initial balance of Adeb: "+adeb.toString());

        fahad.add_money(10000);
        adeb.add_money(1000);

        adeb.cash_out(235,adeb_pin);
        fahad.cash_out(1000,fahad_pin);

        fahad.cash_out(1000,adeb_pin);

        //if(fahad.pin_update(fahad_pin,"3432")){
           // fahad_pin="3432";
       // }
        fahad_pin=fahad.pin_update(fahad_pin,"3432")?"3432":fahad_pin;
                                                            //True:false


        fahad.cash_out(1000,fahad_pin);


        System.out.println(fahad.getAccount_holder_name()+ "; "
                + fahad.getAccount_phone_number() + "; "
                + fahad.getbalance());
        System.out.println(adeb.getAccount_holder_name()+ "; "
                + adeb.getAccount_phone_number() + "; "
                + adeb.getbalance());
    }
}


    public double getbalance(){
        return this.balance;
    }


}
