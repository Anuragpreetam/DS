import java.util.*;
class hashtable{
	public static void main(String[] args) {
		Hashtable<Integer , String > table = new Hashtable<Integer , String>();
		table.put(1000 , "b");
	    table.put(22000 , "a");
	    table.put(100 , "q");
	    table.put(10 , "z");
	    // System.out.println(table.get("abc"));
	    System.out.println(table);
        
     //    System.out.println("clone :");
	    // Hashtable table2 = table.clone();
	    // System.out.println(table2);



	    // public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable 

	    //if you'd like to loop through table right from start

	    // Returns Set view 
        // Set<Map.Entry<String, Integer> > st = table.entrySet(); 
        
	    for (Map.Entry m : table.entrySet() ) {
	    	System.out.println(m.getKey() + " " + m.getValue());
	    }

	    //kind of if-else
	    //this getOrDefault method only works when key is Integer

	    System.out.println(table.getOrDefault(100, "Not Found"));
	    System.out.println(table.getOrDefault(200, "Not Found"));

	}
}