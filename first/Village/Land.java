package Village;

public class Land {
	public static void main(String[] args)
	{
		Village A = new Village();
		Village B = new Village();
		A.setWater(50);
		System.out.println("B villiage water is "+B.getWater());
		A.setWater(100);
		System.out.println("After A changed ,B villiage water is "+B.getWater());
	}
}