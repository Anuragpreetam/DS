class circularDoubly{
	public class Node{
		int data;Node next;Node prev;
		public Node(int d){
			this.data = d;
			this.prev = null;
			this.next = null;
		}
	}Node head = null;

	    public void insertAtBeginning(int value){//function to insert a node at the beginning
	     	Node newnode = new Node(value);
	     	if(head == null){
	     		head = newnode;
	     		newnode.prev = null;
	     		newnode.next = head;
	     	}
	     	else{
	     		Node temp = head;
	     		while(temp.next != head){
	     			temp = temp.next;
	     		}
	     		newnode.next = head;
	     		temp.next = newnode;
	     		head = newnode;
	     		
	     		// newnode.next = head;
	     		// head.prev.next = newnode;
	     		// newnode.prev = head.prev;
	     		// head.prev = newnode;
	     		// head = newnode;
	     	}
	    }

	        public void insertAtEnd(int value){//function to insert node at the end
	        	Node newnode = new Node(value);
	        	if(head == null){
	        		head = newnode;
	        		newnode.prev = head;
	     		    newnode.next = head;
	        	}
	        	else{
	        		Node temp = head;
	        		while(temp.next != head){
	        			temp = temp.next;
	        		}
	        		newnode.next = temp.next;
	        		temp.next = newnode;
	        		newnode.prev = temp;
	        	}
	        }

	            public void insertAnywhere(int value , int position){//function to insert node at anywhere in the List
	            	if (position == 0) {
	            		insertAtBeginning(value);
	            	}
	            	else{
	            		Node newnode = new Node(value);
	            	    if(head == null){
		            		head = newnode;
		        		    newnode.prev = head;
		     		        newnode.next = head;
	            	    }
		            	else{
		            		int p=0;Node temp = head;
		            		while((temp != null) && (p != (position-1))){
		            			temp = temp.next;
		            			p++;
		            		}
		            		newnode.next = temp.next;
		            		newnode.prev = temp;
		            		temp.next = newnode;
		            	}
	            	}	
	            }

	                public void deleteNode(int value){//function to delete node in the List
	                	Node temp = head;
	                	while (temp.data != value) {
	                		temp = temp.next;
	                	}
	                	if(temp == head){
	                		head = temp.next;
	                		head.prev = temp.prev;
	                	}
	                	else{
	                		temp.prev.next = temp.next;
	                		temp.next.prev = temp.prev;
	                	}
	                	display();
	                }

	                    public void display(){
	                    	Node temp = head;
	                    	while(temp.next != head){
	                    		System.out.println(temp.data);
	                    		temp = temp.next;
	                    	}
	                    	System.out.println(temp.data);
	                    	System.out.println("==================");
	                    }

	                    public static void main(String[] args) {
	                    	circularDoubly obj = new circularDoubly();
	                    	obj.insertAtBeginning(4);
	                    	obj.insertAtBeginning(3);
	                    	obj.insertAtBeginning(2);
	                    	obj.insertAtBeginning(1);
	                    	obj.insertAtEnd(5);
	                    	obj.display();
	                    	obj.insertAnywhere(0 , 0);
	                    	obj.deleteNode(5);
	                    	// obj.deleteNode(5);

	                    	
	                    }
}