import java.io.*;
class FileInputWrite
{
public static void main(String[] args)
{
try
{
FileReader fr=new FileReader("new.txt");
FileWriter fw=new FileWriter("output.txt");
String str="    ";
int i;
while((i=fr.read())!=-1)
{
str+=(char) i;
}
System.out.println(str);
fw.write(str);
fr.close();
fw.close();
System.out.println("File reading & writing both done");
}
catch(IOException e)
{
System.out.println("IOException");
}
}
}
