package truck;

public class Main {
	public static void main(String[] args)
	{
		Truck Truck = new Truck();
		Television TV[] = new Television[50];
		Computer PC[] = new Computer[50];
		WashMachine WM[] = new WashMachine[50];
		for(int i = 0; i<50;i++){
			TV[i] = new Television();
			PC[i] = new Computer();
			WM[i] = new WashMachine();
			Truck.addTotalWeight(TV[i]);
			Truck.addTotalWeight(PC[i]);
			Truck.addTotalWeight(WM[i]);
		}
		System.out.println("货车装载的货物重量:"+Truck.getTotal()+" kg");
	}
}
