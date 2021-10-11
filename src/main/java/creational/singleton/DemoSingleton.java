package creational.singleton;

public class DemoSingleton {

	public static void main(String[] args) {
		DBSingleton instance1 = DBSingleton.getInstance();
		System.out.println(instance1);
		
		DBSingleton instance2 = DBSingleton.getInstance();
		System.out.println(instance2);
		
	}

}
