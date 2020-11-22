import java.io.*;
import java.util.*;
class AdjacencyMatrix{
    //globals
    int[][] A = new int[4][4];
    String[] vertexList = new String[4];
    HashMap<String , Integer> h = new HashMap<String , Integer>();
    public void addEdge(String start , String end){
        String startvertex = start , endvertex = end;
        int s, e;
        // for(int i=0; i<4 ; i++){
        //     if(startvertex == vertexList[i]){
        //          s = i;
        //     }
        // }
        s = h.get(startvertex);
        e = h.get(endvertex);

            // for(int j=0; j<4 ; j++){
            //     if(endvertex == vertexList[j]){
            //          e = j;
            //     }
            // }

            A[s][e] = 1;
    }

        public void initialize(){
            for(int i=0; i<4 ; i++){
                for(int j=0; j<4 ; j++){
                    A[i][j] = Integer.MIN_VALUE;
                }
            }
            vertexList[0] = "A";
            vertexList[1] = "B";
            vertexList[2] = "C";
            vertexList[3] = "D";
            h.put("A" , 0);
            h.put("B" , 1);
            h.put("C" , 2);
            h.put("D" , 3);
        }

        public void adjacentVertices(String v){
            String vertex = v;
            // for(int i =0; i< 4; i++){
            //     if(vertexList[i] == vertex){
            //         for(int j = 0 ; j<4 ; j++){
            //             if(A[i][j] > Integer.MIN_VALUE)
            //             System.out.println("Adjacent Vertex to" + " " + vertex + " is :" + vertexList[j] + " ,");
            //         }
            //     }
            // }
            int index = h.get(vertex);
            for(int i=0 ; i<4 ; i++){
                if(A[index][i] > Integer.MIN_VALUE)
                System.out.println("Adjacent Vertex to" + " " + vertex + " is :" + vertexList[i] + " ,");
            }
        }

         public boolean isConnected(String start , String end){
             int s = h.get(start);
             int e = h.get(end);
             if(A[s][e] > Integer.MIN_VALUE){
                 return true;
             }
             else return false;
         }

            public void display(){
                for(int i=0; i<4 ; i++){
                    for(int j=0; j<4 ; j++){
                        if(A[i][j] > Integer.MIN_VALUE ){
                            System.out.println("Edges exist b/w" + " " + vertexList[i] + " " + "&" + " " + vertexList[j]);
                        }
                    }
                }
            }

            public static void main(String[] args){
                AdjacencyMatrix obj = new AdjacencyMatrix();
                obj.initialize();
                obj.addEdge("A" , "B");
                obj.addEdge("B" , "C");
                obj.addEdge("C" , "D");
                obj.addEdge("D" , "A");
                // obj.addEdge("A" , "C");
                obj.addEdge("A" , "D");
                
                obj.display();
                obj.adjacentVertices("A");
                boolean result = obj.isConnected("B" , "D");
                System.out.println("Edge Exist ?" + result);
            }
}