package User;

public class User {
	public static void main(String[] args)
	{
		Vehicle bike = new Vehicle(15,5);
		bike.getPower();
		bike.getSpeed();
		bike.speedUp(3);
		bike.getSpeed();
		bike.setPower(6);
		bike.getPower();
	}
}
