
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
class Exercise1{
    public static void main(String[] args) throws IOException{
       int arr[],n,selement;
       boolean found=false;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter size of the array");
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        System.out.println("Enter Array Values");
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the element to be searched");
        selement=Integer.parseInt(br.readLine());
        for(int i=0;i<arr.length;i++)
        { 
          if(arr[i]==selement)
          {
                System.out.println(i);
                found=true;
                break;
          }
        }
        if(found==false)
            System.out.println(-1);
        
        
    
    
    }


}