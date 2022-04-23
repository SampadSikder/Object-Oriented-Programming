package Client.Employee;



public class EmployeeLogin {

    public EmployeeLogin(){
        FetchEmployeeList fetch=new FetchEmployeeList();
    }
    public void Login(){
        EmployeeInput employeeInput=new EmployeeInput();
        String name=employeeInput.getName();
        int id=employeeInput.getID();
        String post= employeeInput.getPost();
        SearchList s=new SearchList();
        if(s.search(name,id,post)){
            System.out.println("Logged in successfully");
            new EmployeeManager();
        }
        else{
            System.out.println("Cannot login!");
        }
    }

}
