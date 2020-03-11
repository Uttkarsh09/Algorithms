import java.util.*;
import java.lang.*;

class main
{
    static int countSmileys(List<String> arr)
    {
        List<String> ans = new ArrayList<String>();
        String smi;
        int count = 0;
        Iterator<String> i = arr.iterator();
        while(i.hasNext())
        {
            smi = i.next();

			if((smi.charAt(0) == ':') || smi.charAt(0) == ';')
			{
				if(smi.length() == 3)
				{
					if( (smi.lastIndexOf(')') == 2) || (smi.lastIndexOf('D') == 2))
					{
						if((smi.charAt(1) == '-') || (smi.charAt(1) == '~'))
						{
							++count;
							ans.add(smi);
						}
					}
				}
				else
				{
					if( (smi.lastIndexOf(')') == 1) || (smi.lastIndexOf('D') == 1))
					{
						++count;
						ans.add(smi);
					}
				}
				
			}
        }
        System.out.println(ans);
        return count;
    }

    public static void main(String args[])
    {
        ArrayList<String> arr = new ArrayList();
        arr.add("5X");
        arr.add("8)");
        arr.add(":xP");
        arr.add(":8D");
        arr.add("8D");
        arr.add("()");
        arr.add(";D");
        arr.add(";D");
        arr.add("o)");
        arr.add("8)");
        arr.add("5~D");
        arr.add(";~)");
        arr.add(";d");
        arr.add(";oD");
        arr.add("pD");
        arr.add(":-D");
        arr.add("(P");
        arr.add(";xP");
        arr.add(";)X");
        arr.add("o8p");
        arr.add(";p~d");
        arr.add("pp");
        arr.add("5d");
        arr.add(":p)");
        arr.add("8D");
        arr.add(":px");
        arr.add("8D");
        arr.add(";)");
        arr.add(";D");
        arr.add("4pD]");

        int n = countSmileys(arr);

        System.out.println("This is the final answer " + n);
    }
}