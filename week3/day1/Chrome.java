package week3.day1;

public class Chrome extends Edge {

	public void openIncognito()
	{
		System.out.println("Opened");
	}
	public void clearcache()
	{
		System.out.println("Cache cleared");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chrome c=new Chrome();
		System.out.println("Multilevel Inheritence");
		c.openurl();
		c.navigateback();
		c.clearcache();
		c.clearcookies();
		c.closebrowser();
		c.takesnap();
		c.openurl();
	
	}

}
