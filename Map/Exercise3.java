import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

class Exercise3{

	public static void main(String[] args) {
		Properties properties = new Properties();
		
		properties.setProperty("Maharashtra", "Mumbai");
		properties.setProperty("Karnataka", "Bengaluru");
		properties.setProperty("Tamilnadu", "Chennai");

		Set<Entry<Object, Object>> set = properties.entrySet();
		Iterator<Entry<Object, Object>> it = set.iterator();
		
		while (it.hasNext()) {
			Entry<Object, Object> me = it.next();
			System.out.println(me);
		}
	}

}