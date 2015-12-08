package Shopping;
/* Author:Cheney Veron
 * Time:2015/12/6 YY/MM/DD
 * Filename:MobileShop.java
 */
public class MobileShop {
	InnerPurchaseMoney purchaseMoney1;
	InnerPurchaseMoney purchaseMoney2;
	private int mobileAmount = 0;
	private class InnerPurchaseMoney{
		int amount = 0;
		void setAmount(int m){
			amount = m;
		}
		void spent()
		{
			int pre = mobileAmount;
			mobileAmount = mobileAmount - amount/3000;
			System.out.println("用价值"+amount+"的内部购物券买了"+(pre - mobileAmount)+"部手机");
			amount = 0;
		}
	}
	MobileShop(){
		purchaseMoney1 = new InnerPurchaseMoney();
		purchaseMoney2 = new InnerPurchaseMoney();
	}
	void setMobileAmount(int m){
		mobileAmount = m;
	}
	void getMobileAmount(){
		System.out.println("手机专卖店目前有"+mobileAmount+"部手机");
	}
	public static void main(String[] args){
		MobileShop MS = new MobileShop();
		MS.purchaseMoney1.setAmount(20000);
		MS.purchaseMoney2.setAmount(10000);
		MS.setMobileAmount(30);
		MS.getMobileAmount();
		MS.purchaseMoney1.spent();
		MS.purchaseMoney2.spent();
		MS.getMobileAmount();
	}
}
