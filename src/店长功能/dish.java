package 店长功能;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class dish {
	private String dishName;
	LocalDate d = LocalDate.now(); //获得今天的时间确认是否换天
	public int getNumber() {
		return number;
	}
	private int number;
	public dish(String dishName) {  //构造器
		super();
		this.dishName = dishName;
		this.number = setDishNumber(dishName);
		writeDishNumber();
	}
	public String getDishName() {
		return dishName;
	}
	
	public void addNumber(int a) { //有新订单后增加销量
		number+= a;
		writeDishNumber();
	}

	
	
	public  int readDishNumber(String dishName) {		//从txt中读取菜品销售量 如果日期更改返回0
		String dishLocation = "C:\\Users\\Shana\\Desktop\\dish\\" + dishName + ".txt";//拼接文件地址
		File file = new File(dishLocation);
		int dishNumber=0;
		BufferedReader reader = null;
		if(ifnewday()==0) { //不需要重启一行 读取最后一行数据
			try {
		        reader = new BufferedReader(new FileReader(file));
		        String lastLine="";
		        String lastLine2="";
		        while((lastLine2 = reader.readLine ()) != null){   //读取最后一行
		        	lastLine = lastLine2;
		        }
		        String[] dishSplit= lastLine.split(" "); //第一个元素为销量第二个为时间
		        dishNumber = Integer.parseInt(dishSplit[0]); 
		        reader.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    } finally {
		        if (reader != null) {
		            try {
		                reader.close();
		            } catch (IOException e1) {
		            }
		        }
		}
			return dishNumber;
		}else {
			return 0;
		}
		
		
	}
	
	public int ifnewday() {			//判读是否是新的一天是否需要重启一行 返回0为不需要   1为需要
		String dishLocation = "C:\\Users\\Shana\\Desktop\\dish\\" + dishName + ".txt";//拼接文件地址
		File file = new File(dishLocation);
		String dataLastLine="";
		BufferedReader reader = null;
		try {
	        reader = new BufferedReader(new FileReader(file));
	        String lastLine="";
	        String lastLine2="";
	        while((lastLine2 = reader.readLine ()) != null){   //读取最后一行
	        	lastLine = lastLine2;
	        }
//	        System.out.println(lastLine);
	        String[] dishSplit= lastLine.split(" "); //第一个元素为销量第二个为时间
	        dataLastLine=dishSplit[1];
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (reader != null) {
	            try {
	                reader.close();
	            } catch (IOException e1) {
	            }
	        }
	}
		if(dataLastLine.equals(d.toString())) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public void writeDishNumber() { //写入新的销量
		
		String dishLocation = "C:\\Users\\Shana\\Desktop\\dish\\" + dishName + ".txt";//拼接文件地址
		File file = new File(dishLocation);
		String content;
		StringBuilder sb = new StringBuilder();
		String sb2="";//删除最后一行后端字符串
		if(ifnewday()==0) {  //不需要要重启一行修改最后一行
			try {
		        
		        BufferedReader br = null;
		        br = new BufferedReader(new FileReader(file));
		        while((content=br.readLine())!=null){
		            sb.append(content).append("\n");
		        }
		        sb2=sb.substring(0, sb.toString()
		                .substring(0, sb.length()-1).lastIndexOf("\n"));
//		        System.out.println(number);
//		        number = 100;
		        sb2 += "\n"+number + " " +d.toString();
		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),
                        "UTF-8"));
		        bw.write(sb2);
		        bw.close();
		        br.close();
		    } catch (Exception e1) {
		        System.err.println("write errors :" + e1);
		    }
		}else {		//需要重启一行
			try {
		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file,true),
		                                                                      "UTF-8"));
		        bw.write("\n"+number+" "+d.toString());
		        bw.close();
		    } catch (Exception e1) {
		        System.err.println("write errors :" + e1);
		    }
		}
		
	}
	
	public int setDishNumber(String dishName) { //初始化时设置object的销量
		    //从txt文件中读取各个菜品的售卖数
//			switch (dishName) {
//			case "tonkotsu":
//				return readDishNumber(dishName);
//			
//			default:
//				return 0;
//			}
		return readDishNumber(dishName);
	}
	
	

	
	
//	public void showLastWeek() { //读取后几行数据
//		File file = new File("C:\\Users\\Shana\\Desktop\\dish\\" + dishName + ".txt");
//		try {
//			ReversedLinesFileReader object = new ReversedLinesFileReader(file, 4096, "UTF-8");
//			System.out.println(object.readLine());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
