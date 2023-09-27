import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDS2 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(2134, "ram");

		map.put(123, "tim");

		map.put(43, "Tom");

		map.put(6464, "Sam");

		System.out.println(map.get(43));


			HashMap<Integer, String> map1 = new HashMap<Integer, String>();
			
			
			map1.put(9990, "Sam");
			map1.put(9991, "Sam");
			
			map1.putAll(map);
			

			Set<Entry<Integer, String>> entryset = map1.entrySet();

			for (Entry<Integer, String> entry : entryset) {

				System.out.println(entry.getKey() + ":" + entry.getValue());

			
				
				
				Set<Integer> keyset =map1.keySet();
				
				
			for(Integer key: keyset) {
				
				System.out.println(key);
				
				
				System.out.println(map1.containsKey(2134));
				

System.out.println(map1.size());
map.clear();
map1.clear();
				
				
			}

		}

	}
}

	


	
