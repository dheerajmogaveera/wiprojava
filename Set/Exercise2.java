
import java.util.HashSet;
import java.util.Iterator;


class Exercise2{
    public static void main(String[] args) {
        HashSet<String> employeeNameRegistry=new HashSet<String>();
        employeeNameRegistry.add("Pete");
        employeeNameRegistry.add("Scott");
        employeeNameRegistry.add("Alicia");
        employeeNameRegistry.add("Andrew");
        employeeNameRegistry.add("Rebecca");
        Iterator i=employeeNameRegistry.iterator();
        while(i.hasNext())
            System.out.println(i.next());
    }
}