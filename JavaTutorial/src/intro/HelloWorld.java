package intro;

public class HelloWorld {
	int x,y;
	static final int c=152;
	HelloWorld(int x,int y){
		this.x=x;
		this.y=y;
	}
	int display()
	{
		return (x+y);
	}


	public static void main(String[] args) {
		//System.out.println("hello world");
		System.out.println(c);
		HelloWorld h=new HelloWorld(12,13);
		System.out.println(h.display());
		//c=15;
	}
	
}


