package check;

public class Machine {
	void checkBag(Goods goods) throws DangerException{
		if(goods.isDanger == true)
		{
			throw new DangerException(goods.name);
		}else{
			System.out.println(goods.name+"不是危险品！"+goods.name+"检查通过");
		}
	}
}
