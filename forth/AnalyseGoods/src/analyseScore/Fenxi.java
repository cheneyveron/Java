/* Author:Cheney
 * Time: 2015/12/15 YY/M/DD
 * FileName:Fenxi.java
 */
package analyseScore;

import java.util.*;

public class Fenxi {
	public static double getTotalScore(String s){
		Scanner scanner = new Scanner(s);
		scanner.useDelimiter("[^0123456789.]+");
		double volume=1;
		while(scanner.hasNext())
		{
			try{
				double vol = scanner.nextDouble();
				volume = volume*vol;
			}
			catch(InputMismatchException exp){
				scanner.next();
			}
		}
		scanner.close();
		return volume;
		}
}
