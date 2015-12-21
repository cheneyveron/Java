/* Author:Cheney
 * Time: 2015/12/15 YY/M/DD
 * FileName:AnaluseResult.java
 */

package analyseScore;

import java.io.*;

public class AnalyseResult {
	public static void main(String[] args){
		File fRead = new File("goods.txt");
		File fWrite= new File("goodsVolume.txt");
		try{
			Writer out = new FileWriter(fWrite,true);
			BufferedWriter bufferWrite = new  BufferedWriter(out);
			Reader in = new FileReader(fRead);
			BufferedReader bufferRead = new BufferedReader(in);
			String str = null;
			while((str=bufferRead.readLine())!=null) {
				double Volume = Fenxi.getTotalScore(str);
				str = str+" 体积:"+Volume;
				System.out.println(str);
				bufferWrite.write(str);
				bufferWrite.newLine();
			}
			bufferRead.close();
			bufferWrite.close();
		}
		catch (IOException e){
			System.out.println(e.toString());
		}
	}
}