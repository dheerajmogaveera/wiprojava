
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


class Exercise5{
    public static void main(String[] args) {
        boolean kfound=false,vfound=false;
        String vquery,kquery;

        TreeMap<String,String> ContactList=new TreeMap<String, String>();

        ContactList.put("India","New Delhi");
        ContactList.put("Russia","Moscow");
        ContactList.put("France","Paris");
        
        Set<Entry<String,String>> set=ContactList.entrySet();
        Iterator<Entry<String,String> >i=set.iterator();
        kquery="Russia";
        vquery="Paris";
        //check whether key exists
        while(i.hasNext())
        {
            Map.Entry<String,String> m=i.next();
            if(m.getKey().equals(kquery))
            {
                kfound = true;
                break;
            }
            
        }
        if(kfound)
        {
            System.out.println("Key:"+kquery+" exists");
            kfound=false;
        }
        else
        {
           System.out.println("Key:"+kquery+" does not exists");
        }
        
        //check whether value exist
         while(i.hasNext())
        {
            Map.Entry<String,String> m=i.next();
            if(m.getKey().equals(kquery))
            {
                kfound = true;
                break;
            }
            
        }
        if(kfound)
        {
            System.out.println("Key:"+kquery+" exists");
            kfound=false;
        }
        else
        {
           System.out.println("Key:"+kquery+" does not exists");
        }
               
        Iterator<Entry<String,String>> iter=set.iterator();

        while(iter.hasNext())
        {
            Map.Entry m=iter.next();
            System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());
        }
    }
}