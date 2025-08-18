package week3.day1.Polymorphism;

public class APIClient {
	
	public void sendrequest(String endpoint)
	{
		System.out.println(endpoint);
	}
	
	public void sendrequest(String endpoint,String requestbody,boolean requeststatus)
	{
		System.out.println(endpoint+" "+requestbody+""+requeststatus);
	}

	public static void main(String[] args) {
		
		APIClient ap=new APIClient();
		ap.sendrequest("end point");
		ap.sendrequest("end point", "Body", true);
		
		// TODO Auto-generated method stub

	}

}
