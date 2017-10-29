package AzureServices;

public class Main {

	public static void main(String[] args) {
		
	Service test = new Service("f96086b39cb34c728e8ed9124506d9c9","westcentralus");
	//test.createPersonGroup("group1", "JonasMock", "");
	test.listPersonGroups();
  //test.createPerson("group1", "Jonas", "");
  test.listPerson("group1");
  //test.addPersonFace("group1", "213fd882-741b-4dc9-89e8-70916a815ebe", "http://bilder.augsburger-allgemeine.de/img/sport/crop39276447/1134783592-ctopTeaser-w1200/Bundestrainer-Joachim-Loew-hat-bekraeftigt-nie-mehr-als-Trainer-in-die-Bundeliga-gehen-zu-wollen.jpg");
  //test.trainPersonGroup("group1");
  //test.getPersonGroupTrainingStatus("group1");
  //test.detect("https://i0.web.de/image/140/31756140,pd=2/lukas-podolski.jpg");
	//test.verify("group1", "213fd882-741b-4dc9-89e8-70916a815ebe", "f6836e57-c133-4e37-bcff-ba6c436c0260");
	test.verify("group1", "213fd882-741b-4dc9-89e8-70916a815ebe", "de0ab4d6-852d-40f4-afc8-2564eb919568");
	

	}

}
