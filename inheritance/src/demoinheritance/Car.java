package demoinheritance;

public class Car extends Machine
{
protected String number="T4542-895";
	public void start()
	{
		System.out.println("machine started");
	}
	public void wipewindshield()
	{
		System.out.println("machine running");
	}
		public void acceleration()
		{
			System.out.println("machine is accelerated");
		}
		public void stop() {
			System.out.println("machine is stop");
		}
}
