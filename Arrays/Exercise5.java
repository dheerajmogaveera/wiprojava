
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
class Exercise5{
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
       min1=min2=2147483647;
       max1=max2=0;
        for(int i:arr)
        { 
            if(min1>i)
            { 
                min2=min1;
                min1=i;
                
            }
            if(min2>i && i!=min1)
                min2=i;
            if(max1<i)
            {
                max2=max1;
                max1=i;
            }
            if(max2<i && i!=max1)
                max2=i;
        }
        
        System.out.println("Min1:"+min1+" Min2:"+min2+" Max1:"+max1+" Max2:"+max2);
    
    
    
    }


}