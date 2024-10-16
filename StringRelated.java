package javaBasics;

public class StringRelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="200";
        String s2="400";
        int i=200;
        int j=400;
        //over loading method 
        //plus is used for arithmetic operation as well as string concatenation
        //if an integer is added to an existing string , it will become string
        System.out.println(s1+s2);
        System.out.println(i+j);
        System.out.println(s1+i+j);
	}

}
