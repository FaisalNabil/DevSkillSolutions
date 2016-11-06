/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int testCase=in.nextInt();
		for(int i=0;i<testCase;i++){
			double r=in.nextDouble();
			double a=in.nextDouble();
			if( (int)(r*2) == (int)(Math.sqrt(2)*a) ) 
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}