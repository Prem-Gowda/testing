package collection;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cities = new HashSet();
		cities.add("London");
		cities.add("Paris");
		cities.add("Bangalore");
		cities.add("Delhi");
		System.out.println(cities.size());
		
		for(String t : cities) {
			System.out.println(t);
		}

	}

}
