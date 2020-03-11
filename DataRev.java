class main
{
    public static void main(String args[])
    {
        int data[] = {0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0};
        //            |               |               |               |             |
        //            0               8               16              24            31
        //            1,1,1,1,1,1,1,1
        //            0,0,0,0,0,0,0,0
        //            0,0,0,0,1,1,1,1
        //            1,0,1,0,1,0,1,0
        
        int bytes = data.length / 8;
        int ans[] = new int[data.length];
        int copy = 0,count = 0;

        
        for(int i=1;i<=bytes;i++)
        {
           copy = (data.length - (i * 8));  
            for(int j=0;j<=7;j++,count++,copy++)
            {
                System.out.println("count = " + count);
                System.out.println("copy = " + copy);
                ans[count] = data[copy];
            }
        } this is the actual solution 

        

        for(int i=0;i<data.length;i++)
        {
            System.out.print(ans[i]);
        }
    }
}

        // for(int i=data.length - 7,j=0; i>=0 ;i -= 8,j++ )
        // {
        //     System.out.println("i = " + i + " j = " + j);
        //     ans[j] = data[i];
        // }