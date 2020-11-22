class queuearray{
	int rear = 0, front = 0;static int max = 10;
	int[] A = new int[max];

	    public boolean isEmpty(){
	    	if(rear == 0 && front == 0){
	    		return true;
	    	}
	    	else{
	    		return false;
	    	}
	    }

	        public boolean isFull(){
	        	if(rear == max -1){
	        		return true;
	        	}
	        	else return false;
	        }

	            public void enqueue(int value){
	            	if(isFull()){
	            		System.out.println("Queue Overflow");
	            	}
	            	else{
	            		if(isEmpty()){
	            			front++; rear++;
	            			A[rear] = value;
	            		}
	            		else{
	            			rear ++;
	            			A[rear] = value;
	            		}
	            	}
	            }

	                public void dequeue(){
	                	if(isEmpty()){
	                		System.out.println("Queue Underflow");
	                	}
	                	else{
	                		if(front == rear){
	                			// A[front] = 0;
	                			front = 0;
	                			rear =0;
	                		}
	                		else{
	                			// A[front] = 0;
	                			front++;
	                		}
	                	}
	                	// display();
	                }

	                    public int front(){
	                    	return A[front];
	                    }

	                        public int rear(){
	                        	return A[rear];
	                        }

	                            public void display(){
	                            	int tops = front;
	                            	while(tops <= rear){
	                            		System.out.println(A[tops]);
	                            		tops++;
	                            	}
	                            	System.out.println("=======================");
	                            }

	                                public static void main(String[] args) {
	                                	queuearray obj = new queuearray();
	                                	obj.enqueue(1);
	                                	obj.enqueue(2);
	                                	obj.enqueue(3);
	                                	obj.enqueue(4);
	                                	obj.display();
	                                	obj.dequeue();
	                                	obj.dequeue();
	                                	obj.dequeue();
	                                	obj.dequeue();
	                                	obj.dequeue();
	                                	obj.dequeue();
	                                	obj.enqueue(1);
	                                	obj.enqueue(2);
	                                	obj.enqueue(3);
	                                	obj.enqueue(4);
	                                	obj.display();


	                                }
}