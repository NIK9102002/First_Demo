package Nikhil.Java.DEMO.src;

class Demo4
{
    public static boolean isPrime(int n)
    { boolean isp=true;
        for (int i=2;i<=n-1;i++)
        {

            if(n%2==0)
            {
              isp=false;
              break;
            }
        }
    return isp;
    }
    public static void primeInRange(int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i)==true)
            {
                System.out.print(i+"  ");
            }
        }
        System.out.println();
    }
    public static void binaryToDecimal(int binNum)
    {
        int decNum=0,pow=0;
        while(binNum>0)
        {
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal No is "+decNum);
    }
    public static void decimalToBinary(int deciNum)
    {
        int pow=0,binNum=0;
        while(deciNum>0)
        {
            int rem=deciNum%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            deciNum=deciNum/2;
        }
        System.out.println("Binary No is "+ binNum);
    }
    public static void main(String[] args)
    {
        //primeInRange(20);
        //binaryToDecimal(1010);
        decimalToBinary(4);
    }

}