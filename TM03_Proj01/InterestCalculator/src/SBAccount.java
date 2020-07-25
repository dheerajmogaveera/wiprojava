import java.util.Scanner;

public class SBAccount extends Account{

	@Override
	double calculateInterest()throws InvalidAmountException{
		System.out.print("Enter the Average Amount in your Account:");
	    Scanner sc=new Scanner(System.in);
	    amount=sc.nextDouble();
	    System.out.println("1.Normal\n2.NRI");
	    System.out.println("Enter your option (1 or 2 ):");
	    int option=sc.nextInt();
	    if(amount<0)
	    {
	    	
	    	throw new InvalidAmountException("Amount cannot be negative");
	    	
	    }
	    if(option==1)
	    {
	    	interestRate=4;
	    }
	    else if(option==2)
	    {
	    	interestRate=6;
	    }
	    else
	    {
	    	System.out.println("invalid choice");
	    	
	    	return 0;
	    }
	  
		return amount*(interestRate/100);
	}

}
