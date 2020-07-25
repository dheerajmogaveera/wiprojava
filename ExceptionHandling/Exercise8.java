import java.io.*;

class NullAgeExcepton extends Exception{

    public NullAgeExcepton(String message) {
        super(message);
    }
    
}
class AgeLimitOutOfBoundsException extends Exception{

    public AgeLimitOutOfBoundsException(String message) {
        super(message);
    }
    
}
class Exercise8{
 
    public static void main(String[] args)throws IOException {
        
       try{
           if(args.length<=0)
               throw new NullAgeExcepton("Age Cannot be Empty");
           if(Integer.parseInt(args[0])<18)
               throw new AgeLimitOutOfBoundsException("Age cannot be below 18");
           if(Integer.parseInt(args[0])=>60)
               throw new AgeLimitOutOfBoundsException("Age cannot be greater than 60");
           System.out.println("Eligible");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
}