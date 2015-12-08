package Dogge;
/*Author:Cheney Veron
 * 
 */
public class Main {
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		Enemy enemy = new Enemy();
		Smiles smiles = new Smiles();
		Friend friend = new Friend();
		SoftlyState soft = new SoftlyState();
		System.out.println("狗在主人面前:");dog.show(soft);
		System.out.println("狗遇到敌人:");dog.show(enemy);
		System.out.println("狗遇到朋友:");dog.show(smiles);
		System.out.println("狗遇到同伴:");dog.show(friend);		
	}
}
