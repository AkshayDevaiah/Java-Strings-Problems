package Strings;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.nextLine();
		System.out.println("Enter the String");
		String str2=sc.nextLine();
		An a=new An();
		String res=a.an(str1,str2);
		System.out.println(res);
		sc.close();
	}
}
class An{
	public String an(String str1,String str2) {
		int count1=0;
		int count2=0;
		String ref=str1;
		int found=0;
		if(str1.length()==str2.length()) {
			for(int i=0;i<=ref.length()-1;i++) {
				for(int j=0;j<=str1.length()-1;j++) {
					if(ref.charAt(i)==str1.charAt(j)) {
						count1++;
						break;
					}
				}
				for(int k=0;k<=str1.length()-1;k++) {
					if(ref.charAt(i)==str2.charAt(k)) {
						count2++;
						break;
					}
				}
				if(count1!=count2) {
					found=1;
					break;
				}		
			}
		}
		else {
			found=1;
		}
		if(found==1) {
			return "no";
		}
		else {
			return "yes";
		}
	}
}