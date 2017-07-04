package stillcow;

import java.util.Arrays;

/**
 * 1 头母牛，3岁后每年生1头,9岁直接不生  15岁直接死亡
 * @author Poche.lzx
 *
 */


public class DemoCow {

	/**
	 * 写一个通用方法取得数组区间的和
	 * 
	 * 初始a - b 下标相加
	 * 
	 */
	public long[] cows=new long[]{2,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	
	public long askSum(long[] cows,int a,int b){
		long num=0;
		for(int i=a;i<=b;i++)
		
			num+=cows[i];
		
		return num;
	}
	
	public void cowGrow(long[] cows){
		
		for(int i=cows.length-1;i>0;i--)
		{
			if(i>0)
			
			cows[i]=cows[i-1];
			
		}
		cows[0]=this.askSum(cows, 2, 7);
	}
	
	public static void main(String[] args) {
		int years=20;
		DemoCow demoCow = new DemoCow();
		
		for(int i=1;i<=years;i++)
		{	
			System.out.println(Arrays.toString(demoCow.cows)+"\n");
			System.out.println("第"+i+"年，总共有："+demoCow.askSum(demoCow.cows, 0, 13)+"头牛");
			demoCow.cowGrow(demoCow.cows);
			
			
		}
		
		
	}
	
	
}
