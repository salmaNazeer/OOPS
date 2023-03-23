import java.util.*;
class Matrix
{
public static void main(String args[])
{
int row,col,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of rows:");
row=sc.nextInt();
System.out.println("Enter the number of columns:");
col=sc.nextInt();
int m1[][]=new int[row][col];
int m2[][]=new int[row][col];
int res[][]=new int[row][col];
System.out.println("Enter the elements of matrix1 :");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
m1[i][j]=sc.nextInt();
}
}
System.out.println("Enter the elements of matrix2 :");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
m2[i][j]=sc.nextInt();
}
}
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
res[i][j]=m1[i][j]+m2[i][j];
}
}
System.out.println("Sum of the matrix is: ");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
System.out.print(res[i][j]+"\t");
}
System.out.print("\n");
}
}
}


