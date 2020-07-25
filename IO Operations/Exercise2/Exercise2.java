import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



class Exercise2{
    public static void main(String[] args) throws IOException {
        int i=0,charcount=0;
        try{
           
            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader b=new BufferedReader(in);
            System.out.println("Enter the Input File name");
            String file=b.readLine();
            File f=new File(file);
            System.out.println("Enter the Name Of the File where the contents are to be Copied");
            String fcopy=b.readLine();
            File filecopy=new File(fcopy);
            filecopy.createNewFile();
            BufferedReader binput=new BufferedReader(new FileReader(f));
            BufferedWriter bcopy=new BufferedWriter(new FileWriter(filecopy));
         while(binput.ready())
         {      
                 i=binput.read();
                 bcopy.write(i);
                 
         }
            System.out.println("File is Copied");
             binput.close();
             bcopy.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
       
    }
    
    
}
 
