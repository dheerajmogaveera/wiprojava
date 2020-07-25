
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
class Exercise2{
    public static void main(String[] args) throws IOException{
       int arr[],n,min,max;
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
        min=arr[0];
        max=arr[0];
        for(int i:arr)
        { 
            if(min>i)
                min=i;
            if(max<i)
                max=i;
        }
        
        System.out.println("MIN:"+min+" MAX:"+max);
    
    
    
    }


}