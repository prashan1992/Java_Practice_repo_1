import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashmapPractice2 {

	public static void main(String[] args) {
		SortedMap<Integer,String> map1 = new TreeMap();
		
		
		
		map1.put(12, "India");
		map1.put(2, "Australia");
		map1.put(1, "South africa");
		map1.put(4, "NewZealand");
		map1.put(15, "England");
		map1.put(6, "IReLand");
		map1.put(7, "SriLanka");
		
		
		
   SortedMap map2 =	map1.headMap(7);
   map2.put(13, "West Indies");
   System.out.print(map2);
   
   

	}

}
