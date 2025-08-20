package week3.day1;

public class MethodOverloading {
	
	public void reportStep(String msg,String status)
	{
		System.out.println(msg);
		System.out.println(status);
		
	}
	public void reportstep(String msg,String status,boolean snap)
	{
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
	}

	public static void main(String[] args) {
		
		MethodOverloading mol=new MethodOverloading();
		mol.reportStep("Hi","well");
		mol.reportstep("How are you", "I am not well", false);
		

	}

}
