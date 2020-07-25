
import java.io.*;

class InValidCountryException extends Exception{

    public InValidCountryException() {
    }

    public InValidCountryException(String message) {
        super(message);
    }

    public InValidCountryException(String message, Throwable cause) {
        super(message, cause);
    }


}
class UserRegistration{
  static void registerUser(String userName,String userCountry)throws InValidCountryException
    {
        if(!userCountry.equals("India"))
            throw new InValidCountryException("User Outside India cannot be registered ");
        else
            System.out.println("User registration sucessfully");
    }
    public static void main(String[] args)throws IOException {
        String userName,UserCountry;
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        userName=br.readLine();
        UserCountry=br.readLine();
        try{
            registerUser(userName, UserCountry);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
}