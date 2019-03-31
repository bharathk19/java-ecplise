package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Stack_Few {
	public static void main(String args[])
	{
		Stack<String> St=new Stack<String>();
		St.push("12");
		St.push("11");
		St.push("15");
		St.push("16");
		St.push("21");
		System.out.println(St.size());
		Iterator<String> itr=St.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		//System.out.println(St.pop());
	}
}
