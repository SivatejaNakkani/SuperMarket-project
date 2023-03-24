import java.util.Scanner;
public class ClassA7
{
 Scanner sc=new Scanner(System.in);
 void meth1()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Available products in store");
 System.out.println();
 System.out.println("1)Fruits");
 System.out.println("2)Vegetables");
 System.out.println("3)Cosmotics");
 System.out.println("4)MasalaPowders");
 System.out.println("please enter you Choice");
 String s1=sc.next();
 System.out.println("My choice is 1)Fruits");
 }
 void meth2()
 {
 int A=125;
 switch(A)
 {
 case 125:
 System.out.println("case Code 125 select-----Mangoes-----1kg is 50");
 case 126:
 System.out.println("case 126 Executes-----Apples------1kg is 100");
 case 127:
 System.out.println("case 127 Executes-----Bananas-----1kg is 25");
 case 128:
 System.out.println("case 128 Executes------Papaya------1kg is 44");
 case 129:
 System.out.println("case 129 Executes------Graps-----1kg is 60");
 case 130:
 System.out.println("case 130 Executes------Orange-----1kg is 50");
 break;
 default:
 System.out.println("All the Casees Are Not Valid");
 }
}
 void meth3()
 {
 System.out.println("please choose the your product code");
 int a=sc.nextInt();
 System.out.println("User enter code 125");
 System.out.println("Mango is a King of the Fruits");
 System.out.println("How many kgs you need");
 int b=sc.nextInt(); 
 System.out.println("User need 4kgs");
 System.out.println("if you want to continue shopping please press 1");
 int c=sc.nextInt();
 System.out.println("User press 1 to continue Shopping");
 this.meth2();
 System.out.println("if you want to exist press 2");
 int d=sc.nextInt();
 System.out.println("User press 2");
 }
 void meth4()
 {
  System.out.println("5)Potatos");
  System.out.println("6)Brinjal");
  System.out.println("7)Carrots");
  System.out.println("8)Beetroots");
  System.out.println("9)Drumsticks");
  System.out.println("10)Mushrooms");
  int B= 225;
 switch(B)
 {
 case 225:
 System.out.println("case Code 225 select-----Potatos-----1kg is 41");
 case 226:
 System.out.println("case Code 226 select-----Brinjals-----1kg is 35");
 case 227:
 System.out.println("case Code 227 select-----Carrots-----1kg is 60");
 case 228:
 System.out.println("case Code 228 select-----Beetroots-----1kg is 44");
 case 229:
 System.out.println("case Code 229 select-----Drumsticks-----1kg is 60");
 case 230:
 System.out.println("case Code 230 select-----Mushrooms-----1kg is 50");
 break;
 default:
 System.out.println("All the Cases are  not InValid");
 }
}
 void meth5()
 {
 System.out.println("please enter your choice");
 String s2=sc.next();
 System.out.println("My choice is 2");
 System.out.println("=========================================================");
 System.out.println("please choose the your product code");
 int f=sc.nextInt();
 System.out.println("user entered product code 229");
 System.out.println("=========================================================");
 System.out.println("please enter how many kgs of Drumsticks");
 int g=sc.nextInt();
 System.out.println("User need 5kgs of Drumsticks");
 System.out.println("=========================================================");
 System.out.println("please enter how many kgs of Mashrooms");
 int h=sc.nextInt();
 System.out.println("user need 2kgs of Mushrooms");
 System.out.println("=========================================================");
 }
 void meth6(int quantity)
 {
 int totalbill=quantity*30;
 System.out.println("totalbill: "+totalbill);
 if(totalbill>=600)
 {
 int discount=totalbill*5/30;
 System.out.println("discount: "+discount);
 System.out.println("finalbill: "+(totalbill-discount));
 }
 else
 {
 System.out.println("finalbill: "+totalbill);
 }
} 
 public static void main(String[] args)
 {
 System.out.println("==========Welcome to Organic Store===========");
 System.out.println("----------------------------------------------");
 ClassA7 obj=new ClassA7();
 obj.meth1();
 obj.meth2();
 obj.meth3();
 obj.meth4();
 obj.meth5();
 System.out.println("=========Welcome to Organic store==========");
 System.out.println("========================================================="); 
 obj.meth6(20);
 System.out.println("--------------------------------------------------------");
 System.out.println("Thanks For Shopping You Saving 100Rs");
 System.out.println("==================java is Awesome=============================");
 }
}


