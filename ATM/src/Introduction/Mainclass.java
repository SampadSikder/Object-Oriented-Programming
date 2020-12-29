package Introduction;

import Bkash.Bank;
import atm_machine.InternalClass;

public class Mainclass {
    public static void main(String[] args){
       //InternalClass start= new InternalClass();//Starting Internal class
       //start.startTransaction();
        Bank bkash=new Bank();
        bkash.start_banking();


    }
}
