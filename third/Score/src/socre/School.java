package socre;

public class School implements ComputerAverage {
	int[] a = {20,20,30,40,50};
	int average = 0;
	int[] getScore(){
		return a;
	}
	int getAverage(){
		return average;
	}
	void setAverage(int ave){
		average = ave;
	}
	public int compute(int[] a)
	{
		int sum = 0;
		int i=0,j=0;
		
		//排序
		for (i=0;i<a.length;i++){
			for(j=1;j<=i;j++){
				if(a[j]>a[j-1]){
					int mid = a[j];
					a[j] = a[j-1];
					a[j-1] = mid;
				}
			}
		}
		
		//计算平均值
		for(i=0;i<a.length;i++){
			sum = sum+a[i];
		}
		int average = sum/a.length;
		return average;
	}
}
