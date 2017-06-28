package conlection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Gather {

	public static void main(String args[]){
		Map map = new TreeMap();
		map.put("a","����˭");
		map.put("b","1");
		map.put("c","1");
		map.put("d","1");
		map.put("d","2");
		
		Collection<String> liSt = map.values();
		Iterator iterator = liSt.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		String string = "abc";
		
	}
}
