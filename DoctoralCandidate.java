package yes;

public class DoctoralCandidate implements Studentmanagement,Teachermanagement {
	 String name; //姓名
	 String sex; //性别
	 int age;   //年龄
	 String departments;//院系
	 int fee;//学费
	 int pay;//每月工资
	
	public void setFee(int m1){     
		 fee=m1;   
		 }    
	public int getFee(){      
		 return fee;  
		 }   
	 public void setPay(int m){    
		 pay=m;  
		 }     
	 public int getPay()  {     
		 return pay;  
		 }
		DoctoralCandidate(String n,String s,int a,String d,int f,int p){     
			 this.name=n;    
			 this.sex=s;  
			 this.age=a;
			 this.departments=d;
			 this.fee=f;
			 this.pay=p;
			 }
		public String toString() {
			return "姓名："+name+"  性别："+sex+"  年龄："+age+"  院系："+departments+"  学费："+fee+"  每月工资："+pay;
		}
	 }



