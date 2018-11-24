package Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class RotateAndDelete {
	public static void main(String[] args) {
		System.out.println("Enter no of test cases :");

		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		 int numberOfIterations = 0;
		int[] array;
		while(T-->0){
			System.out.println("Enter length of array ");
			int n=sc.nextInt();
			array=new int[n];
			System.out.println("Enter array elements");

			for(int i=0;i<array.length;i++){
				array[i]=sc.nextInt();
			}//End of for loop
		
			while(array.length>1){
				array=rotate(array);
				numberOfIterations++;
				array = delete(array, numberOfIterations);
			}
			 System.out.println(array[0]);
	            numberOfIterations = 0;
		}//End of while
		
		 
	}//End of main
	
	 
	 public static int[] delete(int[] array, int numOfIt) {
	        int[] tmp = new int[array.length - 1];
	        if (array.length - numOfIt >= 0) {
	            for (int i = 0, j = 0; i < array.length; i++) {
	                if (i == array.length - numOfIt) {
	                    continue;
	                } else {
	                    tmp[j] = array[i];
	                    j++;
	                }
	            }	            

	        } else {
	        	tmp[0] = array[1];
	        }
	        System.out.println(Arrays.toString(tmp));
	        return tmp;
	    }
	
	public static int[] rotate(int[] array){
		
		for(int i=0;i<array.length;i++){
			int temp=array[array.length-1];
			array[array.length-1]=array[i];
			array[i]=temp;
		}
		return array;
	}
}
