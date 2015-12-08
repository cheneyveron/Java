package truck;

public class Truck{
	double total = 0;
	double addTotalWeight(ComputeWeight a)
	{
		total = total + a.computeWeight();
		return total;
	}
	double getTotal(){
		return total;
	}
}
