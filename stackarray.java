class stackarray{
	int top = -1; static int max = 3;int[] A = new int[max];
	public boolean isEmpty(){
		if(top == -1){
			return true;
		}
		else
			return false;
	}

	    public void push(int value){
	    	if(isEmpty()){
	    		top++;
	    		A[top] = value;
	    	}
	    	else{
	    		if(top == max-1){
	    			System.out.println("StackOverflow");
	    		}
	    		else{
	    			top++;
	    			A[top] = value;
	    		}
	    	}
	    }

	        public void pop(){
	        	if(isEmpty()){
	        		System.out.println("StackUnderflow");
	        	}
	        	else{
	        		// A[top] = 0;
	        		top--;
	        		display();
	        	}
	        }

	            public void display(){
	            	int tops = top;
	            	for(int i=tops; i>= 0; i--){
	        		System.out.println(A[i]);
	        	}
	        	System.out.println("=======================");
	            }

			        public static void main(String[] args) {
			        	stackarray obj = new stackarray();
			        	obj.push(1);
			        	// obj.push(2);
			        	// obj.push(3);
			        	// obj.push(4);
			        	// obj.push(5);
			        	obj.display();
			        	obj.pop();
			        	obj.pop();

			        }
}