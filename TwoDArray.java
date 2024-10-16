package javaBasics;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr= {};
        arr[0][0]=3;
        arr[0][1]=4;
        arr[0][2]=5;
        
        arr[1][0]=13;
        arr[1][1]=14;
        arr[1][2]=15;
        
        arr[2][0]=23;
        arr[2][1]=24;
        arr[2][2]=25;
        
        
        for(int row=0;row<=arr.length-1;row++)
        {
        	for(int column=0;column<=arr[0].length-1;column++)
        	{
        		System.out.println(arr[row][column]);
        	}
        }
	}

}
