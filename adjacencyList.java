import java.util.*;
class AdjacencyList{
     HashMap<String , LinkedList<String>> h = new HashMap<String , LinkedList<String>>();

    LinkedList<String> l1 = new LinkedList<String>();
    LinkedList<String> l2 = new LinkedList<String>();
    LinkedList<String> l3 = new LinkedList<String>();
    LinkedList<String> l4 = new LinkedList<String>();

        public void initialize(){
            h.put("A" , l1);
            h.put("B" , l2);
            h.put("C" , l3);
            h.put("D" , l4);
            // h.put("E", l5);
        }

            public void addEdge(String start , String end){
                h.get(start).addFirst(end);
            }

                public boolean isConnected(String start , String end){
                    LinkedList<String> l = h.get(start);
                    for (int i = 0; i < l.size(); i++) {  
                
                        if(l.get(i) == end){
                        System.out.println("Are " + start + " & " + end + " connected ? " + " " + true);
                        return true;
                        } 
                    }
                        System.out.println("Are " + start + " & " + end + " connected ? " + " " + false);
                        return false; 
                }

                    public void display(){
                        System.out.println("A ==> " + l1);
                        System.out.println("B ==> " + l2);
                        System.out.println("C ==> " + l3);
                        System.out.println("D ==> " + l4);
                    }

                        public static void main(String[] args){
                            AdjacencyList obj = new AdjacencyList();
                            obj.initialize();
                            obj.addEdge("A" , "B");
                            obj.addEdge("B" , "C");
                            obj.addEdge("C" , "D");
                            // obj.addEdge("D" , "A");
                            obj.addEdge("A" , "C");
                            obj.addEdge("A" , "D");
                            obj.display();
                            boolean r =obj.isConnected("A" , "C");
                            r = obj.isConnected("B" , "D");
                        r = obj.isConnected("A" , "B");
                        }
}