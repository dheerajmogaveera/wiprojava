import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int choice=0;
		double interestgain=0;
		boolean exit=false;
		Scanner sc=new Scanner(System.in);
		
		while(!exit)
		{
		
		
		System.out.println("1. Interest Calculator -- SB\n2. Interest Calculator -- FD\n3. Interest Calculator -- RD\n4. Exit");
		System.out.print("Enter your option (1..4):");
		
		choice=sc.nextInt();
		SBAccount SB=new SBAccount();
		FDAccount FD=new FDAccount();
		RDAccount RD=new RDAccount();
		try {
		switch(choice)
		{
		case 1:
			interestgain=SB.calculateInterest();
			System.out.println("Interest gained is: Rs "+interestgain+"\n");
			break;
		case 2:
			interestgain=FD.calculateInterest();
			System.out.println("Interest gained is: Rs "+interestgain+"\n");
			break;
		case 3:
			interestgain=RD.calculateInterest();
			System.out.println("Interest gained is: Rs "+interestgain+"\n");
			break;
		case 4:
			exit=true;
			break;
		default:
			System.out.println("Invalid Choice");
			
			
		}
		
		}
		
		catch(Exception e)
		{
			System.out.println(e+"\n");
		}
		
		
		
		
		}

	}

}
