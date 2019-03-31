package intro;

public class Exam1 {

	public static void main(String[] args) {
		second:
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j==1)
					continue second;
				System.out.println("[i="+i+",j="+j+"]");
			}
			System.out.println();
		}

	}

}
