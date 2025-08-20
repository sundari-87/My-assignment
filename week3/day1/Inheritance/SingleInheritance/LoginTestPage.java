package week3.day1.Inheritance.SingleInheritance;

public class LoginTestPage extends TestData{
	
	public void enterusername(String text)
	{
		System.out.println("The username is"+text);
	}
	public void enterpassword(String password) {
		System.out.println("The password is"+password);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestPage ln=new LoginTestPage();
		ln.enterusername("sundari");
		ln.enterpassword("1234");
        ln.entercredentials();
        ln.navigatetohomepage();
	}

}
