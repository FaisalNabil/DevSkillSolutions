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
			double ab=in.nextDouble();
			double bc=in.nextDouble();
			double cd=in.nextDouble();
			
			double sqrtAbBc=Math.sqrt((Math.pow(ab,2)) + (Math.pow(bc,2)));
			double roundOf= Math.round( (Math.sqrt( (Math.pow(cd,2)) + (Math.pow(sqrtAbBc,2)) ) ) * 100)/100.00;
			
			System.out.println(String.format("%.2f" ,roundOf ));
		}
	}
	
}