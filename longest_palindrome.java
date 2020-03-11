class main
{
    public static void main(String[] args) {
        String s = "baablkj12345432133d";
        String str;
        boolean b;

        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length()-1;j++)
            {
                str = s.substring(i,j);
                if(check_pallindrone(str) == true)
                {
                    i += str.length()-1;
                }
            }
        }
    }

    static boolean check_pallindrone(String str)
    {
        String rev = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.length() != 1)
        {
            if(str.compareTo(rev) == 0)
            {
                System.out.println("str -> " + str);
                System.out.println("rev -> " + rev + "\n");
                return true;
            }
        }
        // System.out.println("str -> " + str);
        // System.out.println("rev -> " + rev + "\n");
        return false;
    }

}