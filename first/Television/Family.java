package Television;

public class Family {
	TV homeTV;
	void buyTV(TV t)
	{
		homeTV = t;
	}
	void remoteControl(int c)
	{
		homeTV.setChannel(c);
	}
	void seeTV()
	{
		homeTV.showProgram();
	}
}
