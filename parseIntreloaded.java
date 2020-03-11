import java.util.*;
class main
{
    public static void main(String args[])
    {
        int i = 0;
        int j = 0;
        int ans;
        String numStr = "seven hundred eighty-three thousand nine hundred and nineteen";
        numStr = numStr.trim();
        numStr = numStr + " ";                                      //to end the do-while loop below
        numStr = numStr.replaceAll("hundred","");
        numStr = numStr.replaceAll("thousand","");
        numStr = numStr.replaceAll("and","");
        numStr = numStr.replaceAll("-"," ");
        numStr = numStr.replaceAll("   "," ");                      //converting 3spaces into 1
        numStr = numStr.replaceAll("  "," ");                       //converting 2-space into 1 doing this for safety

        List<String> checkNumber = new ArrayList<String>();
        checkNumber.add("one");
        checkNumber.add("two");
        checkNumber.add("three");
        checkNumber.add("four");
        checkNumber.add("five");
        checkNumber.add("six");
        checkNumber.add("seven");
        checkNumber.add("eight");
        checkNumber.add("nine");
        checkNumber.add("zero");

        while(i <= numStr.length()-1)
        {
            j = numStr.indexOf(" ",i);
            System.out.println("i= " + i + " j= " + j);
            String subStr = numStr.substring(i,j);                                                    

            i = j+1;                                                 //doing this so that the substring moves on...
        }       

    } 
}
