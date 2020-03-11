import java.util.*;

class main
{
    public static void main(String[] args) {
        int count = 0;
        int a[] = {1,2,2,3,1,4,5,4,8,8,9,10};

        int ans = 0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] > a[j])
                {
                    count = a[i];
                    a[i] = a[j];
                    a[j] = count;
                }
            }
        }

        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i:a)
        {
            al.add(i);
        }
        al.add(505);

        for(int i=0;i<al.size()-1;i++)
        {
            System.out.println("i -> " + i);
            for(int j=i+1;j<al.size()-1;j++)
            {
                if(al.get(i) == al.get(i+1))
                {
                    if(al.get(i) == al.get(j))
                    {
                        ++count;
                        System.out.println("Count1 -> " + count);
                    }
                    else
                    {
                        i = i + (count);
                        count = 0;
                        System.out.println("Count2 -> " + count);
                        break;
                    }
                }
                else
                {
                    ++ans;
                    System.out.println("Ans ->" + ans + " when at " + a[i] + " and count -> " + count);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
// set path="C:\Program Files\Java\jdk-13.0.2\bin"
// G:\AlgoDevelopment\JAVA>javac returningthesingleelement.java

/*
for(int i=0;i<a.length-1;i++)
        {
            System.out.println("i -> " + i);
            for(int j=i+1;j<a.length-1;j++)
            {
                if(a[i] == a[i+1])
                {
                    if(a[i] == a[j])
                    {
                        ++count;
                        System.out.println("Count1 -> " + count);
                    }
                    else
                    {
                        i = i + (count);
                        count = 0;
                        System.out.println("Count2 -> " + count);
                        break;
                    }
                }
                else
                {
                    ++ans;
                    System.out.println("Ans ->" + ans + " when at " + a[i] + " and count -> " + count);
                    break;
                }
            }
        }
*/