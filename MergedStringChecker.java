
class main
{
    public static void main(String args[])
    {
        String s,part1,part2;

        s = "codewars";
        part1 = "code";
        part2 = "wars";

        char ss[] = s.toCharArray();
        char p1[] = part1.toCharArray();
        char p2[] = part2.toCharArray();

        int length = ss.length;
        int length1 = p1.length;
        int length2 = p2.length;

        int n = 0;
        int m = 0;

        if(length == (length1 + length2))
        {
            for(int i=0;i<length;i++)
            {
                if(n < length1 && ss[i] == p1[n])
                {++n;}
                if(m < length2 && ss[i] == p2[m])
                {++m;}
            }
            if(length == (n + m))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
        else
        {
            System.out.println("False");
        }

    }
}