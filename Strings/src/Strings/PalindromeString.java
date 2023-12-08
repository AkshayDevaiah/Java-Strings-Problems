package Strings;


import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int start=0,end=str.length()-1;
		boolean isPalindrome=false;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				isPalindrome=true;
				break;
			}
			start++;
			end--;
		}
		if(isPalindrome==false) 
			System.out.println("Palindrome String");
		else
			System.out.println("Not a Palindrome");
		sc.close();

	}

}
