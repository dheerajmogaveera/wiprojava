
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Exercise8{
    public static void main(String[] args) throws IOException{
       int arr[],n,pos6=-1,pos7=-1,sum=0;
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
       for(int i=0;i<n;i++)
       {
           if(arr[i]==6)
               pos6=i;
           if(arr[i]==7)
               pos7=i;
       }
       if(pos7==-1)
           pos6=-1;
       
       if(pos6==-1 || pos7==-1 || pos6>pos7)
       {
           for(int i=0;i<arr.length;i++)
               sum=sum+arr[i];
       }
       else
       {
           for(int i=0;i<arr.length;i++)
               if(i<=pos6 || i>=pos7)
                   sum=sum+arr[i];
       }
        System.out.println("Sum:"+sum);
    
    
    }


}