package ctsdemo14;

import java.util.Scanner;

public class LogicalOperators
{
	public static void main(String[] args) 
	{
		String user="teja";
		String pswd="vamsi123@";
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter username ");
	    String user1=sc.next();
	    
	    System.out.println("enter password");
	    String pswd1=sc.next();
	    sc.close();
	    
	    if(user.equals(user1) && pswd.equals(pswd1))
	    {
	    	
		    System.out.println("welcome to gmail ");
	    }
	    else
	    System.out.println("entered username and password are invalid ");
	    				}
}
