package Strings;

import java.util.Scanner;

class Capitalize{
	void cap(char[] a,int n) {
		if(a[0]>=97 && a[0]<=122) {
			a[0]=(char)(a[0]-32);
		}
		if(a[n-1]>=65 && a[n-1]<=90) {
			a[n-1]=(char)(a[n-1]+32);
		}
		for(int i=1;i<=n-2;i++) {
			if(a[i]==' ') {
				if(a[i+1]>=97 && a[i+1]<=122) {
					a[i+1]=(char)(a[i+1]-32);
				}
			}
			else {
				if(a[i]>=65 && a[i]<=90) {
					a[i]=(char)(a[i]+32);
				}
			}
		}
		for(int i=0;i<=n-1;i++) {
			System.out.print(a[i]);
		}
		
	}
}
public class CapitalizeFirstLetter {

	public static void main(String[] args) {
		Capitalize c=new Capitalize();
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the string");
		char[] a=sc.nextLine().toCharArray();
		int n=0;
		for(int i:a) {
			n++;
		}
		c.cap(a,n);
		sc.close();
	}

}
