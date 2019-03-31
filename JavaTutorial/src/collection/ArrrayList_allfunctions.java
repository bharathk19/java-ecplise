package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrrayList_allfunctions {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		System.out.println("the first elements in arraylist"+al);
		al.add("hello");
		al.add("world");
		System.out.println("after adding the elements "+al);
		al.add(0, "welcome to array list  ");
		System.out.println("after adding at the index element "+al);
		ArrayList<String> al2=new ArrayList<String> ();
		al2.add("fun in the city");
		al2.add("of chicago");
		System.out.println("the second array list is "+al2);
		/*al.addAll(al2);
		System.out.println("after adding the second array list"+al);*/
		al.addAll(2, al2);
		System.out.println("after adding the secong array list at a index "+al);
		

	}

}
