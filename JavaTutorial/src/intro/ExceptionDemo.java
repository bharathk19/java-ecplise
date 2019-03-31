package intro;

import java.sql.SQLException;

public class ExceptionDemo {
	public static void main(String args[])  {
		int a=9,b=0,c;
		int n[]= {10,2,3};
		try
		{ for(int i=0;i<=6;i++)
			{
				System.out.println(n[i]);
			}
			/* c=a/b;
			System.out.println(c); */
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
