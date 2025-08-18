package week3.day1.Polymorphism;

public class LoginPage extends BasePage{
	@Override
	public void performcommontasks()
	{
		System.out.println("The tasks are not performed");
	}

	public static void main(String[] args) {
		
		LoginPage l=new LoginPage();	
		System.out.println("Method Overriding");
		BasePage b=new BasePage();
		l.clickelement();
		l.entertext();
		l.findelement();
		
		l.performcommontasks();
		b.performcommontasks();
		
		// TODO Auto-generated method stub

	}

}
