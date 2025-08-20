package week3.day1;

public class Edge extends Browser {
	
	public void takesnap()
	{
		System.out.println("Snap");
	}
	
	public void clearcookies()
	{
		System.out.println("Cleared cookies");
	}
	public static void main(String[] args) {
		
		Edge e=new Edge();
		System.out.println("Simple Inheritance");
		e.openurl();
		e.clearcookies();
		e.closebrowser();
		e.takesnap();
		e.navigateback();
		
		// TODO Auto-generated method stub

	}

}
