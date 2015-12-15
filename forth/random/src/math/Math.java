package math;

import java.io.*;

public class Math {
	public static void main(String args[])
	{
		File fWrite = new File("random.txt");
		try {
			Writer out = new FileWriter(fWrite);
			BufferedWriter bufferWriter = new BufferedWriter(out);
			double average = 0;
			int i = 0,j=0;
			for(j=1;j<100000;j++){
				for ( i = 0; i<100000;i++){
					average = average + java.lang.Math.random();
				}
			}
			bufferWriter.write(average + "");
			bufferWriter.close();
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
