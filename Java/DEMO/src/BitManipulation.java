public class BitManipulation
{
    public static void odd_Or_Even(int n)
    {
        int bitMAsk=1;
        if((bitMAsk & n)==0)
        {
            System.out.println("Even number");
        }
        else System.out.println("Odd Number");

    }
    public static int getithBit(int n,int i)
    {
        int bitMask=1<<i;
        if((n & bitMask)==0)
        return 0;
        else return 1;
    }
    public static int setithbit(int n,int i)
    {
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearithBit(int n,int i)
    {
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int updateithBit(int n,int i,int newBit)
    {
       /* if (newBit==0)
            return clearithBit(n,i);
        else
            return setithbit(n,i);*/
        //Both Program are Optional to each other
        n=clearithBit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }
    public static int cleariBits(int n,int i)
    {
        int bitMask=((-1)<<i);
        return n&bitMask;
    }
    public static int clearBitsInRange(int n,int i,int j)
    {
        int a=((~0)<<(j+1));
        int b=((1<<i)-1);
        int bitMask=a|b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n)
    {
        return (n & (n-1))==0;
    }
    public static int countSetBits(int n)
    {
        int count =0;
        while(n>0)
        {
            if((n & 1)!=0)
            {
                count ++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExponentiation(int a,int n)
    {
        int ans=1;
        while(n>0)
        {
            if ((n & 1) != 0)
            {
                ans = ans * a;
            }
            n=n>>1;
            a=a*a;
        }
        return ans;
    }
    public static int moduloExponentiation(int x,int y,int p)
    {
        int ans=1;
        while(y>0)
        {
            if((y&1)!=0)
            {
                ans=ans*x;
            }
            y=y>>1;
            x=x*x;
        }
        return ans%p;
    }
    public static void main(String[] args) {
        // odd_Or_Even(3);
        // odd_Or_Even(8);
        //System.out.println(getithBit(10,3));
        //System.out.println(getithBit(10,2));
        //System.out.println(setithbit(10,2));
        //System.out.println(clearithBit(10,1));
        //System.out.println(updateithBit(10,1,0));
        //System.out.println(cleariBits(15,2));
        //System.out.println(clearBitsInRange(10,2, 4));
        //System.out.println(isPowerOfTwo(15));
        //System.out.println(countSetBits(15));
        //System.out.println(fastExponentiation(5,3));
        System.out.println(moduloExponentiation(2,5,13));



    }
}
