package yes;

public class DoctoralCandidate implements Studentmanagement,Teachermanagement {
	 String name; //����
	 String sex; //�Ա�
	 int age;   //����
	 String departments;//Ժϵ
	 int fee;//ѧ��
	 int pay;//ÿ�¹���
	
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
			return "������"+name+"  �Ա�"+sex+"  ���䣺"+age+"  Ժϵ��"+departments+"  ѧ�ѣ�"+fee+"  ÿ�¹��ʣ�"+pay;
		}
	 }



