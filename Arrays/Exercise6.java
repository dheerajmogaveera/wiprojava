
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

 
class Exercise6{
    public static void main(String[] args) throws IOException{
       int arr[],n,min1,min2,max1,max2;
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
        Arrays.sort(arr);
        for(int i:arr)
        { 
            System.out.print(i+" ");
        }
        
    
    }


}