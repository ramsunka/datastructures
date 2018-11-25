package Arrays;

import java.util.Scanner;


public class NoOfRotations {
	
	public static void main(String[] args) {
		System.out.println("Enter no of test cases :");
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		long[] array;
		while(T-->0){
			System.out.println("Enter length of array ");
			int n=sc.nextInt();
			array=new long[n];
			System.out.println("Enter array elements");
			for(int i=0;i<array.length;i++){
				array[i]=sc.nextLong();
			}
			
			System.out.println("No of rotation==>"+noOfRotation(array,n));
		}
	}
	
	public static int noOfRotation(long[] array,int size){
		int rotations=0;
		long min=array[0];
 

		for(int i=1;i<size;i++){
			if(min>array[i]){
				min=array[i];
				rotations=i;
			}
		}
		if(array[0] == array[size-1] && min == array[0])
		    return size-1;
		
		return rotations;
	}

}
