package Client.Employee;

import Client.LinearSearch.LinearSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchList implements EmployeeInterface{
    Scanner sc=new Scanner(System.in);
    LinearSearch<String> stringLinearSearch=new LinearSearch<String>();
    LinearSearch<Integer> integerLinearSearch=new LinearSearch<Integer>();
    public void SearchList(){
        FetchEmployeeList fetch=new FetchEmployeeList();
    }
    public void search(){

        System.out.println("What do you want to search? 1. Name 2. ID 3. Post");
        int choice=sc.nextInt();
        sc.nextLine();
        if(choice ==1){
            List<String> nameList=new ArrayList<>();
            for(Employee employee:employeeList){
                nameList.add(employee.getName());
            }
            EmployeeInput employeeInput=new EmployeeInput();
            String toSearch=employeeInput.getName();

            int index=stringLinearSearch.Search(nameList,toSearch);
            System.out.printf("Found at index %d\n",index);

        }
        else if(choice==2){
            List<Integer>idList=new ArrayList<>();
            for(Employee employee:employeeList){
                idList.add(employee.getID());
            }
            EmployeeInput employeeInput=new EmployeeInput();
            int toSearch=employeeInput.getID();

            int index=integerLinearSearch.Search(idList,toSearch);
            System.out.printf("Found at index %d\n",index);

        }
        else if(choice==3){
            List<String>postList=new ArrayList<>();
            for(Employee employee:employeeList){
                postList.add(employee.getType());
            }
            EmployeeInput employeeInput=new EmployeeInput();
            String toSearch=employeeInput.getPost();

            int index=stringLinearSearch.Search(postList,toSearch);
            System.out.printf("Found at index %d\n",index);

        }

    }
    //Overloaded method
    public boolean search(String name, int id, String post){
        //Checking name
        List<String> nameList=new ArrayList<>();
        for(Employee employee:employeeList){
            nameList.add(employee.getName());
        }
        int nameIndex=stringLinearSearch.Search(nameList,name);
        //Checking id
        List<Integer>idList=new ArrayList<>();
        for(Employee employee:employeeList){
            idList.add(employee.getID());
        }
        int idIndex=integerLinearSearch.Search(idList,id);
        //Checking post
        List<String>postList=new ArrayList<>();
        for(Employee employee:employeeList){
            postList.add(employee.getType());
        }
        int postIndex=stringLinearSearch.Search(postList,post);


        if(nameIndex!=-1 && idIndex!=-1 && postIndex!=-1){
            if(post.equals("Manager")) {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }
    public void

    makeNameList(){

    }

    public void printList(){
        for(Employee emp:employeeList){
            System.out.println(emp.toString());
        }
    }

}
