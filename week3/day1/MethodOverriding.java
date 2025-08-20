package week3.day1;

public class MethodOverriding extends MethodOverloading {
	
	public void reportstep(String msg,String status)
	{
		System.out.println(msg);
		System.out.println(status);
		//System.out.println(snap);*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding mor=new MethodOverriding();
		mor.reportstep("I am fine","not happy");

	}

}
