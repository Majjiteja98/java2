package demoinheritance;

public class App {
	public static void main(String[] args) 
	{
		Machine obj=new Machine();
		obj.start();
		obj.stop();
		Car obj1=new Car();
		obj1.start();
		obj1.wipewindshield();
		obj1.acceleration();
		obj1.stop();
	}
	


}
