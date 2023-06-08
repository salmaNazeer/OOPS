import java.io.*;
class EvenOdd
	{
	  public static void main(String args[])
	    {
	      String inputfilepath="input.txt";
	      String evenoutputfilepath="even.txt";
	      String oddoutputfilepath="odd.txt";
	      try
	       {
	        BufferedReader reader=new BufferedReader(new FileReader(inputfilepath));
	        BufferedWriter ewriter=new BufferedWriter(new FileWriter(evenoutputfilepath));
	        BufferedWriter owriter=new BufferedWriter(new FileWriter(oddoutputfilepath));
	        String line;
	        while((line=reader.readLine())!=null)
	          {
	            int number=Integer.parseInt(line);
	            if(number%2==0)
	             {
	              ewriter.write(Integer.toString(number));
	              ewriter.newLine();
	             }
	            else
	             {
	              owriter.write(Integer.toString(number));
	              owriter.newLine();
	             }
	          }  
	        reader.close();
	        ewriter.close();
	        owriter.close();
	        System.out.println("Number separated successfully");
	       }
	      catch(IOException e)
	      {
	       System.out.println("An error occurred "+e.getMessage());
	      }
	    }  
	}
