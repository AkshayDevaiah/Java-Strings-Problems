package Strings;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int len=0;
		for(int i=0;i<=str.length()-1;i++) {
			len++;
		}
		System.out.println("The length of the string is "+len);
		sc.close();

	}
			

}
