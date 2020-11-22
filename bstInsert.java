import java.util.*;
class bstInsert{
	public class Node{
		int data;
		Node left,right;

		 public Node(int d){
		    this.data = d;
		    this.left = null;
		    this.right = null;
	    }
	}

		public Node insert(Node root , int value){
			Node newnode = new Node(value);
			if(root == null){
				root = newnode;
			}
			else{
				if(value <= root.data){
					root.left = insert(root.left , value);
				}
				else {
					root.right = insert(root.right , value);
				}
			}
			return root;
		}

			public void preorder(Node root){
				if(root == null){
					return;
				}
				else {
					System.out.print(root.data + " ");
					preorder(root.left);
					preorder(root.right);
				}
			}

			    // public Node findmin(Node root){
			    // 	if(root == null){
			    // 		return root;
			    // 	}
				   //  	else{
				   //  		if(root.left == null){
				   //  		    // System.out.println("Min value :" + root.data);
				   //  		    return root;
				   //  	    }
					  //   	    else
					  //   		return findmin(root.left);
				   //  	}	
			    // }

				    public Node findmin(Node root){
				    	if(root == null){
				    		return root;
				    	}
				    	while(root.left != null){
				    		root = root.left;
				    	}
				    	return root;
				    }

				     public void findmax(Node root){
				    	if(root == null){
				    		return;
				    	}
					    	else{
					    		if(root.right == null){
					    		    System.out.println("Max value :" + root.data);
					    	    }
						    	    else
						    		findmax(root.right);
					    	}	
				    }

				        public int height(Node root){
				        	int left , right;
				        	if(root == null){
				        		return -1;
				        	}
				        	else{
				        		left = height(root.left);
				        		right = height(root.right);
				        	}
				        	return Math.max(left , right) + 1;
				        }

				            public boolean searchTree(Node root , int value){
				            	if(root == null){
				            		return false;
				            	}
				            	else{
				            		if(root.data == value){
				            			return true;
				            		}
				            		else{
				            			if(value <= root.data){
				            			  return searchTree(root.left , value);
				            			}
				            			else{
				            			  return searchTree(root.right , value);
				            			}
				            		}
				            	}
				            }


					            public void inorder(Node root){
					                if(root == null){
						             return;
					                }
					                else{
						                  inorder(root.left);
						                  System.out.print(root.data + " ");
						                  inorder(root.right);
					                }
				                }

					                public void postorder(Node root){
						                if(root == null){
							             return;
						                }
						                else{
							                  postorder(root.left);
							                  postorder(root.right);
							                  System.out.print(root.data + " ");
						                }
					                }

					            


                                     int rear = -1, front = -1;static int max = 50;
	                                 Node[] A = new Node[max]; 

								    public boolean isEmpty(){
								    	if(rear == -1 && front == -1){
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

	                                public void enqueue(Node value){
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
					      
					                			front = -1;
					                			rear = -1;
					                		}
					                		else{
					                			
					                			front++;
					                		}
					                	}
					                	
					                }

					                    public Node front(){
					                    	return A[front];
					                    }

					                        public Node rear(){
					                        	return A[rear];
					                        }


					                    public void bfs(Node root){
					                    	if(root == null){
					                    		return;
					                    	}
					                    	else{
					                    		enqueue(root);
					                    		while(!(isEmpty())){
					                    			
					                    			Node current = front();
					                    			System.out.println(current.data);
					                    			if(current.left != null){
					                    				enqueue(current.left);
					                    			}
					                    			if(current.right != null){
					                    				enqueue(current.right);
					                    			}
					                    			dequeue();
					                    		}
					                    	}
					                    }

						                public boolean isBst(Node root , int min , int max){
						                	if(root == null){
						                		return true;
						                	}
						                	else{
						                		if(root.data <= min || root.data > max){
						                			return false;
						                		}
						                		else{
						                			return (isBst(root.left , min , root.data) &&isBst(root.right , root.data , max));
						                		}

						                	}
						                }
                                         
						                public Node delete(Node root , int value){
						                	if(root == null){
						                		return root;
						                	}
						                	else{
						                		if(value < root.data){
						                			root.left = delete(root.left , value);
						                		}
						                		else{
						                			if(value > root.data){
						                				root.right = delete(root.right , value);
						                			}
						                			else{//case 1 : node has no children
						                				if(root.left == null && root.right == null){
						                					root = null;
						                					// return root;
						                			
						                				}
						                				else{//case 2 : node has 1 child
						                					if(root.left == null){
						                						root = root.right;
						                						// return root;
						                					}
						                					else{
						                						if(root.right == null){
						                							root = root.left;
						                							// return root;
						                						}
						                						else{//case 3 : node has 2 children
						                							Node temp = findmin(root.right);
						                							root.data = temp.data;
						                							root.right = delete(root.right , temp.data);
						                							// return root;
						                						}
						                					}
						                				}
						                			}
						                		}
						                	return root;}
						                }




										public static void main(String[] args) {
											bstInsert obj = new bstInsert();
											Node root = null;
											Node head;
											root = obj.insert(root , 10);
											root = obj.insert(root , 5);
											root = obj.insert(root , 2);
											root = obj.insert(root , 1);
											root = obj.insert(root , 12);
											// root = obj.insert(root , 12);
											// root = obj.insert(root , 18);
											// root = obj.insert(root , 40);
											// root = obj.insert(root , 1);
											System.out.print("preorder : ");
											obj.preorder(root);
           //                                  System.out.print("inorder : ");
											// obj.inorder(root);
           //                                  System.out.print("postorder : ");
											// obj.postorder(root);
											obj.findmin(root);
											obj.findmax(root);
											int h = obj.height(root);
											System.out.println("Height :" + h);
										    boolean searchresult =	obj.searchTree(root , 500);
										    System.out.println(searchresult);
										    // System.out.println("isBst ? " + obj.isBst(root , Integer.MIN_VALUE , Integer.MAX_VALUE ));
										    // head = obj.delete(root , 15);
										    obj.bfs(root);
										}
		   
}