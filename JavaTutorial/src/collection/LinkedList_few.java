package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_few {

	public static void main(String[] args) {
		List<String> LL= new LinkedList();
		LL.add("bharath");
		LL.add("sonu");
		LL.add("Fun");
		//this the linked list for the problem
		System.out.println(LL.size());
		Iterator<String> c=LL.iterator();
		while(c.hasNext())
		{
			System.out.println(c.next());
		}
		
	}

}
