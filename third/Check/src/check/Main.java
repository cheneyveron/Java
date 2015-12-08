package check;
/*
 * Author:Cheney Veron
 * Time:2015/12/6 YY/MM/DD
 * Project: Check
 */
public class Main {
	public static void main(String[] args){
		Machine mac = new Machine();
		Goods apple = new Goods("苹果");
		apple.isDanger = false;
		Goods bomb = new Goods("炸药");
		bomb.isDanger = true;
		Goods suit = new Goods("西服");
		suit.isDanger = false;
		Goods sulphate = new Goods("硫酸");
		sulphate.isDanger = true;
		Goods watch = new Goods("手表");
		watch.isDanger = false;
		Goods sulphur = new Goods("硫磺");
		sulphur.isDanger = true;
		try {
			mac.checkBag(apple);
		} catch (DangerException e) {
			// TODO Auto-generated catch block
			e.toShow();
		}
		try {
			mac.checkBag(bomb);
		} catch (DangerException e) {
			// TODO Auto-generated catch block
			e.toShow();
		}
		try {
			mac.checkBag(suit);
		} catch (DangerException e) {
			// TODO Auto-generated catch block
			e.toShow();
		}
		try {
			mac.checkBag(sulphate);
		} catch (DangerException e) {
			// TODO Auto-generated catch block
			e.toShow();
		}
		try {
			mac.checkBag(watch);
		} catch (DangerException e) {
			// TODO Auto-generated catch block
			e.toShow();
		}
		try {
			mac.checkBag(sulphur);
		} catch (DangerException e) {
			// TODO Auto-generated catch block
			e.toShow();
		}
	}
}
