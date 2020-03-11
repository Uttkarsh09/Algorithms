import java.util.*;
class main
{
    public static void main(String args[])
    {
        int i = 0;
        int j = 0;
        String temp="";
        int ans;
        String numStr = "seven hundred three thousand nine hundred and one";
        String subStr="";
        numStr = numStr + " ";
        numStr = numStr.replaceAll("and","");
        numStr = numStr.replaceAll("-"," ");
        numStr = numStr.replaceAll("   "," ");                      //converting 3spaces into 1
        numStr = numStr.replaceAll("  "," ");                       //converting 2-space into 1 doing this for safety

        while(i <= numStr.length()-1)
        {
            j = numStr.indexOf(" ",i);
            subStr = numStr.substring(i,j);
            System.out.println(subStr);
            switch (subStr){
                case "one":
                subStr = "1";
            
                case "two":
                subStr = "2";
                
                case "three":
                subStr = "3";
            
                case "four":
                subStr = "4";
            
                case "five":
                subStr = "5" ;
            
                case "six":
                subStr = "6";
            
                case "seven":
                subStr = "7";
            
                case "eight":
                subStr = "8"; 
            
                case "nine":
                subStr = "9";
            
                case "ten":
                subStr = "10";
                
                case "eleven":
                subStr = "11";
                
                case "twelve":
                subStr = "12";
                
                case "thirteen":
                subStr = "13";
                
                case "fourteen":
                subStr = "14";
                
                case "fifteen":
                subStr = "15";
                
                case "sixteen":
                subStr = "16";
                
                case "seventeen":
                subStr = "17";
                
                case "eighteen":
                subStr = "18";
                
                case "nineteen":
                subStr = "19";
                
                case "twenty":
                subStr = "20";
            
                case "thirty":
                subStr = "30";
            
                case "forty":
                subStr = "40";   
            
                case "fifty":
                subStr = "50";
            
                case "sixty":
                subStr = "60";
            
                case "seventy":
                subStr = "70";

                case "eighty":
                subStr = "80"; 
            
                case "ninty":
                subStr = "90";
            
                case "hundred":
                subStr = "100";
                
                case "thousand":
                subStr = "1000";
                
                case "million":
                subStr = "1000000";

                default: subStr = subStr;
            }
            temp = temp + subStr;
            System.out.println(temp);
            i = j+1;     
        }   

        System.out.println(subStr);
    } 
}


