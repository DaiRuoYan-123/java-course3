# 计191戴若妍2019311217

## 实验目的

1.掌握Java中抽象类和抽象方法的定义； 

2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法

3.了解异常的使用方法，并在程序中根据输入情况做异常处理

## 实验内容

1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。

2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。

3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。

## 实验要求

1.在博士研究生类中实现各个接口定义的抽象方法;

2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；

3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。

4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。

5.根据输入情况，要在程序中做异常处理。

## 实验过程

1.运用interface关键词声明学生管理和教师管理接口。

2.在接口体中分别创建两个抽象方法：查询学费，缴纳学费，发放薪水，查询薪水。

3.创建博士研究生类实现两个接口，用implements关键词实现接口。再重写接口中的两个方法。

4.同时在博士研究生类加上姓名、性别、年龄、院系、每学期学费、每月薪水等属性，使用Object根类的toString（）方法,将在相关对象的信息输出中。

5.在测试类中采用Scanner类输入姓名，学费，薪水等信息实现运行时交互式输入。

6.采用if（）函数判断该生应缴纳税额在哪个阶段，进行相应的计算。

7.用于try-catch语句判断语句是否异常，发在输入属性那段语句中，判断所输入的数据是否符合该相应的类型。

## 核心代码

1.用interface关键词说明接口并在接口体中创建两个抽象方法。
```
public interface Studentmanagement {
	public int getFee();//查询学费
	public void setFee(int m1);//缴纳学费
}
```
2.该非抽象类中实现接口，进行方法重写
```
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
 ```
 3.用采用Scanner类输入姓名等属性，并将输入变量按照相应的方式定义，用try-catch语句对该语句进行异常处理。
 ```
 Scanner console=new Scanner(System.in); //从标准输入设备（一般是键盘）中读取数据
			 try {
			 System.out.println("请输入你的姓名:");
		     String na = console.nextLine();//字符类型的输入方式
		     System.out.println("请输入你的性别:");
		     String se = console.nextLine();//字符类型的输入方式
   ```
       }catch(Exception e) {
		        	 System.out.println("输入数据错误！");
		        	 }

## 运行结果

![a](https://github.com/DaiRuoYan-123/java-course3/blob/main/598d8716cd046dcc00b791e39d123e6.png)

![b](https://github.com/DaiRuoYan-123/java-course3/blob/main/33946ee47bc9790a7feb91f80873f84.png)

![c](https://github.com/DaiRuoYan-123/java-course3/blob/main/991f345976be093b73c8fe0fd637724.png)

## 实验感想

通过实验设计一个类接两个接口，熟悉如何声明一个接口，也明白可以用implements关键词实现两个接口，并在类中重写这个接口的所有方法，

编写程序过程中熟悉while（），if（）语句分别进行循环和判断，也通过网络和书本的学习，提前了解并采用Scanner类实现运行时交互式输入，使程序更加友好。

同时在实验中也遇到许多难题如最先如何设计构造抽象函数实现所要求的任务，希望在接下来的学习学到更多的知识。

   
