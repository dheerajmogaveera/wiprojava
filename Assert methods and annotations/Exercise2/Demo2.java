public class Demo2{
	public static boolean palindromeCheck(String str)
	{
		
		boolean ispalindrome=true;
		
		int len=str.length();
		for(int i=0;i<=len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1))
				ispalindrome=false;
		}
		return ispalindrome;
	}
}