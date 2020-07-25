
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


class Exercise4{
    public static void main(String[] args) {
        boolean kfound=false,vfound=false;
        int vquery;
        String kquery;
        HashMap<String,Integer> ContactList=new HashMap<String, Integer>();
        ContactList.put("Abc",887778986);
        ContactList.put("XyZ",98887775);
        ContactList.put("RST",77899877);
        
        Set<Entry<String,Integer>> set=ContactList.entrySet();
        Iterator<Entry<String,Integer> >i=set.iterator();
        kquery="Abc";
        vquery=98887775;
        //check whether name exists
        while(i.hasNext())
        {
            Map.Entry<String,Integer> m=i.next();
            if(m.getKey().equals(kquery))
            {
                kfound = true;
                break;
            }
            
        }
        if(kfound)
        {
            System.out.println("Name:"+kquery+" exists");
            kfound=false;
        }
        else
        {
           System.out.println("Name:"+kquery+" does not exists");
        }
        
        //check whether contact exist
         while(i.hasNext())
        {
            Map.Entry<String,Integer> m=i.next();
            if(m.getValue()==vquery)
            {
                vfound = true;
                break;
            }
            
        }
        if(vfound)
        {
            System.out.println("ContactNumber:"+vquery+" exists");
            vfound=false;
        }
        else
        {
           System.out.println("ContactNumber:"+vquery+" does not exists");
        }
               
        Iterator<Entry<String,Integer>> iter=set.iterator();

        while(iter.hasNext())
        {
            Map.Entry m=iter.next();
            System.out.println("Name:"+m.getKey()+" ContactNumber:"+m.getValue());
        }
    }
}