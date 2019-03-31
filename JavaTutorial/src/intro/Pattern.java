package intro;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("enter the number of rows");
		int rows=Integer.parseInt(args[0]);
		 for (int i = 2; i <= rows; i++) 
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }

	}

}
