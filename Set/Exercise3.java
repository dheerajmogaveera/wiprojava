
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


class Exercise1{
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();
        set=new TreeSet<>(Collections.reverseOrder());
        set.add("Apple");
        set.add("Mango");
        set.add("Orange");
        set.add("Grapes");
        set.add("Banana");
        Iterator i=set.iterator();
        while(i.hasNext())
            System.out.println(i.next());
       String value="Grapes";
       boolean found=false;
       for(String j:set)
       {
           if(j.equals(value))
           {
               found=true;
               break;
           }
       }
       if(found)
            System.out.println("The set has "+value);
       else
            System.out.println("The set does not have "+value);
    }
}