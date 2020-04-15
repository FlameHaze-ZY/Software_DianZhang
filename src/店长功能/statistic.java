package 店长功能;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class statistic {
	public String getPopSpic() {   //返回最近七天最受欢迎香料,销量相同返回一串
		int spicNum[]= new int[] {showWeekDate("spiciness_0")[7],showWeekDate("spiciness_1")[7],showWeekDate("spiciness_2")[7],showWeekDate("spiciness_3")[7],showWeekDate("spiciness_4")[7],
										showWeekDate("spiciness_5")[7]};
		Arrays.sort(spicNum);
		String bestSale="";
		if(spicNum[5]==showWeekDate("spiciness_0")[7]) {
			bestSale = bestSale +" " + "spiciness_0";
		} if (spicNum[5]==showWeekDate("spiciness_1")[7]){
			bestSale = bestSale +" " + "spiciness_1";
		} if (spicNum[5]==showWeekDate("spiciness_2")[7]){
			bestSale = bestSale +" " + "spiciness_2";
		} if (spicNum[5]==showWeekDate("spiciness_3")[7]){
			bestSale = bestSale +" " + "spiciness_3";
		} if (spicNum[5]==showWeekDate("spiciness_4")[7]){
			bestSale = bestSale +" " + "spiciness_4";
		} if (spicNum[5]==showWeekDate("spiciness_4")[7]){
			bestSale = bestSale +" " + "spiciness_5";
		}
		return bestSale;
	}
	
	
	public int[] showWeekDate(String dish) {   //返回值为int数组 前七个元素为销量最后一个为总销量
		String dishLocation = "C:\\Users\\Shana\\Desktop\\dish\\" + dish + ".txt";//拼接文件地址
		File file = new File(dishLocation);
		int totalNum=0;
		
		String volumeTotal[] = new String[7]; //表示某菜品最近七天的销量 从时间远到时间近
		int volumeStatistic [] = new int[8]; //前七个元素为销量最后一个为总销量
		BufferedReader reader = null;
		
		int lineNum=0;
		try {
			reader = new BufferedReader(new FileReader(file));
			while(reader.readLine()!=null) {
				lineNum++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println(lineNum);
		
			try {
				reader = new BufferedReader(new FileReader(file));
				for (int a=0;a<lineNum;a++) {
					if(a>=lineNum-7) {
						try {
//							System.out.println(reader.readLine());
							String volume[] = reader.readLine().split(" "); //第一个元素销量第二个元素时间
							volumeTotal[a+7-lineNum]= volume[0];
						} catch (IOException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}else {
						try {
							reader.readLine();
						} catch (IOException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}
					}
				}
			} catch (FileNotFoundException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
			for (String n : volumeTotal) {
//	            System.out.println(n);
	            totalNum += Integer.parseInt(n);
	        }
//			return totalNum;
			for(int i= 0;i<7;i++)	{
				volumeStatistic[i] = Integer.parseInt(volumeTotal[i]);
			}
			volumeStatistic[7] = totalNum;
			return volumeStatistic;
		
	}
	
}
