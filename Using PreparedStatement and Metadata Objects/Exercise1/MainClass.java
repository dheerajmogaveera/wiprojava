
public class MainClass {
 
	public static void main(String args[])
	{
		int rollno,fees;
		DAOClass dao=new DAOClass();
		int choice=Integer.parseInt(args[0]);
		switch (choice) {
		case  1:
			if(dao.insert(args))
				System.out.println("Insertion sucessful");
			else
				System.out.println("error while insertion");
			break;
		case 2:
			 rollno=Integer.parseInt(args[1]);
			if(dao.delete(rollno))
				System.out.println("row deleted Sucessfully");
			else
				System.out.println("error while deletion");
			break;
		case 3:
			rollno=Integer.parseInt(args[1]);
			fees=Integer.parseInt(args[2]);
			if(dao.modify(rollno, fees))
				System.out.println("modification sucessful");
			else
				System.out.println("modification failed due to error");
			break;
		case 4:
			if(args.length==1)
				dao.display();
			else
			{
			  rollno=Integer.parseInt(args[1]);
			  dao.display(rollno);
			}
			break;	
		default:
			System.out.println("Invalid input");
			break;
		}
	}
	
}
