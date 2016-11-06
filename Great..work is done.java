/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MyClass
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int totalHours=in.nextInt();
		int totalMembers=in.nextInt();
		int sum=0;
		for(int i=0;i<totalMembers;i++){
			int hour=in.nextInt();
			sum+=hour;
		}
		if(totalHours/sum==1 && totalHours%sum==0)
		System.out.println("Project will finish within "+ (totalHours/sum) +" day.");
		else if((totalHours%sum)==0)
		System.out.println("Project will finish within "+ (totalHours/sum) +" days.");
		else if((totalHours%sum)!=0)
		System.out.println("Project will finish within "+ ((totalHours/sum)+1) +" daays.");
	}
}