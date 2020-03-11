import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner get = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = get.nextInt();

		int a[] = new int[n]; 
		int b[]	= new int[n];	
		int nn[][] = new int[2][2];
		int ii = 0;
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter a number " + (i + 1) + ": ");
			a[i] = get.nextInt();
		}
		
		int empty = -1;
		int length = 0;
		for(int i=0;i<n;i++)
		{
			length = 1;
			for(int j=i+1;j<n;j++)
			{
				if((a[i] != empty))
				{
					if(a[i] == a[j])
					{
						++length;
						a[j] = empty;
					}
				}
			}
			if(a[i] != empty)
			{
				nn[ii][jj] = a[i]; 
				++jj;
				nn[ii][jj] = length;
				++ii;
				jj = 0;
			}
		}
	
		for(int i=0;i);
		
		
	}
}