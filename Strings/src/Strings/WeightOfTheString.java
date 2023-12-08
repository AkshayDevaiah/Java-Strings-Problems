package Strings;

class Weight{
	int weight(char[] a) {
		int res=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>=65 && a[i]<=90) {
				res=res+(a[i]-64);
			}
			else if(a[i]>=97 && a[i]<=122) {
				res=res+(a[i]-96);
			}
		}
		return res;
	}
}


public class WeightOfTheString {

	public static void main(String[] args) {
		Weight w=new Weight();
		String str="Akshay";
		char[] a=str.toCharArray();
		int res=w.weight(a);
		System.out.println(res);
	}

}
