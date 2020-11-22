import java.io.*;
import java.util.*;
	class arraybasics {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int[] array = new int[10];
			//populating array
			for(int i=0;i<10;i++){
				array[i] = input.nextInt();
			}
	         //printing from the array
			for(int i=0;i<10;i++){
				System.out.println("Element at" + i + "is :" + array[i]);
			}
		}
	}