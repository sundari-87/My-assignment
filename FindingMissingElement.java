package week2.day2;

import java.util.Arrays;

public class FindingMissingElement {

	public static void main(String[] args) {
		
		int a[]= {1,4,3,2,8,6,7};
		//int length=a.length;
		Arrays.sort(a);
		int i=0;
		//1,2,3,4,6,7,8
		//System.out.println(length);
		//System.out.println(a[3]);
		for ( i = a[i]; i < a.length-1; i++) {
			if ((a[i]+1)== a[i+1]) {
				continue;
				
			}
			else
			{
				System.out.println("Missing element is "+(a[i]+1));
			}
				
			
		}
		// TODO Auto-generated method stub

	}

}
