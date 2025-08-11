package week2.day1;

public class Browser {
	
	public String launchbrowser(String browsername) {
		
		System.out.println(browsername+ "Browser launched succesfully");
		return browsername;
	}
			public void loadUrl()
			{
				System.out.println("Application url loaded successfully");
			}

	public static void main(String[] args) {
		Browser b=new Browser();
		b.launchbrowser("Google");
		b.loadUrl();
		// TODO Auto-generated method stub

	}

}
