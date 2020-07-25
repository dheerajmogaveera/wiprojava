
import java.util.ArrayList;


class Exercise1{
    public static void main(String[] args) {
        
        ArrayList<String> arrlist=new ArrayList<String>();
        arrlist.add("January");
        arrlist.add("February");
        arrlist.add("March");
        arrlist.add("April");
        arrlist.add("May");
        arrlist.add("June");
        arrlist.add("July");
        arrlist.add("August");
        arrlist.add("September");
        arrlist.add("October");
        arrlist.add("November");
        arrlist.add("December");
        
        for(String s:arrlist)
        {
            System.out.println(s);
        }
    }
    
}