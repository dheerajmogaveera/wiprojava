
import java.util.ArrayList;


class Employee{
    int id;
   String empName,email,gender;
   float salary;

    public Employee(int id, String empName, String email, String gender, float salary) {
        this.id = id;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }
   void GetEmployeeDetails()
   {
       System.out.println("Employee Name:"+this.empName+" id:"+this.id+" email:"+this.email+
               " gender:"+this.gender+" Salary:"+this.salary);
       
   }

}
class EmployeeDB{
      ArrayList<Employee> list=new ArrayList<Employee>();
      boolean addEmployee(Employee e)
      {
          list.add(e);
          System.out.println("Employee added sucessfully");
          return true;
      }
      boolean deleteEmployee(int empId)
      {
          boolean found=false;
          for(int i=0;i<list.size();i++)
          {
              if(list.get(i).id ==empId)
              {
                  list.remove(i);
                  System.out.println("Employee Data deleted sucessfully");
                  found=true;
              }
              
          }
          if(found==false)
          {
              System.out.println("No Employee with id "+empId+" found");
          }
          return found;
          
      }
      String showPaySlip(int empId)
      {
          for(int i=0;i<list.size();i++)
          {
              if(list.get(i).id==empId)
              {
                  return "Employee Name:"+list.get(i).empName+" id:"+list.get(i).id+" Salary:"+list.get(i).salary;
              }
              
          }
         return "No Employee found with Id "+empId+" found";
      }
}
class Exercise2{
    public static void main(String[] args) {
        
        Employee e=new Employee(101,"ABC", "abc123@gmail.com","Male",30000);
        Employee e1=new Employee(102, "DEF","def456@gmail.com","Female",32000);
        Employee e2=new Employee(103,"GHI","ghi789@gmail.com","Male",40000);
        EmployeeDB edb=new EmployeeDB();
        edb.addEmployee(e);
        edb.addEmployee(e1);
        edb.addEmployee(e2);
        edb.deleteEmployee(101);
        edb.deleteEmployee(105);
        System.out.println(edb.showPaySlip(103));
        System.out.println(edb.showPaySlip(108));
    }

}