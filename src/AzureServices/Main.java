package AzureServices;

public class Main {

	public static void main(String[] args) {
		
	Person test = new Person("f96086b39cb34c728e8ed9124506d9c9","westcentralus");
	//test.listPersonGroups();
	
	//test.createPerson("example-group-00", "John", "");
	test.listPerson("example-group-00");
	test.updatePerson("example-group-00", "dc1e040e-2987-485d-9707-259c5af4be3c", "Johnny", "Update");
	test.listPerson("example-group-00");
	

	}

}
