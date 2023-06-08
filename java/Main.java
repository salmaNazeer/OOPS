import java.util.*;
class Main
{
int pcode;
String pname;
double price;
Main(int code,String name,double price1)
{
pcode=code;
pname=name;
price=price1;
}
void display()
{
System.out.println(pcode+"\t"+pname+"\t"+price);
}
static void findLowest(double p1,double p2,double p3)
{
if(p1<=p2 && p1<=p3)
{
System.out.println("Product 1 is lowest");
}
else if(p2<=p1 && p2<=p3)
{
System.out.println("Product 2 is lowest");
}
else
{
System.out.println("Product 3 is lowest");
}
}
public static void main(String args[])
{
int pcode1,pcode2,pcode3;
String pname1,pname2,pname3;
float pprice1,price2,price3;
Scanner s=new Scanner(System.in);
System.out.println("Enter product 1 details:");
pcode1=s.nextInt();
pname1=s.next();
pprice1=s.nextFloat();
Main obj1=new Main(pcode1,pname1,pprice1);
System.out.println("Enter the product 2 details:");
pcode2=s.nextInt();
pname2=s.next();
price2=s.nextFloat();
Main obj2=new Main(pcode2,pname2,price2);
System.out.println("Enter the product 3 details:");
pcode3=s.nextInt();
pname3=s.next();
price3=s.nextFloat();
Main obj3=new Main(pcode3,pname3,price3);
System.out.println("\n Product information \n Product Code \t Product Name \t Product Price");
obj1.display();
obj2.display();
obj3.display();
findLowest(obj1.price,obj2.price,obj3.price);
}
}

