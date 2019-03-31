package intro;

public class Test2 implements Runnable {
	public void run()
	{
		for(int i=0;i<5;i++)
		{try {
			Thread.sleep(200);
			System.out.println(i);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	}
	public static void main(String[] args) {

		Test2 t1=new Test2();
		Test2 t3=new Test2();
		Thread t2=new Thread(t1);
		Thread t4=new Thread(t3);
		t2.start();
		try {
			t2.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t4.start();
	}

}
