
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


class Exercise2{
    public static void main(String[] args) {
        boolean kfound=false,vfound=false;
        String vquery,kquery;
        HashMap<String,String> hmap=new HashMap<String, String>();
        hmap.put("India","New Delhi");
        hmap.put("Russia","Moscow");
        hmap.put("France","Paris");
        
        Set<Entry<String,String>> set=hmap.entrySet();
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
            if(m.getValue().equals(vquery))
            {
                kfound = true;
                break;
            }
            
        }
        if(kfound)
        {
            System.out.println("Key:"+vquery+" exists");
            kfound=false;
        }
        else
        {
           System.out.println("Key:"+vquery+" does not exists");
        }
               
        Iterator<Entry<String,String>> iter=set.iterator();

        while(iter.hasNext())
        {
            Map.Entry m=iter.next();
            System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());
        }
    }
}