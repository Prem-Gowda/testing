package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> td = new HashMap();
		td.put(1,"Prem");
		td.put(2,"Kumar");
		td.put(3,"Ravi");
		td.put(4,"Lakshmi");
		
		for(Entry m:td.entrySet()) {
			System.out.println(m.getKey()+ "-" + m.getValue());
			
		}
		System.out.println(td.containsKey(3));

	}

}
