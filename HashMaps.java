import java.util.HashMap;
import java.util.Map;


public class HashMaps {
	//Declaring a HashMap: HashMap<Key, Value>
	//You can use any data type for a HashMap
	//When using a primitive data type,you need to use it's wrapper class
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	static Map<Integer, Map<Integer,Integer>> map2d = new HashMap<Integer, Map<Integer,Integer>>();	
	public static void main(String[] args) {
		//This is how you store stuff on a HashMap
		map.put(1, 2); //Puts 1 as the key and 2 as the value
		//This is how you get stuff on a HashMap
		map.get(1); //Returns 2
		//Returns true if the HashMap contains this key
		map.containsKey(2);//Returns false
		//Same as above,but with value
		map.containsValue(2);//Return true
		
		map2d.put(1, map);
		//Chain calls with 2d HashMaps
		map2d.get(1).put(1, 1);
		map2d.get(1).put(2, 4);
		map2d.get(1).put(3, 9);
		
		System.out.println(map2d.get(1).get(1));
		System.out.println(map2d.get(1).get(2));
		System.out.println(map2d.get(1).get(3));
	}
	//This file was changed

}
