import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VideoLauncher extends VideoStore
{
    
    public static void main(String[] args)throws IOException
    {
        
     boolean exit=true;
     String name;
     int choice=0;
     Scanner sc =new Scanner(System.in);
     InputStreamReader ir=new InputStreamReader(System.in);
     BufferedReader br= new BufferedReader(ir);
     VideoLauncher vl=new VideoLauncher();
      while(exit)
      {
        System.out.println("Main Menu");
        System.out.println("=========");
        System.out.println("1. Add Videos:");
        System.out.println("2. Checkout Videos:");
        System.out.println("3. Return Videos:");
        System.out.println("4. Recieve Rating:");
        System.out.println("5. List Inventory:");
        System.out.println("6. Exit:");
        System.out.print("Enter your choice (1..6):");
        
        choice=sc.nextInt();
       switch(choice) 
       {
           case 1:
               System.out.print("Enter the name of the video you want to add:");
               name=br.readLine();
               vl.addVideo(name);
               System.out.println("Video "+"''"+name+"''"+" has been added sucessfully");
               break;
           case 2:
               System.out.print("Enter the name of the video you want to checkout:");
               name=br.readLine();
               vl.doCheckout(name);
               break;
           case 3:
               System.out.print("Enter the name of the video you want to return:");
               name=br.readLine();
               vl.doReturn(name);
               break;
           case 4:
               System.out.print("Enter the name of the video you want to rate:");
               name=br.readLine();
               System.out.print("Enter the rating for this video:");
               int rating=sc.nextInt();
               vl.recieveRating(name, rating);
               break;
           case 5:
               System.out.println("---------------------------------------------------------------------");
               vl.listInventory();
               System.out.println("---------------------------------------------------------------------");
               break;
           case 6:
               System.out.println("Exiting...!! Thanks for using the application");
               exit=false;
               break;
           default:
               System.out.println("Invalid Choice");
           
           
       }
        
      }
        
    }
    
    
}
