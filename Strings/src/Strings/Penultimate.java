package Strings;

import java.util.Scanner;

class PenString{
	void penultimate(char[] a,int n) {
		int count=0,i=0;
		for( i=n-1;i>=0;i--) {
			if(a[i]==' ') {
				count++;
				if(count==2) {
					break;
				}
			}
		}
		i++;
		if(count==0) {
			System.out.println("No penultimate String");
		}
		else {
			while(a[i]!=' ') {
				System.out.print(a[i]);
				i++;
			}
		}
	}
}


public class Penultimate {

	public static void main(String[] args) {
		PenString ps=new PenString();
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the string");
		char[] a=sc.nextLine().toCharArray();
		int n=0;
		for(int i:a) {
			n++;
		}
		ps.penultimate(a,n);
		sc.close();
	}

}
