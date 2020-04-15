package 店长功能;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class menu {
	public String menu[]=new String [5];
	File file = new File("C:\\Users\\Shana\\Desktop\\menu.txt");
    BufferedReader reader = null;
    {
//    try {
//        reader = new BufferedReader(new FileReader(file));
//        for(int a=0;a<5;a++) {
//        	menu[a]=reader.readLine();
//        }
//        reader.close();
//    } catch (IOException e) {
//        e.printStackTrace();
//    } finally {
//        if (reader != null) {
//            try {
//                reader.close();
//            } catch (IOException e1) {
//            }
//        }
//}
    	readIn();
}
    public void showPrice() {    	
    	for(String n :menu) {
    		System.out.println(n);
    	}
    	
    }
    public void changePrice(String a,String b,String c,String d,String e) {
    	{
    		try {
    	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file),
    	                                                                      "UTF-8"));
    	        bw.write(ifAvailable(a));
    	        bw.newLine();
    	        bw.write(ifAvailable(b));
    	        bw.newLine();
    	        bw.write(ifAvailable(c));
    	        bw.newLine();
    	        bw.write(ifAvailable(d));
    	        bw.newLine();
    	        bw.write(ifAvailable(e));
    	        bw.close();
    	    } catch (Exception e1) {
    	        System.err.println("write errors :" + e1);
    	    }
    	    }
    	readIn();
    }
    public String ifAvailable(String a) {   //输入0设定菜品不可选
    	if (a.equals("0")) {
    		return "unavailable";
    	}else {
    		return a;
    	}
    }
    public void readIn() {
    	try {
	        reader = new BufferedReader(new FileReader(file));
	        for(int a=0;a<5;a++) {
	        	menu[a]=reader.readLine();
	        }
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
	}
    }
