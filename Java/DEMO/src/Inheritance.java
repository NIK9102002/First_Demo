import java.util.*;
class Dat
{
    protected int a,b;
    public void read(int x,int y)
    {
        a=x;
        b=y;
    }
}
class sum extends Dat
{
    private int sum;
    public void add()
    {
        sum=a+b;
    }
    public void display()
    {
        System.out.println("Sum: "+sum);
    }
}
public class Inheritance extends Dat
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a & b");
        x=sc.nextInt();
        y=sc.nextInt();
        sum I1=new sum();
        I1.read(x,y);
        I1.add();
        I1.display();
    }
}
