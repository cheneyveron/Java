package check;

public class Goods {
	public String name;
	public boolean isDanger = false;
	void setIsDanger(boolean a)
	{
		isDanger = a;
	}
	Goods(String x){
		name = x;
	}
}
