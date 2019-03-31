package intro;

public class Test1 extends Thread {
public void run()
{
	for(int i=0;i<5;i++) {
		try {
		Thread.sleep(500);
		System.out.println(i);
		
	}
		catch(InterruptedException e){
			System.out.println(e);
		}
}
}

public static void main(String args[]){  
	  Test1 t1=new Test1(); 
	  Test1 t2=new Test1();  
	  Test1 t3=new Test1();
	  System.out.println(t1.getName());
	  System.out.println(t1.getId());
	  
	  t1.start();  
	  try {
		  t1.join(1500);
	  }
	  catch(Exception e) {System.out.println(e);}
	  t2.start();  
	  t3.start();
	  t1.setName("bharath");
	  System.out.println("t1.name"+t1.getName());
	 }  
}
