package intro;

import java.util.*;


public class CopyEle{
	

	public static void main(String args[]) {
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("length of array");
		i=s.nextInt();
		int a[] = new int[i];
		System.out.println("length of the array is "+a.length);
		for(j=0;j<a.length;j++) 
		{ 
			a[j]=s.nextInt();
			
		}
		s.close();
		int b[]=new int[a.length];
		for(i=0;i<a.length;i++)
		{
		 b[i]=a[i];
		 System.out.println(b[i]);
		}
		int sa=0;
			for(i=0;i<a.length-1;i++)
			{
			if(a[i]==b[i])
				sa++;
			}
		System.out.println(sa);
		 }
	
	
	
		}
	

