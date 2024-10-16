package javaBasics;

public class StaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Array is used to store similar datatypes variables
		int[] array1= {12,34,56,78};
		char[] arr= {'a','v','1'};
		
		for(int i=0; i<=array1.length-1;i++)
		{
			System.out.println(array1[i]);
		}
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.println(arr[j]);
		}
	}

}
