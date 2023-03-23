import java.util.Scanner;
class AddMatrix{
  public static void main(String args[]){
  	int i,j;
        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        int[][] c = new int[10][10];
        
	Scanner s = new Scanner(System.in);
	int m,n;
        System.out.println("Enter the size of the matrix ");
        m = s.nextInt();
	
        n = s.nextInt();
	
	System.out.println("Enter the Value for Matrix A :");
	for(i=0;i<m;i++)
        {
	 for(j=0;j<n;j++)
         {
 	   a[i][j] = s.nextInt();
         }
       }
	
     
       System.out.println("Enter the Value for Matrix B ");
	for(i=0;i<m;i++)
        {
	 for(j=0;j<n;j++)
          {
 	    b[i][j] = s.nextInt();
         }
       }
	

	for(i=0;i<m;i++)
         {
	 for(j=0;j<n;j++)
          {
 	   c[i][j] = b[i][j]+a[i][j];
         }
       }
 
     System.out.println("Result");
     for(i=0;i<m;i++){
	 for(j=0;j<n;j++){
 		System.out.print(" "+c[i][j]+" ");
         }
         System.out.println();
       }	
  }
}


