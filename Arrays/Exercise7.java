
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

 
class Exercise7{
    public static void main(String[] args) throws IOException{
       int arr[],n,temp[],j=0;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter size of the array");
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        temp=new int[n];
        System.out.println("Enter Array Values");
        for(int i=0;i<arr.length;i++)
        {
           arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        if(n==0 || n==1)
        {
        }
        else{
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
                
            }
        }
        }
        temp[j]=arr[n-1];
        arr=new int[j+1];
        for(int i=0;i<=j;i++)
            arr[i]=temp[i];
       
        System.out.println("Array after removing duplicate values");
       for(int i:arr)
       {
           System.out.println(i);
       }
    
    
    
    }


}