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
		for(int x=0;x<testCase;x++){
			String s=in.nextLine();
			int length=s.length()-1;
			for(int i=length;i>=0;i--){
				if(Character.isLetter(s.charAt(i)) || s.charAt(i)==' ' || s.charAt(i)=='.')
					System.out.print(s.charAt(i));
			}
			
			System.out.println(); 
		}
	}
}