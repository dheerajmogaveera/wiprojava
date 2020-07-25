package TestSuite;

public class Demo2 {
	public boolean palindromeCheck(String input)
	{
		 boolean isPalindrone;
	     StringBuffer buffer = new StringBuffer(input);
	     buffer.reverse();
	     String data = buffer.toString();
	     
	     if(input.equals(data))
	     {
	    	 isPalindrone= true;
	     } 
	     else 
	     {
	    	 isPalindrone= false;
	     }
	     return isPalindrone;
		
	}
}
