package atm_machine;
import java.util.Scanner;//Scanner is imported

public class InternalClass {
   public void startTransaction() {
       String name;
       int pincode;
       System.out.println("Enter name and pincode for verification:");

       TransactionClass user = new TransactionClass();//Starting Transaction class


       Scanner sc = new Scanner(System.in);

       name = sc.nextLine();

       pincode = sc.nextInt();

       //Verification phase
       if(name == "Sampad" && pincode == 2345) {
           user.getbalance();
       } else {
           System.out.println("Authentication Failed!");
       }


           //TransactionClass user = new TransactionClass();

           //Withdraw phase

       System.out.println("1.Withdraw money 2.Add money:");
       int option = sc.nextInt();

           //Entering amount
       System.out.println("Enter amount:");
       user.amount = sc.nextInt();

       if(option==1 && user.amount>user.getbalance()){System.out.println("Not enough balance!");
                                                    return;}

       if (option == 1) {
               user.withdraw();
       }
       if (option == 2) {
               user.add_money();
       }


           //End
       System.out.println("The new balance is:" + user.getbalance());

       }

   }





