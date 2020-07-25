
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
class Exercise1{
    public static void main(String[] args) throws IOException{
       int arr[],n;
       double sum=0,average;
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
        for(int i:arr)
        {
            sum=sum+i;
        }
        average=sum/arr.length;
        System.out.println("Sum:"+sum+" Average:"+average);
    
    
    
    }


}