import java.util.*; 

class AdjacencyList { 
	public static void main(String[] args) 
	{ 
		// Create an empty hash map 
		HashMap<String, LinkedList<String>> map 
			= new HashMap<>();
      
          LinkedList<String> l1 
            = new LinkedList<String>(); 
      LinkedList<String> l2 
            = new LinkedList<String>();
      LinkedList<String> l3 
            = new LinkedList<String>();
		// Add elements to the map 
		map.put("A" ,l1); 
		map.put("B" ,l2); 
		map.put("C" ,l3); 
      String start = "A";
     map.get(start).add("D");
      map.get(start).add("Z");
       map.get("B").add("E");
       map.get("C").add("F");

		System.out.println(l1);
      System.out.println(l2);
      System.out.println(l3);
	} 
} 