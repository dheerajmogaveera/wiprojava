public class Employee{
	public static String findName(ArrayList<String> emp,String name)
	{
		String result="";
		if(emp.contains(name))
			result="FOUND";
		else {
			result=" NOT FOUND";
			}
		
		return result;
	}
}