import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String args[])
	{
    int choice=0;
    String item;
	List<String> itemlist=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	while(choice!=5)
	{
		System.out.println("1.Insert\n2.Search\n3.Delete\n4.Display\n5.Exit");
		choice=sc.nextInt();
		sc.nextLine();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the item to be inserted");
			item=sc.nextLine();
			itemlist.add(item);
			System.out.println("Item "+item+" inserted sucessfully");
			break;
		case 2:
			System.out.println("Enter the item to be searched");
			item=sc.nextLine();
			if(itemlist.contains(item))
				System.out.println("Item found in the list");
			else
				System.out.println("Item not found in the list");
			break;
		case 3:
			System.out.println("Enter the item to be deleted");
			item=sc.nextLine();
			if(!itemlist.contains(item))
				System.out.println("No such item exists in the list");
			else
				{
				 itemlist.remove(item);
				 System.out.println("Item Deleted SucessFully");
				}
			break;
		case 4:
			System.out.println("The items in the list are:");
			for(String s:itemlist)
				System.out.println(s);
			break;
		case 5:
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		}
	}
	
}
