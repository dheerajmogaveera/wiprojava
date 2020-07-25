
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


class MainClass{
    public static void main(String[] args)throws IOException{
        
        Map<Character,List<Card>> cardmap=new HashMap<Character,List<Card>>();
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter number of cards");
        int n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter card "+""+i);
            char symbol=br.readLine().charAt(0);
            int no=Integer.parseInt(br.readLine());
            Card c=new Card(symbol, no);
            if(!cardmap.containsKey(symbol))
            {
                List<Card> l=new ArrayList<Card>();
                l.add(c);
                cardmap.put(symbol,l);
            }
            else
            {
                List<Card> l=cardmap.get(symbol);
                l.add(c);
            }
        }
        TreeMap<Character,List<Card>> sortedmap=new TreeMap<Character,List<Card>>();
        sortedmap.putAll(cardmap);
        for(Map.Entry<Character,List<Card>> entry:sortedmap.entrySet())
        {   
            int k=0,sum=0;
            System.out.println("Cards in symbol"+" "+entry.getKey()+" are:");
            for(Card c:entry.getValue())
            {
                System.out.println(c.getSymbol()+" "+c.getNumber());
                k++;
                sum=sum+c.getNumber();
            }
            System.out.println("Number of cards:"+k);
            System.out.println("Sum of Numbers:"+sum);
        }
    }
}