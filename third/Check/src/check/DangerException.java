package check;

public class DangerException extends Exception {
	void toShow()
	{
		System.out.println("被禁止！");
	}
	DangerException(String s){
		System.out.printf("危险品！%s",s);
	}
}
