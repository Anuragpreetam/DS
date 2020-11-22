import java.io.*;
import java.util.*;
	class mergesort{
		public void sort(int[] array){
			int n = array.length;
			int mid;
			if(n <= 1){
				return;
			}
			else{
                    mid = n/2;
                    int[] left = new int[mid];
                    int[] right = new int[n-mid];
	                    for(int i =0; i < mid; i++){
	                    	left[i] = array[i];
	                    }
	                    for(int i =mid; i < n; i++){
	                    	right[i- mid] = array[i];
	                    }
	                    sort(left);
	                    sort(right);
	                    merge(left , right ,array);
			}
		}
		//function to merge the sub-arrays formed
		public void merge(int[] left , int[] right, int[] array){
			int n1 = left.length;
			int n2 = right.length;
			int i = 0 , j= 0 , k = 0;
			while( (i < n1) && (j < n2) ){
					if(left[i] < right[j]){
	                   array[k] = left [i];
	                   i++;
					}
					else{
						array[k] = right[j];
						j++;
					}
					k++;
			}
			// if( i > n1){
				while( j < n2){
                   array[k] = right[j];
                   k++;j++;
				}
			// }
			// else {
				while( i < n1){
                   array[k] = left[i];
                   k++;i++;
				}
			// }
		}
		// return array;
		public static void main(String[] args) {
			mergesort a = new mergesort();
			int[]  array = new int[]{ 13 , 1 , 5 , 2 , 26 , 30 , 3 , 8 , 0 , 1};
			a.sort(array);
			for (int i=0;i< array.length ;i++ ) {
				System.out.println(array[i]);
			}
			

		}
	}