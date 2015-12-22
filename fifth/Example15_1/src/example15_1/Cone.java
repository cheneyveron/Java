/* Author: Cheney Veron
 * Time:2015/12/22
 * Name:Cone.java
 */
package example15_1;

public class Cone<E> {
	double height;
	E buttom;
	public Cone (E b){
		buttom = b;
	}
	public void setHeight(double h){
		height = h;
	}
	public double computerVolume() {
		String s = buttom.toString();
		double area = Double.parseDouble(s);
		return 1.0/3.0*area*height;
	}
}
