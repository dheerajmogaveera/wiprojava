import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CountyMap{
    HashMap<String,String> cmap1=new HashMap<>();
    public HashMap<String,String> saveCountryMap(String Country,String Capital)
    {
        cmap1.put(Country, Capital);
        return cmap1;
    }
    public String getCapital(String Country)
    {
        
           Set<Entry<String, String>> map = cmap1.entrySet();
		Iterator<Entry<String, String>> it = map.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> m = it.next();
			
			if (m.getKey().equals(Country))
				return m.getValue();
                        else
                        {
                            System.out.println("No Such Entry with Country"+Country);
                           
                        }
                        
                        
                }
                return null;
    }
     public String getCountry(String Capital)
    {
        
           Set<Entry<String, String>> map = cmap1.entrySet();
		Iterator<Entry<String, String>> it = map.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> m = it.next();
			
			if (m.getValue().equals(Capital))
				return m.getKey();
                        else
                        {
                            System.out.println("No Such Entry with Country"+Capital);
                           
                        }
                        
                        
                }
                return null;
    }
    
     
      public HashMap<String,String> swapMapKeyValue()
    {
           HashMap<String,String> cmap2=new HashMap<>();
           Set<Entry<String, String>> map = cmap1.entrySet();
		Iterator<Entry<String, String>> it = map.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> m = it.next();
			
			cmap2.put(m.getValue(),m.getKey());
                        
                        
                }
                return cmap2;
    }
     public ArrayList<String> MapKeyToArrList()
    {
            ArrayList<String> arrlist=new ArrayList<>();
           Set<Entry<String, String>> map = cmap1.entrySet();
		Iterator<Entry<String, String>> it = map.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> m = it.next();
			
			arrlist.add(m.getKey());
                        
                }
                return arrlist;
    }
}
