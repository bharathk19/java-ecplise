package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_few {

	public static void main(String[] args) {
		LinkedList<String> LL= new LinkedList();
		LL.add("bharath");
		LL.add("sonu");
		LL.add("Fun");
		System.out.println(LL.size());
		Iterator<String> c=LL.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
			System.out.println("this is from 2nd developer");
		}
		
	}

}
