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
			 
		     System.out.println("��"+i+"����");
			 Scanner console=new Scanner(System.in); //�ӱ�׼�����豸��һ���Ǽ��̣��ж�ȡ����
			 try {
			 System.out.println("�������������:");
		     String na = console.nextLine();//�ַ����͵����뷽ʽ
		     System.out.println("����������Ա�:");
		     String se = console.nextLine();//�ַ����͵����뷽ʽ
		     System.out.println("���������Ժϵ:");
		     String d1 = console.nextLine();//�ַ����͵����뷽ʽ		     
		     System.out.println("�������������:");
		     int a1 = console.nextInt();//�������͵����뷽ʽ		     
		     System.out.println("��������ѧ��:");
		     int f1 = console.nextInt();//�������͵����뷽ʽ		     
		     System.out.println("��������ÿ�¹���:");
		     int p1 = console.nextInt();//�������͵����뷽ʽ
		     System.out.println("*********************************************");
		     DoctoralCandidate g=new DoctoralCandidate(na,se,a1,d1,f1,p1);
		     System.out.println(g);
		     System.out.println("*********************************************");
		     System.out.println("�����룺"+g.getPay()*12);
		     System.out.println("��ѧ�ѣ�"+g.getFee());
		     System.out.println("*********************************************");
		    
		     
		    	 if((g.getPay()*12-g.getFee())<=36000){
		    		 t =((g.getPay()*12-g.getFee()))*n1-s1;
		    	 
		    	     System.out.println(g+"  ��Ӧ��˰�"+t);
		    	     }
		         if((g.getPay()*12-g.getFee())>=36000&&(g.getPay()*12-g.getFee())<=14400){
		        	 t =((g.getPay()*12-g.getFee()))*n2-s2;
		         
			         System.out.println(g+"  ��Ӧ��˰�"+t);
		             }
			 }catch(Exception e) {
		        	 System.out.println("�������ݴ���");
		        	 }
		       
			 i++;
		 }
	 }
}
		  
		 
		  
