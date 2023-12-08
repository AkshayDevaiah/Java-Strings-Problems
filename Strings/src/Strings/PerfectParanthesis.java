package Strings;

import java.util.Scanner;

class Paranthesis{
	void perfectpar(char[] a,int n) {
		char[] stack=new char[n];
		int top=-1;
		for(int i=0;i<=n-1;i++) {
			if(a[i]=='(' || a[i]=='{' || a[i]=='[') {
				top++;
				stack[top]=a[i];
				
			}
			else if(a[i]==')' && stack[top]=='(') {
				top--;
			}
			else if(a[i]=='}' && stack[top]=='{') {
				top--;
			}
			else if(a[i]==']' && stack[top]=='[') {
				top--;
			}
		}
		if(top==-1) {
			System.out.println("Perfect Paranthesis");
		}
		else {
			System.out.println("not a Perfect Paranthesis");
		}
	}
}

public class PerfectParanthesis {

	public static void main(String[] args) {
		Paranthesis p=new Paranthesis();
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the string");
		char[] a=sc.nextLine().toCharArray();
		int n=0;
		for(int i:a) {
			n++;
		}
		p.perfectpar(a,n);
	}

}
