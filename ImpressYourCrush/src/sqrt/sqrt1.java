package sqrt;

public class sqrt1 
{
	public static void main(String[] args) 
	{
		int n = 36, sqrt=0;
		
		for(int i=1;i*i<=n;i++)
		{
			sqrt=i;
		}
		
		System.out.println(sqrt);
	}  //TC - O(root n)
}
