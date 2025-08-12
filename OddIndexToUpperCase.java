package week2.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test="changeme";
		char[] c=test.toCharArray();
		char[] c1=c;
		// TODO Auto-generated method stub
		for (int i = 0; i <= c.length-1; i++) {
			if (i%2!=0) {
			c1[i]=	Character.toUpperCase(c[i]);
	
			}
			
		}

		System.out.println(c1);
	}

}
