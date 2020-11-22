class singlyLinkedlist{
	public class Node{
		int data;Node next, head;
		public Node(int d){//constructor for creating a node
			this.data = d;
			this.next = null;
		}
	}
	     public Node insertAtBeginning(Node head , int value){//function to insert at beginning
	     	Node newnode = new Node(value);
	     	if(head == null){
	     		head = newnode;
	     		System.out.println("Head Address : " + head);
	     	}
	     	else{
	     		newnode.next = head;
	     		head = newnode;
	     	}
	     	return head;
	     }

	            public void insertAtEnd(Node head , int value){//function to insert at end
		          	Node newnode = new Node(value);
		          	if(head == null){
		          		head = newnode;
		          	}
		          	else{
		          		Node temp = head;
		          		while(temp.next != null){
		          			temp = temp.next;
		          		}
		          		temp.next = newnode;
		          	}
	            }

	                public void insertAnywhere(Node head , int position , int value){//function to insert at end
			          	Node newnode = new Node(value); int counter = 0;
			          	if(head == null){
			          		head = newnode;
			          	}
			          	else{
			          		Node temp = head; Node temp2 = head;
			          		while((temp.next != null) && (position -1 != counter)){
			          			temp2 = temp;
			          			temp = temp.next;
			          			counter++;
			          		}
			          		if(temp.next == null){
			          			System.out.println("You've exceeded the size of List");
			          		}
			          		else{
			          			newnode.next = temp2.next;
			          		    temp2.next = newnode;
			          		}
			          	}
	                }
                    
                        public void deleteNode(Node head , int value){//function to delete Node from List
                         	if(head == null){
                         		return;
                         	}
                         	else{
                         		Node temp = head; Node temp2 = head;
                         		while(temp.data != value){
                         			temp2 = temp;
                         			temp = temp.next;
                         		}
                         		if(temp == head){
                         			head = null;
                         		}
                         		else{
                         			temp2.next = temp.next;
                         		}
                         	}
                         	display(head);
                        }


			                public void display(Node head){//function to display List
			                	Node temp = head;
			                	while(temp != null){
			                		System.out.println(temp.data);
			                		temp = temp.next;
			                	}
			                	System.out.println("================");
			                }

	                public static void main(String[] args) {
	                	singlyLinkedlist obj = new singlyLinkedlist();
	                	Node address = obj.insertAtBeginning( null , 1);
	                	obj.insertAtEnd( address , 2);
	                	obj.insertAtEnd( address , 3);
	                	obj.insertAtEnd( address , 4);
	                	obj.insertAtEnd( address , 5);
	                	obj.insertAnywhere( address , 2 , 0);
	                	obj.display(address);
	                	obj.deleteNode( address , 3);
	                }
}
