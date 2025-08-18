package week3.day1.Inheritance.SingleInheritance;

public class TestData {
	
	public void entercredentials()
	{
		System.out.println("The credentials entered");
	}
	public void navigatetohomepage()
	{
		System.out.println("Navigated to home page");
	}

	public static void main(String[] args) {
		
		TestData t=new TestData();
		t.entercredentials();
		t.navigatetohomepage();
		// TODO Auto-generated method stub

	}

}
