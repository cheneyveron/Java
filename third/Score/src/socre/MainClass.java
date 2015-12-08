package socre;
/*
 * Author: Cheney Veron
 * Time:2015/12/6 YY/MM/DD
 * Name:ComputerAverage
 */
public class MainClass {
	public static void main(String[] args)
	{
		Gymnastics gym = new Gymnastics();
		School sch = new School();
		gym.setAverage(gym.compute(gym.getScore()));
		sch.setAverage(sch.compute(sch.getScore()));
		System.out.println("Gymnastic students' average score is:"+gym.getAverage()+"\nSchool students' average score is:"+sch.getAverage());
	}
}