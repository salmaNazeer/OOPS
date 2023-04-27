import java.util.Scanner;
//simple custom exception in java
class Username_Exception extends Exception {
//parameter constructor
	public Username_Exception(String string) {
//passing the parameter to the super class constructor
		super(string);
	}
}

class Password_Exception extends Exception {
	public Password_Exception(String string) {
		super(string);
	}
}

class PasswordAuth{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String username, password;
  
  System.out.print("Enter username:");
  username = sc.nextLine();
  
  System.out.print("Enter password:");
  password = sc.nextLine();
  
  int length = username.length();
 
  try {
	 if(length>8)
		 throw new Username_Exception("username must be atmost 8 characters!");
	 if(!password.equals("java"))
    	 throw new Password_Exception("Incorrect password\nEnter the correct password??");
     else
    	 System.out.println("**Successfully login**");
      }
  catch (Username_Exception U) {
	  U.printStackTrace();
  }
  catch (Password_Exception P) {
      P.printStackTrace();
  }
  finally {
	  System.out.println("The finally statement is exicuted ");
	  
    }
  }
}
Find the average of N positive integers, raising a user defined exception for each negative input.

import java.util.Scanner;

class NegativeInputException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public NegativeInputException(String n) {
             super(n);
		
	}
}
class Average{
	

	public static void main(String[] args) {
		int number[];
		int sum=0;
		int i;
		float avg;
		float count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number");
		int n=sc.nextInt();
		number = new int[n];
		System.out.println("Enter the numbers:");
		for(i=0;i<n;i++)
	    {
	        number[i] = sc.nextInt();
	    }
		
	   try {
		    
		    for(i=0;i<n;i++) 
		    {
			    	if(number[i]<0)
			    	{
			    		throw new NegativeInputException("INPUT NUMBERS CANNOT BE NEGATIVE!!!!!!!!!!!!!!!!!!!");
			    	}
			    	else {
			    	 sum = sum + number[i];
				      count++;
		    }
		    
	    }
		    avg=sum/count;
		    System.out.println("Average :"+avg);
		    }
	   
	   
	     catch(NegativeInputException e) {
   		System.out.println("-----------------------------EXCEPTION OCCURED------------------------- \n"+e);
   	}
   	    
   	
		   
	   }
	}
