/* Author: Cheney Veron
 * Time:2015/12/22
 * Name:Circle.java
 */
package example15_1;

public class Circle {
	double area,radius;
	Circle(double r){
		radius = r;
	}
	public String toString(){
		area=radius*radius*Math.PI;
		return ""+area;
	}
}
