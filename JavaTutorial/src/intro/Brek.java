package intro;

public class Brek {
	
	static int i;
	Brek()
	{
		i++;
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		//this class is used to know how break works
		/* for(i=0;i<=15;i++) {
			
			if(i==6)
			{
				System.out.println("the break block is executed");
				break;
			}
			
			System.out.println(i);
		} 
		
		for(i=0;i<10;i++)
		{
			if(i==4)
			{
				System.out.println("the continue block is executed");
				continue;
			}
		System.out.println(i);
		}*/
		
		Brek b1=new Brek();
		Brek b2=new Brek();
		Brek b3=new Brek();

	}

}
