import java.util.Scanner;

public class RDAccount extends Account{

	@Override
	double calculateInterest() throws InvalidAmountException,InvalidNoOfDaysException,InvalidAgeException{
		System.out.print("Enter the Average Amount in your Account:");
	    Scanner sc=new Scanner(System.in);
	    amount=sc.nextDouble();
	    if(amount<0)
	    {   
	    	throw new InvalidAmountException("Amount cannot be negative");
	    }
	    System.out.println("Enter the number of days:");
	    int noOfDays=sc.nextInt();
	    System.out.print("Enter your age");
	    int age=sc.nextInt();
	    if(noOfDays<0)
	    {
	      
	      throw new InvalidNoOfDaysException("Invalid No of days:Please enter Non negative number of days");
	    }
	    else if(noOfDays<7)
	    {
	    	
	    	throw new InvalidNoOfDaysException("Invalid No of days:No of days should be atleast 7 ");
	    }
	    if(age<=0)
	    {
	    	
	    	throw new InvalidAgeException("Invalid Age:Age should be nonnegative and greater than zero ");
	    }
	    
	    
	    if(age<60)
	    {
	    		if(noOfDays>=7 && noOfDays<=14)
	    		{
	    			interestRate=7.50;
	    		}
	    		else if(noOfDays>=15 && noOfDays<=29)
	    		{
	    			interestRate=7.75;
	    		}
	    		else if(noOfDays>=30 && noOfDays<=45)
	    		{
	    			interestRate=8.00;
	    		}
	    		else if(noOfDays>=46 && noOfDays<=60)
	    		{
	    			interestRate=8.25;
	    		}
	    		else if(noOfDays>=61 && noOfDays<=184)
	    		{
	    			interestRate=8.50;
	    		}
	    		else
	    		{
	    			interestRate=8.75;
	    		}
	    	}
	   else
	    {
	    		if(noOfDays>=7 && noOfDays<=14)
	    		{
	    			interestRate=8.00;
	    		}
	    		else if(noOfDays>=15 && noOfDays<=29)
	    		{
	    			interestRate=8.25;
	    		}
	    		else if(noOfDays>=30 && noOfDays<=45)
	    		{
	    			interestRate=8.50;
	    		}
	    		else if(noOfDays>=46 && noOfDays<=60)
	    		{
	    			interestRate=8.75;
	    		}
	    		else if(noOfDays>=61 && noOfDays<=184)
	    		{
	    			interestRate=9.00;
	    		}
	    		else
	    		{
	    			interestRate=9.25;
	    		}
	    		
	    }
	    
	 
	    
	    return amount*(interestRate/100);
	    
	        }
	    
	  
}
