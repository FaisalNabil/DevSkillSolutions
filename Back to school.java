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
			double Cx=in.nextDouble();
			double Cy=in.nextDouble();
			double R=in.nextDouble();
			double Px=in.nextDouble();
			double Py=in.nextDouble();
			
			double Dx=Math.pow( (Px-Cx) , 2 );
			double Dy=Math.pow( (Py-Cy) , 2 );
			double DR=Math.pow( R , 2 );
			
			if(Dx+Dy>DR)
				System.out.println("Case "+(i+1)+": Outside");
			else if(Dx+Dy<DR)
				System.out.println("Case "+(i+1)+": Inside");
			else if(Dx+Dy==DR)
				System.out.println("Case "+(i+1)+": OnCircle");
		}
	}
}