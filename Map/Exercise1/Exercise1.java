import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


class Exercise1{
    public static void main(String[] args) {
        CountyMap cmap=new CountyMap();
        cmap.saveCountryMap("India","New Delhi");
        cmap.saveCountryMap("Japan", "Tokyo");
        cmap.saveCountryMap("England","London");
        cmap.saveCountryMap("USA","Washington D.C");
        System.out.println(cmap.getCapital("England"));
        System.out.println(cmap.getCountry("Tokyo"));
        System.out.println(cmap.MapKeyToArrList());
        System.out.println(cmap.swapMapKeyValue());
    }
}