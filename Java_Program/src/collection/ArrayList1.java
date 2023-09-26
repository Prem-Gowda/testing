package collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList();
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
