import java.util.*;
class Person
{
 String name;
 String address;
 int age;
 String gender;
 Person()
 {
  Scanner b=new Scanner(System.in);
  System.out.println("Enter name:");
  name=b.next();
  System.out.println("Enter address:");
  address=b.next();
  System.out.println("Enter age:");
  age=b.nextInt();
  System.out.println("Enter gender:");
  age=b.nextInt();
 }
}
class Employee extends Person
{
 int empid;
 String cmp_name;
 String qual;
 int salary;
 Employee()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Empid:");
  empid=c.nextInt();
  System.out.println("Enter company name:");
  cmp_name=c.next();
  System.out.println("Enter qualification:");
  qual=c.next();
  System.out.println("Enter salary:");
  salary=c.nextInt();
 }
}
class Teacher extends Employee
{
 String subject;
 String dept;
 int trid;
 Teacher()
 {
  Scanner d=new Scanner(System.in);
  System.out.println("Enter Teacher Id:");
  trid=d.nextInt();
  System.out.println("Enter subject:");
  subject=d.next();
  System.out.println("Enter deptt:");
  dept=d.next();
 }
 void display()
 {
  System.out.println("Teacher id:"+trid);
  System.out.println("Name:"+name);
  System.out.println("Address:"+address);
  System.out.println("Age:"+age);
  System.out.println("Gender:"+gender);
  System.out.println("Salary:"+salary);
  System.out.println("Qualification:"+qual);
  System.out.println("Subject:"+subject);
  System.out.println("Department:"+dept);
 }
}
class MultilevelInheritance
{
 public static void main(String args[])
 {
  int n;
  Scanner a=new Scanner(System.in);
  System.out.println("Enter number of employees:");
  n=a.nextInt();
  Teacher t[]=new Teacher[n];
  for(int i=0;i<n;i++)
  {
   t[i]=new Teacher();
  }
  System.out.println(".....................");
  System.out.println("Details:");
  for(int i=0;i<n;i++)
  {
   t[i].display();
  }
 } 
}
   
  
