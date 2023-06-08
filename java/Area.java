import java.util.*;
Interface areaperi
{
void area();
void perimeter();
}
class Rectangle implements areaperi
{
int l=10,b=20;
public void area()
{
System.out.println("Area of rectangle:"+l*b);
}
public void perimeter()
{
System.out.println("Perimeter of rectangle"+(2*(1+b));
}
}
class Circle implements areaperi
{
int r=10;
public void area()
{
System.out.println("Area of circle"+(3.14*r*r));
}
}
class Area
{
public static void main(String[] args)
{
rectangle r=new rectangle();
circle c=new circle();
int ch=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for circle 2 for rectangle");
ch=sc.nextInt();
Switch(ch)
{
case 1:
c.area();
c.perimeter();
break;
case 2:
r.area();
r.perimeter();
break;
}
}
}
