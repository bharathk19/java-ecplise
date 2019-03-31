package collection;

import java.util.ArrayList;
import java.util.List;

public class Exam1 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>(4);
		List<String> list2=new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		System.out.println(list1.size());
		System.out.println(list1);
		list2=list1;
		list2.add(1,"c");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list2.contains("a"));
	}

}
