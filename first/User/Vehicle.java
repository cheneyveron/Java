package User;

public class Vehicle {
	double speed=0;
	int power=0;
	Vehicle()
	{
		speed = 0;
		power = 0;
	}
	Vehicle(double s,int p)
	{
		speed = s;
		power = p;
	}
	void speedUp(double s)
	{
		speed = speed + s;
	}
	void speedDown(double s)
	{
		speed = speed - s;
	}
	void setPower(int p)
	{
		power = p;
	}
	int getPower()
	{
		System.out.println(power);
		return power;
	}
	double getSpeed()
	{
		System.out.println(speed);
		return speed;
	}

}
