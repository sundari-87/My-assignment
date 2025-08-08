package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//Initializing the variables
		
		int i= -1;
		int j=1;
		int k;
		System.out.println("Fibonacci Series:");
		// continue the loop till number of  counts
		for (int count=0; count < 9; count++) {
			
			k=i+j;
			System.out.println(+k);
			i=j;
			j=k;	
			
			
		}
			
		

	}

}
