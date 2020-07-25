import java.util.HashSet;

public class CountryHashSet{
    HashSet<String> H1=new HashSet<String>();

    public HashSet<String> getH1() {
        return H1;
    }
    
    public HashSet saveCountryNames(String CountryName)
    {   this.H1.add(CountryName);
        return this.getH1();
    }
    public String getCountry(String CountryName)
    {
        H1.add("India");
        
         for(String i:H1)
         {
             if(i.equals(CountryName))
                 return i;
         }
        
        return null;
    }
}