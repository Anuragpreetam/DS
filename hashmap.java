import java.util.*;
class hashmap{
	public static void main(String[] args) {
		HashMap<String , Integer> hash = new HashMap<String , Integer>();
	    hash.put("xyz" , 1000);
	    hash.put("atron" , 22000);
	    hash.put("tlesa" , 3400);
	    hash.put(null , 100);
        

        // the insertion order is not retained in the hashmap.
        // Internally, for every element, a separate hash is generated and the elements are indexed
        // based on this hash to make it more efficient.


        
	    //printing the whole of HashMap
	    System.out.println(hash);
	    System.out.println("===========");

	    // printing particular value of HashMap
	    Integer a = hash.get("xyz");
	    System.out.println(a);
	    //or
	    System.out.println(hash.get("xyz"));
        
        System.out.println("===========");
	    //Looping through the HashMap keys and values

	    for (String i : hash.keySet() ) {
	    	System.out.println(i);
	    }
        
        System.out.println("===========");

	     for (Integer i : hash.values() ) {
	    	System.out.println(i);
	    }
	    System.out.println("===========");

	    for( String i : hash.keySet()){
	    	System.out.println("key is" + " " + i + " " + "value is" + hash.get(i));
	    }
	}
	
}