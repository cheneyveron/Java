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
		double totalScore=0;
		while(scanner.hasNext())
		{
			try{double score = scanner.nextDouble();
			totalScore = totalScore+score;
			}
			catch(InputMismatchException exp){
				String t = scanner.next();
			}
		}
		scanner.close();
		return totalScore;
		}
}
