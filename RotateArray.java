package Arrays;

import java.util.Arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		RotateArray ra=new RotateArray();
		
		int[] ltArray={1,2,3,4,5,6};
		ra.leftRotate(ltArray, 1);
		System.out.println(Arrays.toString(ltArray));
		int[] rtArray={1,2,3,4,5,6};
		ra.rightRotate(rtArray, 1);
		System.out.println(Arrays.toString(rtArray));
	}
	
	public void leftRotate(int[] ltArray,int shift){
		while(shift-->0){
		int i,temp=ltArray[0];	
		for(i=0;i<ltArray.length-1;i++)
			ltArray[i]=ltArray[i+1];
		ltArray[i]=temp;
		}
	}
	
	public void rightRotate(int[] rtArray,int shift){
		while(shift-->0){
		int i,temp=rtArray[rtArray.length-1];	
		for(i=rtArray.length-1;i>0;i--)
			rtArray[i]=rtArray[i-1];
		rtArray[i]=temp;	
		}
	}

}
