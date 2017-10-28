package AzureServices;

public class Main {

	public static void main(String[] args) {
		
		PersonGroup test = new PersonGroup("f96086b39cb34c728e8ed9124506d9c9","westcentralus");
		
		test.createPersonGroup("example-group-00", "Test", "UserData");
		//test.deletePersonGroup("example-group-00");

	}

}
