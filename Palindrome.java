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
			String word=in.next();
			String lWord=word.toLowerCase();
			
			int l1=0;
			int l2=lWord.length()-1;
			int flag=0;
			while(l2>l1){
				if(lWord.charAt(l1)!=lWord.charAt(l2)){
					System.out.println("No");
					flag=1;
					l2=-10;
					}
				else{
					++l1;
					--l2;
					}
				}	
			if(flag==0)
				System.out.println("Yes");
			
		}
	}
}