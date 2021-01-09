package mobile_banking;

public class Bank {
    public void start_banking() {

        //Bkash System
        String sampad_pin = "3432";
        String sampad_mobile_number="01724267839";

        Bkash sampad = new Bkash("Sampad", sampad_mobile_number, sampad_pin);
        System.out.println("Initial info of Sampad:"+sampad.toString());

        sampad.add_money(10000);
        sampad.withdraw(1000,sampad_mobile_number,sampad_pin);

        System.out.println(sampad.getAccount_holder_name()+" "+ sampad.getAccount_phone_number()+" "+sampad.getbalance());

        //Nagad System
        String fahad_phone_number="01789232345";
        String fahad_pin="\0";

        Nagad fahad=new Nagad("Fahad",fahad_phone_number);
        System.out.println("Initial info of fahad:"+fahad.toString());

        fahad.add_money(10000);
        fahad.withdraw(1000,fahad_phone_number,fahad_pin);
        fahad_pin=fahad.pin_update(fahad_pin,"1234")?"1234":fahad_pin;
        fahad.withdraw(1000,fahad_phone_number,fahad_pin);

        System.out.println(fahad.getAccount_holder_name()+" "+ fahad.getAccount_phone_number()+" "+fahad.getbalance());

        //Rocket account
        String adeb_pin = "3432";
        String adeb_mobile_number="01724267839";

        Rocket adeb = new Rocket("Adeb", sampad_mobile_number, sampad_pin);
        System.out.println("Initial info of Adeb:"+sampad.toString());

        adeb.add_money(10000);
        adeb.withdraw(1000,adeb_mobile_number,adeb_pin);

        System.out.println(adeb.getAccount_holder_name()+" "+adeb.getAccount_phone_number()+" "+adeb.getbalance());

    }
}