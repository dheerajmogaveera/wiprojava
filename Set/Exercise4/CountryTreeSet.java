import java.util.TreeSet;
import java.util.Iterator;


class CountryTreeSet{
    TreeSet<String> set=new TreeSet<String>();

    public TreeSet<String> getset() {
        return set;
    }
    
    public TreeSet saveCountryNames(String CountryName)
    {   this.set.add(CountryName);
        return this.getset();
    }
    public String getCountry(String CountryName)
    {
        set.add("India");
       
         for(String i:set)
         {
             if(i.equals(CountryName))
                 return i;
         }
       
        return null;
    }
}