class Demo6

{
    public static void main(String[] args)
    {
      primesInRange(20);

    }
    public static boolean isprime(int n)
    {
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++)
        {
            if (n % i == 0)
            {
                isPrime=false;
                break;
            }
            }
        return isPrime;
    }
    public static void primesInRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    }
