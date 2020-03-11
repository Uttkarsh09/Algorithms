import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner get = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str=get.next();
		str = str.toUpperCase();
		char temp=' ';
		int n1;
		int n2;
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{	
				n1 = (int)str.charAt(i);
				n2 = (int)str.charAt(j);

				if(n2<n1)
				{
					temp = str.charAt(i);
					str.charAt(i) = str.charAt(j);
					str.charAt(j) = temp;
				}			
			}
		}

		System.out.println("The ascending string is =" + str);
	}
}