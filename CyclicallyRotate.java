package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class CyclicallyRotate {
	
public static void main(String[] args) {
		
		System.out.println("Enter no of test cases :");
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int[] array;
		while(T-->0){
			System.out.println("Enter length of the array :");
			int n=sc.nextInt();
			array=new int[n];
			
			System.out.println("Enter array values to Cyclically rotate");
			for(int i=0;i<array.length;i++){
				array[i]=sc.nextInt();
			}
			rotate(array,n);				
					
			for(int j=0;j<array.length;j++)
			  System.out.print(array[j]+" ");
			 System.out.println();

		}
	}
	
	public static int[] rotate(int[] array,int size){
		int i,temp=array[size-1]; 
		
		for(i=size-1;i>0;i--){
			array[i]=array[i-1];
		}
		array[i]=temp;
		return array;
	}
	
	
}