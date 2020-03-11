class main
{
    public static void main(String[] args) {
        int a[] = {1,2,2,3,1,4,5,4,6,3,7,7,4,7,4,10};
        //               |     |                  |
        int count = 0;
        int ans = 0;

        for(int i=0;i<a.length;i++,count = 0)
        {  
            for(int j=0;j<a.length;j++)
            {
                if(i != j)
                {
                    if(a[i] == a[j])
                    {
                        ++count;
                    }
                }
            }
            if(count == 0)
            {
                ++ans;
            }
        }
        System.out.println(ans);
    }
}