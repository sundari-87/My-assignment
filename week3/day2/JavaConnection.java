package week3.day2;

public class JavaConnection extends MySqlConnection implements  DatabseConnection{
	
	public void operation()
	{
		System.out.println("All the operation executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection ja=new JavaConnection();
		ja.connect();
		ja.disconnect();
		ja.executeUpdate();
		ja.operation();
		ja.executeQuery();

	}

	@Override
	public void connect() {
		System.out.println("Java connected to the database");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected from the database");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Update value executed");
		
	}

}
