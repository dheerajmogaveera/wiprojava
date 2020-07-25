import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;



class Exercise1{
    public static void main(String[] args) throws IOException {
        int i=0,charcount=0,ch;
        try{
           
            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader b=new BufferedReader(in);
            System.out.println("Enter the File name");
            String file=b.readLine();
            File f=new File(file);
            BufferedReader br=new BufferedReader(new FileReader(f));
            System.out.println("Enter the Character to be counted");
            char c=b.readLine().charAt(0);
            ch=c;
         while(br.ready())
         {
                 i=br.read();
                 if(i==ch||i==ch+32)
                     charcount++;
         }
            System.out.println("File "+file+" has "+charcount+" instances of character "+c);
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        
        
    }
    
    
}
 
