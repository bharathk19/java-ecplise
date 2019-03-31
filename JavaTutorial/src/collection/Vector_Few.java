package collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector_Few {

	public static void main(String[] args) {
		List<String> V=new Vector<String>();
		V.add("Satrhyam");
		V.add("Madhavi");
		V.add("Manjusha");
		V.add("Kavya");
		Iterator<String> itr=V.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println(V.size());
		System.out.println(V.hashCode());
		
		
	}

}
