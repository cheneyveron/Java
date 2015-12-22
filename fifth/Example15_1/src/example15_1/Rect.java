/* Author: Cheney Veron
 * Time:2015/12/22
 * Name:Rect.java
 */
package example15_1;

public class Rect {
	double sideA,sideB,area;
	Rect(double a,double b){
		sideA =a ;
		sideB =b ;
	}
	public String toString(){
		area=sideA*sideB;
		return ""+area;
	}
}
