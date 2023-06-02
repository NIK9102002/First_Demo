package Nikhil.Java.DEMO.src;

class AdvancedPattern
{
    public static void main(String[] args)
    {
        //hollow_rec(4,5);
        // inverted_pyramid(4);
        //numeric_pyramid(5);
        //floyds_triangle(4);
        //zero_one_triangle(4);
        //butterflyPattern(4);
        //solidRhombus(9);
        //hollowRhombus(5);
        diamondPattern(7);
    }
    public static void hollow_rec(int row,int col)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i==1 || i==row || j==1 || j==col)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }System.out.println();
        }

    }
    public static void inverted_pyramid(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print(" ");
            for (int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void numeric_pyramid(int n)
    {
        for(int i=0;i<n;i++)
        {
            for (int j=1;j<n-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int n)
    {
        int count=1;
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
            {
                if((i+j)%2==0)
                    System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
    }
    public static void butterflyPattern(int n)
    {
        for (int i=1;i<=n;i++)
        {
            //STARS --->>> i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //SPACES --->>> 2(n-i)
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //STARS --->>> i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=n;i>=1;i--)
        {
            //STARS --->>> i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //SPACES --->>> 2(n-i)
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //STARS --->>> i
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void solidRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void diamondPattern(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}