package 店长功能;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class manageGUI extends JFrame implements ActionListener, ItemListener{	
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
	
	JPanel jp1 = new JPanel();
	JLabel jl1, jl2, jl3;
	JTextField jtf1 = new JTextField(); 		JTextField jtf2 = new JTextField();
	String userName, code;
	JButton jb1 = new JButton("Login in"); 	JButton jb2 = new JButton("Exit");
	
	JPanel jp2 = new JPanel();
	JLabel jl4;
	JButton jb3 = new JButton("Price revision"); 	JButton jb4 = new JButton("View sales");
	JButton jb5 = new JButton("Back");
	
	JPanel jp3 = new JPanel();
	JLabel jl5, jl6, jl7, jl8, jl9, jl10;
	JTextField jtf3 = new JTextField(); 		JTextField jtf4 = new JTextField();
	JTextField jtf5 = new JTextField(); 		JTextField jtf6 = new JTextField();
	JTextField jtf7 = new JTextField(); 		
	String price1, price2, price3, price4, price5;
	JButton jb6 = new JButton("Finish"); 	JButton jb7 = new JButton("Back");
	
	JPanel jp4 = new JPanel();
	JLabel jl11, jl12, jl13, jl14, jl15, jl16;
	JButton jb8 = new JButton("Back"); 
	
	JPanel jp5 = new JPanel();
	JLabel jl17, jl18, jl29, jl30, jl31, jl32;
	JRadioButton tonkotsuJRB, shoyuJRB, shioJRB, softJRB, mediumJRB, firmJRB, noJRB, littleJRB, lotJRB;
	JRadioButton noriJRB, chashuJRB, eggJRB, ex_noriJRB, ex_chashuJRB, ex_eggJRB, bambooJRB;
	public String dishToCheck = "tonkotsu"; //initialize the default check dish
	JButton jb9 = new JButton("Check"); 	JButton jb10 = new JButton("Back"); 
	JButton jb12 = new JButton("Spiciness");
	
	JPanel jp6 = new JPanel();
	JLabel jl19, jl22, jl23, jl24, jl25, jl26, jl27, jl28;
	JButton jb11 = new JButton("Back");
	
	JPanel jp7 = new JPanel();
	JLabel jl20, jl21;
	JButton jb13 = new JButton("Back");
	
	public manageGUI() {
		//1st interface
		jp1.setBounds(0,0,605,450);	jp1.setLayout(null);
		
		jl1 = new JLabel("Back-up Service");
		Font f1 = new Font("Times New Roman",Font.PLAIN,28); 
		jl1.setFont(f1);		jl1.setBounds(210,80,200,30);		jp1.add(jl1);	
		
		jl2 = new JLabel("Account Number:");
		Font f2 = new Font("Times New Roman",Font.PLAIN,22); 
		jl2.setFont(f2);		jl2.setBounds(60,150,200,30);		jp1.add(jl2);
		
		jl3 = new JLabel("Password:");
		jl3.setFont(f2);		jl3.setBounds(128,200,200,30);		jp1.add(jl3);
		
		jtf1.setBounds(225,150,300,30); 	jp1.add(jtf1);
		jtf2.setBounds(225,200,300,30); 	jp1.add(jtf2);
		
		jb1.setBounds(270,255,80,40);			jp1.add(jb1);		jb1.addActionListener(this);
		jb2.setBounds(430,330,80,35);			jp1.add(jb2);		jb2.addActionListener(this);
		
		//2nd interface: function
		jp2.setBounds(0,0,605,450);	jp2.setLayout(null);
		
		jl4 = new JLabel("Function");
		jl4.setFont(f1);		jl4.setBounds(250,80,200,30);		jp2.add(jl4);
		
		jb3.setBounds(130,180,120,50);			jp2.add(jb3);		jb3.addActionListener(this);
		jb4.setBounds(350,180,120,50);			jp2.add(jb4);		jb4.addActionListener(this);
		jb5.setBounds(430,330,80,35);			jp2.add(jb5);		jb5.addActionListener(this);
		
		//3rd interface: price revision
		jp3.setBounds(0,0,605,450);	jp3.setLayout(null);
		
		jl5 = new JLabel("Price revision");
		jl5.setFont(f1);		jl5.setBounds(235,40,200,30);		jp3.add(jl5);
		
		jtf3.setBounds(370,100,80,30); 	jp3.add(jtf3);
		jtf4.setBounds(370,140,80,30); 	jp3.add(jtf4);
		jtf5.setBounds(370,180,80,30); 	jp3.add(jtf5);
		jtf6.setBounds(370,220,80,30); 	jp3.add(jtf6);
		jtf7.setBounds(370,260,80,30); 	jp3.add(jtf7);
		
		jb6.setBounds(300,330,80,35);			jp3.add(jb6);		jb6.addActionListener(this);
		jb7.setBounds(430,330,80,35);			jp3.add(jb7);		jb7.addActionListener(this);
		
		//4th interface: Successful
		jp4.setBounds(0,0,605,450);	jp4.setLayout(null);
		
		jb8.setBounds(430,330,80,35);			jp4.add(jb8);		jb8.addActionListener(this);
		
		//5th interface: choose dish to check
		jp5.setBounds(0,0,605,450);	jp5.setLayout(null);
		
		jl17 = new JLabel("View sales");
		jl17.setFont(f1);		jl17.setBounds(230,30,250,30);		jp5.add(jl17);
		
		jl18 = new JLabel("Choose a dish to check:");
		jl18.setFont(f2);		jl18.setBounds(80,70,250,30);		jp5.add(jl18);
		
		jl29 = new JLabel("Soup:");
		jl29.setFont(f2);		jl29.setBounds(80,110,250,30);	jp5.add(jl29);
		
		jl30 = new JLabel("Noodles:");
		jl30.setFont(f2);		jl30.setBounds(80,150,250,30);	jp5.add(jl30);
		
		jl31 = new JLabel("Spring onion:");
		jl31.setFont(f2);		jl31.setBounds(80,190,250,30);	jp5.add(jl31);
		
		jl32 = new JLabel("Add-ons:");
		jl32.setFont(f2);		jl32.setBounds(80,230,250,30);		jp5.add(jl32);
		
		tonkotsuJRB = new JRadioButton("tonkotsu", true);					tonkotsuJRB.setBounds(210,110,100,40);					jp5.add(tonkotsuJRB);
		shoyuJRB = new JRadioButton("shoyu");										shoyuJRB.setBounds(320,110,100,40);						jp5.add(shoyuJRB);
		shioJRB = new JRadioButton("shio");											shioJRB.setBounds(440,110,100,40);							jp5.add(shioJRB);
		
		softJRB = new JRadioButton("soft");												softJRB.setBounds(210,150,100,40);							jp5.add(softJRB);
		mediumJRB = new JRadioButton("medium");								mediumJRB.setBounds(320,150,100,40);					jp5.add(mediumJRB);
		firmJRB = new JRadioButton("firm");											firmJRB.setBounds(440,150,100,40);							jp5.add(firmJRB);
		
		noJRB = new JRadioButton("no");													noJRB.setBounds(210,190,100,40);							jp5.add(noJRB);
		littleJRB = new JRadioButton("just a little");									littleJRB.setBounds(320,190,100,40);						jp5.add(littleJRB);
		lotJRB = new JRadioButton("a lot");												lotJRB.setBounds(440,190,100,40);							jp5.add(lotJRB);
		
		noriJRB = new JRadioButton("nori");												noriJRB.setBounds(210,230,100,40);							jp5.add(noriJRB);
		chashuJRB = new JRadioButton("chashu");									chashuJRB.setBounds(320,230,100,40);					jp5.add(chashuJRB);
		eggJRB = new JRadioButton("boiled egg");									eggJRB.setBounds(440,230,100,40);							jp5.add(eggJRB);
		
		ex_noriJRB = new JRadioButton("exrta nori");								ex_noriJRB.setBounds(85,270,90,40);						jp5.add(ex_noriJRB);
		ex_chashuJRB = new JRadioButton("extra chashu");					ex_chashuJRB.setBounds(190,270,100,40);				jp5.add(ex_chashuJRB);
		ex_eggJRB = new JRadioButton("extra boiled egg");					ex_eggJRB.setBounds(310,270,120,40);					jp5.add(ex_eggJRB);
		bambooJRB = new JRadioButton("bamboo");								bambooJRB.setBounds(440,270,100,40);					jp5.add(bambooJRB);
				
		ButtonGroup group = new ButtonGroup();
		group.add(tonkotsuJRB);  group.add(shoyuJRB);  group.add(shioJRB);  group.add(softJRB);  group.add(mediumJRB);	group.add(firmJRB); 
		group.add(noJRB);  group.add(littleJRB);  group.add(lotJRB);  group.add(noriJRB);  group.add(chashuJRB);	group.add(eggJRB);   
		group.add(ex_noriJRB);  group.add(ex_chashuJRB);  group.add(ex_eggJRB);  group.add(bambooJRB);   
		
		tonkotsuJRB.addItemListener(this);		shoyuJRB.addItemListener(this);		shioJRB.addItemListener(this);	
		softJRB.addItemListener(this);		mediumJRB.addItemListener(this);		firmJRB.addItemListener(this);	
		noJRB.addItemListener(this);		littleJRB.addItemListener(this);		lotJRB.addItemListener(this);	
		noriJRB.addItemListener(this);		chashuJRB.addItemListener(this);		eggJRB.addItemListener(this);	
		ex_noriJRB.addItemListener(this);		ex_chashuJRB.addItemListener(this);		ex_eggJRB.addItemListener(this);	bambooJRB.addItemListener(this);	
		
		jb9.setBounds(310,330,80,35);			jp5.add(jb9);		jb9.addActionListener(this);
		jb10.setBounds(430,330,80,35);			jp5.add(jb10);		jb10.addActionListener(this);
		jb12.setBounds(170,330,100,35);			jp5.add(jb12);		jb12.addActionListener(this);
		
		//6th View sales: details of a dish
		jp6.setBounds(0,0,605,450);	jp6.setLayout(null);	
		jb11.setBounds(430,330,80,35);			jp6.add(jb11);		jb11.addActionListener(this);
		
		//7th interface: most popular spiciness
		jp7.setBounds(0,0,605,450);	jp7.setLayout(null);	
		
		jl20 = new JLabel("The most popular spiciness level is:");
		jl20.setFont(f1);		jl20.setBounds(90,60,440,30);		jp7.add(jl20);
		
		jb13.setBounds(430,330,80,35);			jp7.add(jb13);		jb13.addActionListener(this);
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		this.setTitle("title");
		this.setSize(605,450);
		this.setLocation(300,400);
		this.setVisible(true);
		this.setLayout(null); 
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		this.add(jp1);		jp1.setVisible(true);		
		this.add(jp2);		jp2.setVisible(false);		
		this.add(jp3);		jp3.setVisible(false);	
		this.add(jp4);		jp4.setVisible(false);
		this.add(jp5);		jp5.setVisible(false);
		this.add(jp6);		jp6.setVisible(false);
		this.add(jp7);		jp7.setVisible(false);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == tonkotsuJRB) {
			dishToCheck = "tonkotsu";
		}
		else if (e.getSource() == shoyuJRB) {
			dishToCheck = "shoyu";
		}
		else if (e.getSource() == shioJRB) {
			dishToCheck = "shio";
		}
		else if (e.getSource() == softJRB) {
			dishToCheck = "noodles_soft";
		}
		else if (e.getSource() == mediumJRB) {
			dishToCheck = "noodles_medium";
		}
		else if (e.getSource() == firmJRB) {
			dishToCheck = "noodles_firm";
		}
		else if (e.getSource() == noJRB) {
			dishToCheck = "onion_no";
		}
		else if (e.getSource() == littleJRB) {
			dishToCheck = "onion_little";
		}
		else if (e.getSource() == lotJRB) {
			dishToCheck = "onion_lot";
		}
		else if (e.getSource() == noriJRB) {
			dishToCheck = "nori";
		}
		else if (e.getSource() == chashuJRB) {
			dishToCheck = "chashu";
		}
		else if (e.getSource() == eggJRB) {
			dishToCheck = "egg";
		}
		else if (e.getSource() == ex_noriJRB) {
			dishToCheck = "e_nori";
		}
		else if (e.getSource() == ex_chashuJRB) {
			dishToCheck = "e_chashu";
		}
		else if (e.getSource() == ex_eggJRB) {
			dishToCheck = "e_egg";
		}
		else if (e.getSource() == bambooJRB) {
			dishToCheck = "bamboo";
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jb1) {
			userName = jtf1.getText();		code = jtf2.getText();		
			if(myManger.login(userName, code) == 1){
				jb1.setBackground(null);
				jp1.setVisible(false);
				jp2.setVisible(true);			
			}
			else if(myManger.login(userName, code) == 0){
				jb1.setBackground(Color.red);
			}
		}
		else if(e.getSource() == jb2) {
			System.exit(0);
		}
		else if(e.getSource() == jb3) {	
			jl6 = new JLabel("Ramen £" +  myMenu.menu[0] + " to:");
			Font f6 = new Font("Times New Roman",Font.PLAIN,22); 
			jl6.setFont(f6);		jl6.setBounds(120,100,200,30);		jp3.add(jl6);
			
			jl7 = new JLabel("Nori £"+  myMenu.menu[1] + " to:");
			jl7.setFont(f6);		jl7.setBounds(120,140,200,30);		jp3.add(jl7);
			
			jl8 = new JLabel("Boiled egg £"+  myMenu.menu[2] + " to:");
			jl8.setFont(f6);		jl8.setBounds(120,180,200,30);		jp3.add(jl8);
			
			jl9 = new JLabel("Bamboo shoots £"+  myMenu.menu[3] + " to:");
			jl9.setFont(f6);		jl9.setBounds(120,220,200,30);		jp3.add(jl9);
			
			jl10 = new JLabel("Chashu £"+  myMenu.menu[4] + " to:");
			jl10.setFont(f6);		jl10.setBounds(120,260,200,30);		jp3.add(jl10);
			
			jp2.setVisible(false);
			jp3.setVisible(true);
		}
		else if(e.getSource() == jb4) {
			jp2.setVisible(false);
			jp5.setVisible(true);
		}
		else if(e.getSource() == jb5) {
			jp1.setVisible(true);
			jp2.setVisible(false);
		}
		else if(e.getSource() == jb6) {
			jp3.remove(jl6);
			jp3.remove(jl7);
			jp3.remove(jl8);
			jp3.remove(jl9);
			jp3.remove(jl10);
			
			price1 = jtf3.getText();
			price2 = jtf4.getText();
			price3 = jtf5.getText();
			price4 = jtf6.getText();
			price5 = jtf7.getText();
			myMenu.changePrice(price1, price2, price3, price4, price5);
			
			jl11 = new JLabel("Modify Successful!");
			Font f11 = new Font("Times New Roman",Font.PLAIN,22); 
			jl11.setFont(f11);		jl11.setBounds(205,40,250,30);		jp4.add(jl11);
			
			jl12 = new JLabel("Ramen £" + myMenu.menu[0]);
			jl12.setFont(f11);		jl12.setBounds(120,100,200,30);		jp4.add(jl12);
			
			jl13 = new JLabel("Nori £" + myMenu.menu[1]);
			jl13.setFont(f11);		jl13.setBounds(120,140,200,30);		jp4.add(jl13);
			
			jl14 = new JLabel("Boiled egg £" + myMenu.menu[2]);
			jl14.setFont(f11);		jl14.setBounds(120,180,200,30);		jp4.add(jl14);
			
			jl15 = new JLabel("Bamboo shoots £" + myMenu.menu[3]);
			jl15.setFont(f11);		jl15.setBounds(120,220,200,30);		jp4.add(jl15);
			
			jl16 = new JLabel("Chashu £" + myMenu.menu[4]);
			jl16.setFont(f11);		jl16.setBounds(120,260,200,30);		jp4.add(jl16);
			jp3.setVisible(false);
			jp4.setVisible(true);
		}
		else if(e.getSource() == jb7) {
			jp2.setVisible(true);
			jp3.setVisible(false);
		}
		else if(e.getSource() == jb8) {
			jp4.remove(jl12);
			jp4.remove(jl13);
			jp4.remove(jl14);
			jp4.remove(jl15);
			jp4.remove(jl16);
			
			jp4.setVisible(false);
			jp2.setVisible(true);
		}
		else if(e.getSource() == jb9) {
			jl19 = new JLabel(dishToCheck);
			Font f19 = new Font("Times New Roman",Font.PLAIN,28); 
			jl19.setFont(f19);		jl19.setBounds(230,30,250,30);	 jp6.add(jl19);
			
			int weekDateData[] = new int[7];
			weekDateData =myStatistic.showWeekDate(dishToCheck);
			
			String	weekDateDataLabel1 = Integer.toString(weekDateData[0]);
			String	weekDateDataLabel2 = Integer.toString(weekDateData[1]);
			String	weekDateDataLabel3 = Integer.toString(weekDateData[2]);
			String	weekDateDataLabel4 = Integer.toString(weekDateData[3]);
			String	weekDateDataLabel5 = Integer.toString(weekDateData[4]);
			String	weekDateDataLabel6 = Integer.toString(weekDateData[5]);
			String	weekDateDataLabel7 = Integer.toString(weekDateData[6]);
			
			jl22 = new JLabel(weekDateDataLabel1);
			Font f22 = new Font("Times New Roman",Font.PLAIN,20); 
			jl22.setFont(f22);		jl22.setBounds(230,70,250,30);	 jp6.add(jl22);
			
			jl23 = new JLabel(weekDateDataLabel2);
			jl23.setFont(f22);		jl23.setBounds(230,110,250,30);	 jp6.add(jl23);
			
			jl24 = new JLabel(weekDateDataLabel3);
			jl24.setFont(f22);		jl24.setBounds(230,150,250,30);	 jp6.add(jl24);
			
			jl25 = new JLabel(weekDateDataLabel4);
			jl25.setFont(f22);		jl25.setBounds(230,190,250,30);	 jp6.add(jl25);
			
			jl26 = new JLabel(weekDateDataLabel5);
			jl26.setFont(f22);		jl26.setBounds(230,230,250,30);	 jp6.add(jl26);
			
			jl27 = new JLabel(weekDateDataLabel6);
			jl27.setFont(f22);		jl27.setBounds(230,270,250,30);	 jp6.add(jl27);
			
			jl28 = new JLabel(weekDateDataLabel7);
			jl28.setFont(f22);		jl28.setBounds(230,310,250,30);	 jp6.add(jl28);
			
			jp5.setVisible(false);
			jp6.setVisible(true);
		}
		else if(e.getSource() == jb10) {
			jp5.setVisible(false);
			jp2.setVisible(true);
		}
		else if(e.getSource() == jb11) {
			jp6.remove(jl19);	jp6.remove(jl22);	jp6.remove(jl23);	jp6.remove(jl24);
			jp6.remove(jl25);	jp6.remove(jl26);	jp6.remove(jl27);	jp6.remove(jl28);
			
			jp6.setVisible(false);			
			jp5.setVisible(true);
		}
		else if(e.getSource() == jb12) {
			jl21 = new JLabel(myStatistic.getPopSpic());
			Font f21 = new Font("Times New Roman",Font.PLAIN,18); 
			jl21.setFont(f21);		jl21.setBounds(20,200,600,30);	 jp7.add(jl21);
			
			jp5.setVisible(false);
			jp7.setVisible(true);
		}
		else if(e.getSource() == jb13) {
			jp7.remove(jl21);
			
			jp7.setVisible(false);
			jp5.setVisible(true);
		}
	}
}
