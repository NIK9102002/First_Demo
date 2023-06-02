public class BasicPatterns
{
    public static void StarPattern()
    {

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedStarPattern()
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i+1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void halfPyramid()
    {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count); //Or Simply print j value it will give count only
            }
            System.out.println();
        }
    }
    public static void characterPattern()
    {
        char ch='A';
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        //AdvancedPattern();
        //invertedStarPattern();
        //halfPyramid();
        characterPattern();

    }
}
