package stillcow;

import java.util.ArrayList;
import java.util.Scanner;

public class Cow {
	int age;
	char sex;
	boolean alive=true;
	static ArrayList<Cow> al = new ArrayList<>();
	
	public Cow (int age,char sex){
		this.age=age;
		this.sex=sex;
		
	}
	
	void jugeCow(int j){
		//对每头牛进行判断 针对于年龄
		age++;
		
		if(age>=3&&age<9)
		{  
			al.add(new Cow(1,'f'));}
		if(age>=15)
		{
			//al.remove(j);//1078  1714 2726   1076 1710 2718
			this.alive=false;
		}
		
	}
	public static void main(String[] args) {
		int death=0,cow=2;
		//初始化 一开始有几头母牛 因为juge一次就age++所以初始化的时候给了0开始
		for(int j=0;j<cow;j++)
		al.add(new Cow(0,'f'));
		
		Scanner scan= new Scanner(System.in);
		System.out.println("请输入需要计算的年数：(3岁开始生 9岁不生 15岁死亡)");
		int year= scan.nextInt();
		for(int i=1;i<=year;i++){
			int length= al.size();
			death=0;
			for(int j=0;j<length;j++)//遍历arraylist 对每只牛进行年龄判断处理 同时统计标记了死亡的牛
			{
				
				al.get(j).jugeCow(j);
				if(!al.get(j).alive)
					death++;
			}
			
			
			
			
			
			
			System.out.println("第"+i+"年 总共有"+(al.size()-death)+"头牛");
		}
		
		scan.close();
		
	}
	

	
	
}
