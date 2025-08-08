package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int i;
		// n is the input to find prime number or not
		int n=11;
		// Divides the n value from 2 to n-1
		for ( i = 2; i < n-1; i++) {
			//if the remaining is not equal to 0 continue the loop
			if (n%i!=0) {
				continue;
			} 
			else  {
				System.out.println("It is not the prime number");
               break;
				
			}
			
		}
			
			//After completed the division 	
			if (i== n-1) {
				System.out.println("It is prime number");
				
			} 
				
			
		
		

	}

}
