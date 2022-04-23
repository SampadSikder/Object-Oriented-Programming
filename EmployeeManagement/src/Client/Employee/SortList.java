package Client.Employee;

import Client.Sort.IDComparator;
import Client.Sort.NameComparator;
import Client.Sort.SalaryComparator;

import java.util.Scanner;

public class SortList implements EmployeeInterface{
    public void sort(){
        Scanner sc= new Scanner(System.in);
        int choice;
        System.out.println("Sorting based on? 1. Name 2. ID 3. Salary");
        choice=sc.nextInt();
        if(choice==1){
            employeeList.sort(new NameComparator());
        }
        else if(choice==2){
            employeeList.sort(new IDComparator());
        }
        else{
            employeeList.sort(new SalaryComparator());
        }
        printList();
    }

    public void printList(){
        for(Employee emp:employeeList){
            System.out.println(emp.toString());
        }
    }
}
