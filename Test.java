package yes;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args)   {
		 final double n1 =0.03;
		 final double n2 =0.1;
		 final int s1=0,s2 =2520;
		 double t;
		 int i=1;
		
		 while(i<=2) {
			 
		     System.out.println("第"+i+"个人");
			 Scanner console=new Scanner(System.in); //从标准输入设备（一般是键盘）中读取数据
			 try {
			 System.out.println("请输入你的姓名:");
		     String na = console.nextLine();//字符类型的输入方式
		     System.out.println("请输入你的性别:");
		     String se = console.nextLine();//字符类型的输入方式
		     System.out.println("请输入你的院系:");
		     String d1 = console.nextLine();//字符类型的输入方式		     
		     System.out.println("请输入你的年龄:");
		     int a1 = console.nextInt();//整数类型的输入方式		     
		     System.out.println("请输入你学费:");
		     int f1 = console.nextInt();//整数类型的输入方式		     
		     System.out.println("请输入你每月工资:");
		     int p1 = console.nextInt();//整数类型的输入方式
		     System.out.println("*********************************************");
		     DoctoralCandidate g=new DoctoralCandidate(na,se,a1,d1,f1,p1);
		     System.out.println(g);
		     System.out.println("*********************************************");
		     System.out.println("年收入："+g.getPay()*12);
		     System.out.println("年学费："+g.getFee());
		     System.out.println("*********************************************");
		    
		     
		    	 if((g.getPay()*12-g.getFee())<=36000){
		    		 t =((g.getPay()*12-g.getFee()))*n1-s1;
		    	 
		    	     System.out.println(g+"  年应纳税额："+t);
		    	     }
		         if((g.getPay()*12-g.getFee())>=36000&&(g.getPay()*12-g.getFee())<=14400){
		        	 t =((g.getPay()*12-g.getFee()))*n2-s2;
		         
			         System.out.println(g+"  年应纳税额："+t);
		             }
			 }catch(Exception e) {
		        	 System.out.println("输入数据错误！");
		        	 }
		       
			 i++;
		 }
	 }
}
		  
		 
		  
