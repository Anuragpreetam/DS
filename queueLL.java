class queueLL{
	public class Node{
		int data;Node next;
		public Node(int d){
			this.data = d;
			this.next =null;
		}
	}Node head = null , fronttracker = null , reartracker = null;

	    public boolean isEmpty(){
	    	if(head == null){
	    		return true;
	    	}
	    	else return false;
	    }

	        public void enqueue(int value){
	        	Node newnode = new Node(value);
	        	if(isEmpty()){
	        		head = newnode;
	        		fronttracker = head;
	        		reartracker = head;
	        	}
	        	else{
	        		reartracker.next = newnode;
	        		reartracker = newnode;
	        	}
	        }

	            public void dequeue(){
	            	if(isEmpty()){
	            		System.out.println("Queue Underflow");
	            	}
	            	else{
	            		if(fronttracker == reartracker){
	            			fronttracker = null;
	            			reartracker =null;head = null;
	            		}
	            		else{
	            			Node temp = fronttracker.next;
	            			fronttracker.next =null;
	            			head = temp;
	            			fronttracker = temp;
	            		}
	            	}
	            }

	                public void display(){
	                	Node temp = head;
	                	while(temp != null){
	                		System.out.println(temp.data);
	                		temp = temp.next;
	                	}
	                	System.out.println("=======================");
	                }

	                    public static void main(String[] args) {
	                    	queueLL obj = new queueLL();
	                    	obj.enqueue(1);
	                    	obj.enqueue(2);
	                    	obj.enqueue(3);
	                    	obj.enqueue(4);
	                    	obj.display();
	                    	obj.dequeue();
	                    	obj.display();
	                    	obj.dequeue();
	                    	obj.display();
	                    	obj.dequeue();
	                    	obj.display();
	                    	obj.dequeue();
	                    	obj.display();
	                    	obj.dequeue();
	                    	obj.display();
	                    }
}