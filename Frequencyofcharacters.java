import java.util.*;

class main
{
	public static void main(String args[])
	{
		Scanner get = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String str = get.next();
		
		char ch[] = str.toCharArray(); 
		final int EMPTY = -1;
		int n = str.length();
		int length = 0;
		
		for(int i=0;i<n;i++)
		{
			length = 1;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i] != '$')
				{
					if(ch[i] == ch[j])
					{
						++length;
						ch[j] = '$';
					}
					
				}
			}
			
			if(ch[i] != '$')
			System.out.println("The frequency of character " + ch[i] + " is " + length);
		}
	}
}