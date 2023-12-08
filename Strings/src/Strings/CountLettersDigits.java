package Strings;

import java.util.Scanner;

public class CountLettersDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int cap=0,small=0,dig=0,space=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57) {
				dig++;
			}
			else if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				cap++;
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				small++;
			}
			else if(str.charAt(i)==' ') { 
				space++;
			}
	}
		System.out.println("Number of digits are "+dig);
		System.out.println("Number of spaces are "+space);
		System.out.println("Number of capital letters are "+cap);
		System.out.println("Number of small letters are "+small);
		sc.close();
	}

}
