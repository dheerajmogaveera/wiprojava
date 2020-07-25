import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



class Exercise3{
    public static void main(String[] args) throws IOException {
        int i=0,charcount=0;
        try{
           
            InputStreamReader in=new InputStreamReader(System.in);
            BufferedReader b=new BufferedReader(in);
            String file=b.readLine();
            File f=new File("inputFile.txt");
            
            BufferedReader binput=new BufferedReader(new FileReader(f));
            String s;
            
            Map<String,Integer> wordsmap= new TreeMap<>();
         while((s=binput.readLine())!=null)
         {    
             s.trim();
             String words[]=s.split(" ");
             for (String word : words) {
	           if (!wordsmap.containsKey(word))
			wordsmap.put(word, 1);
	            else
			wordsmap.put(word, wordsmap.get(word) + 1);
			}		
         }
            File fout=new File("outputFile.txt");
            fout.createNewFile();
            BufferedWriter bout=new BufferedWriter(new FileWriter(fout));
           Set<Entry<String, Integer>> set = wordsmap.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> me = it.next();
			
			bout.write(me.getKey() + " : " + me.getValue() + "\n");
		}
		
		binput.close();
		bout.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        
        
    }
    
    
}
 
