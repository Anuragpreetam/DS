class stackLL{
	public class Node{
		int data;Node prev;
		    public Node(int value){
		    	this.data = value;
		    	this.prev = null;
		    }
	}Node head = null , tracker = null , tracker2 = null;

	    public boolean isEmpty(){
	    	if(head == null){
	    		return true;
	    	}
	    	else return false;
	    }

	        public void push(int value){
	        	Node newnode = new Node(value);
	        	if(isEmpty()){
	        		head = newnode;
	        		tracker = head;
	        		newnode.prev = null;
	        	}
	        	else{
	        		newnode.prev = tracker;
	        		tracker = newnode;
	        	}
	        }

	            public void pop(){
	            	if(isEmpty()){
	            		System.out.println("Stack Underflow");
	            	}
	            	else{
	            		if(tracker.prev == null){
	            			head = null;
	            		}
	            		else{
	            			Node temp = tracker.prev;
	            		    tracker.prev = null;
	            		    tracker = temp;
	            		}	
	            	}
	            }

	                public void display(){
	                	Node temp = tracker;
	                	while(temp != null){
	                		System.out.println(temp.data);
	                		temp = temp.prev;
	                	}
	                	System.out.println("=======================");
	                }

	                    public static void main(String[] args) {
	                    	stackLL obj = new stackLL();
	                    	obj.push(5);
	                    	obj.push(4);
	                    	obj.push(3);
	                    	obj.push(2);
	                    	obj.push(1);
	                    	obj.display();
	                    	obj.pop();
	                    	obj.pop();
	                    	obj.pop();
	                    	obj.display();
	                    }
}