class main
{
    public static void main(String arg[])
    {
        String text = "11223344##";
        String text1;
        String check = " ";
        text = text.toLowerCase();
        char temp;
        String ch;
        int a = 0;

        for(int i=0;i<text.length()-1;i++)
        {
            text1 = text.substring(i+1);
            ch = ""; 
            temp = text.charAt(i);
            ch += temp;
            if(!(check.contains(ch)))
            {
                if(text1.contains(ch))
                {
                    ++a;
                    check += ch;
                }
            }
            
        }
        
        System.out.println(a);

    }
}