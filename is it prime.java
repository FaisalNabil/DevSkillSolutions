/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int testCase=in.nextInt();
		for(int i=0;i<testCase;i++){
			int number=in.nextInt();
			int flag=0;
			for(int j=2;j<=number/2;j++){
				if(number%j==0){
					System.out.println("No");
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Yes");
		}
	}
}