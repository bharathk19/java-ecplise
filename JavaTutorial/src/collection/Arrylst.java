package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylst {

	public static void main(String[] args) {
		Student s1=new Student(101,"Sonoo",23);  
		  Student s2=new Student(102,"Ravi",21);  
		  Student s3=new Student(103,"Hanumat",25);  
		  //creating arraylist  
		  ArrayList<Student> al=new ArrayList<Student>();  
		  // lkjd;hd;lkfjeojflkdsjf;k
		  al.add(s1);//adding Student class object  
		  /// Adding an comment
		  al.add(s2);  
		  al.add(s3);  
		  //Getting Iterator  
		  Iterator itr=al.iterator();  
		  //traversing elements of ArrayList object  
		  while(itr.hasNext()){  
		    Student st=(Student)itr.next();  
		    System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}
	}

}
