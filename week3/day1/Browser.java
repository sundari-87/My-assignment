package week3.day1;

public class Browser {
	
	String browsername="chrome";
	int browserversion=7;
	
	public void openurl()
	{
		System.out.println("The URL loaded"+browsername);
		System.out.println("The browser version"+browserversion);
	}
	public void closebrowser()
	{
		System.out.println("Closed the browser"+browsername);
	}
	public void navigateback()
	{
		System.out.println("Navigated");
	}

	public static void main(String[] args) {
		
		Browser b=new Browser();
		b.openurl();
		b.closebrowser();
		b.navigateback();
		
		// TODO Auto-generated method stub

	}

}
