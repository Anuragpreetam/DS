import java.io.*;
import java.util.*;
class quicksortTest{
	public int partition(int[] A , int start , int end){//prtition function
		int pindex = start;
		int temp;
		int pivot = end;
		int comp = A[pivot];
		for (int i=start; i< end ;i++ ) {
			if(A[i] <= comp){
				//Swaping A[i] & A[pindex]
				temp = A[i];
				A[i] = A[pindex];
				A[pindex] = temp;
				pindex++;
			}else{
				continue;
			}
		}
		//Swaping A[pivot] & A[pindex]
		temp = A[pivot];
		A[pivot] = A[pindex];
		A[pindex] = temp;
		return pindex;
	}
     
        public void quicksort(int[] A , int start , int end){
        	if(start < end){
        		int pindex = partition(A , start , end);
        		// return quicksort(A , start , pindex - 1);
        		// return quicksort(A , pindex +1 , end);
        		quicksort(A , start , pindex - 1);
        		quicksort(A , pindex +1 , end);
        	}
        	else
        		return;
        }
             public static void main(String[] args) {
             	quicksortTest obj = new quicksortTest();
             	int[] A = new int[]{7 , 2 , 1 , 6 , 8 , 5 , 3 ,4};
             	// int[] result = obj.quicksort(A , 0 , A.length);
             	obj.quicksort(A , 0 , A.length -1);
                for (int ans : A ) {
                	System.out.println(ans);
                }
             }
}