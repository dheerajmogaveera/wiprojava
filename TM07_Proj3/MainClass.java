import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;



class MainClass{
    public static void main(String[] args) throws IOException {
        HashSet<Character> sym=new HashSet<>();
        HashSet<Cards> cardSet=new HashSet<>();

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);

        while(sym.size()!=4)
        {
            System.out.println("Enter card");
            char a=br.readLine().charAt(0);
            int n=Integer.parseInt(br.readLine());
            if(!sym.contains(a))
            {
            sym.add(a);
            Cards c=new Cards();
            c.setSymbol(a);
            c.setNumber(n);
            cardSet.add(c);
            }
        }
       List<String> l=new ArrayList<>();
        cardSet.forEach((c1) -> {
            l.add(c1.getSymbol()+""+c1.getNumber());
        });
        Collections.sort(l);
        System.out.println("Cards in Set are:");
       for(String card:l)
            System.out.println(card);
    }
}