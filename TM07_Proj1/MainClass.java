import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class MainClass{
public static void main(String args[])
{
	List<Employee> emp=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter No of Employees");
	int n=sc.nextInt();
	sc.nextLine();
	for(int i=1;i<=n;i++)
	{
		System.out.println("Enter Employee deatils for Employee"+" "+i);
		System.out.println("Enter First Name");
		String firstname=sc.nextLine();
		System.out.println("Enter Last Name");
		String lastname=sc.nextLine();
		System.out.println("Enter Email");
		String email=sc.nextLine();
		System.out.println("Enter Address");
		String address=sc.nextLine();
		System.out.println("Enter Mobile Number");
		Long mobileno=sc.nextLong();
		sc.nextLine();
		emp.add(new Employee(firstname,lastname,email,address,mobileno));
		
	}
	Collections.sort(emp,new SortByFIrstName());
	System.out.println("Employee List: (sorted on First Name)\n");
	System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "First Name", "Last Name", "Mobile Number", "Email", "Address");
 
	Iterator<Employee> it = emp.iterator();
	while (it.hasNext()) {
		Employee e = it.next();
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
				e.getFirstName(), e.getLastName(),e.getMobileNumber(),e.getEmail(),e.getAddress());
	}
}
}
