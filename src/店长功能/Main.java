package 店长功能;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		 TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);   
		menu myMenu =new menu();		
		manager myManger = new manager("abc", "123");
		statistic myStatistic = new statistic();
		dish tonkotsu = new dish("tonkotsu"); 
		dish shoyu = new dish("shoyu");
		dish shio = new dish("shio");
		dish spiciness_0 = new dish("spiciness_0");
		dish spiciness_1 = new dish("spiciness_1");		
		dish spiciness_2 = new dish("spiciness_2");	
		dish spiciness_3 = new dish("spiciness_3");	
		dish spiciness_4 = new dish("spiciness_4");	
		dish spiciness_5 = new dish("spiciness_5");
		dish noodles_soft = new dish("noodles_soft");
		dish noodles_medium = new dish("noodles_medium");
		dish noodles_firm = new dish ("noodles_firm");
		dish onion_no = new dish("onion_no");
		dish onion_little = new dish("onion_little");
		dish onion_lot = new dish("onion_lot");
		dish nori = new dish("nori");
		dish chashu = new dish("chashu");
		dish egg = new dish("egg");
		dish e_nori = new dish("e_nori");
		dish e_egg = new dish("e_egg");
		dish bamboo = new dish("bamboo");
		dish e_chashu = new dish("e_chashu");
		
													//程序运行时初始化所以菜品实例 同时菜品实例从txt文件中读取销量，
        while (login(scanner,myManger)==0) {		//如果是第二天,销量设为0，并在txt文件最后一行增加数据
        	System.out.println("wrong code");
        	login(scanner,myManger);
        }
        System.out.println("please select your function");
        boolean a=true;
        while(a) {
        	int functionCode = scanner.nextInt();
        	switch (functionCode) {
        case 1:
		myMenu.showPrice();//修改价格测试
		System.out.println("please input new price");
		String price1 = scanner.next();
		String price2 = scanner.next();
		String price3 = scanner.next();
		String price4 = scanner.next();
		String price5 = scanner.next();
		myMenu.changePrice(price1, price2, price3, price4, price5);
		myMenu.showPrice();     
		continue;
        case 2:
        	System.out.println(myStatistic.showWeekDate("tonkotsu")[7]);
        	System.out.println(myStatistic.getPopSpic());
        	continue;
        case 3:
        	System.out.println(tonkotsu.getNumber());
        	tonkotsu.addNumber(10);;
        	System.out.println(tonkotsu.getNumber());
        	continue;
        case 4:
        	tonkotsu.addNumber(50);
        	a=false;
        }
        }
        
		
		
	}
	public static int login(Scanner scanner, manager myManger) {
		System.out.print("Input your name: "); //登录测试
        String userName = scanner.next(); 
        System.out.print("Input your code: "); 
        String code = scanner.next(); 
        return myManger.login(userName, code);   
	}
	public static void createDish() {
		
//		dish tonkotsu = new dish(1,1,0);
	}
	
}
