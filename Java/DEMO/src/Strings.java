public class Strings
{
    public static boolean palindrome(String str)
    {int n=str.length();
        for(int i=0;i<str.length()/2;i++)
        {

            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static double shortestPath(String path)
    {
        int x=0,y=0;
        int n=path.length();
        for(int i=0;i<n;i++)
        {
            char dir=path.charAt(i);
            //South
            if(dir=='S')
            {   y--;}
            //North
            else if (dir=='N')
            {  y++;}
            //East
            else if (dir=='E')
            { x++;}
            //West
            else if(dir=='W')
            {x--;}

        }
        int X2=x*x;
        int Y2=y*y;
        return Math.sqrt(X2+Y2);
    }
    public static void compare(String S1, String S2,String S3)
    {
        if(S1==S2)
        {
            System.out.println(" S1 Equal S2");
        }
        else System.out.println("S1 Not Equal S2");

        if(S1==S3)
        {
            System.out.println("S1 Equal S2");
        }
        else System.out.println("S1 Not Equal S3");
        if(S1.equals(S3))
        {
            System.out.println("S1 Equal S3");
        }
        else System.out.println("S1 Not Equal S3");
    }
    public static void subString(String sample)
    {
        String subStr=sample.substring(0,5);
        System.out.println(subStr);

    }
    public static void largetString(String fruits[])
    {
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++)
        {
            if(largest.compareToIgnoreCase(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }
        System.out.println("Largest String is"+" \'"+largest +"\'");

    }
    public static void stringBuilder()
    {
        StringBuilder sb=new StringBuilder();
        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch);
        }
        System.out.println(sb);
    }
    public static String toUpperCase(String random)
    {
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(random.charAt(0));
        sb.append(ch);
        for(int i=1;i<random.length();i++)
        {
            if(random.charAt(i)==' ' && i<random.length()-1)
            {
                sb.append(random.charAt(i));
                i++;
                sb.append(Character.toUpperCase(random.charAt(i)));
            }
            else
            {
                sb.append(random.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String com)
    {
       String newStr="";
       for(int i=0;i<com.length();i++)
       {
           Integer count=1;
           while(i<com.length()-1 && com.charAt(i)==com.charAt(i+1))
           {
               count++;
               i++;
           }
           newStr+= com.charAt(i);
           if(count>1){
           newStr+=count.toString();
           }
       }
       return newStr;
    }
    public static void main(String[] args) {
        String str="noon";
        //System.out.println(palindrome(str));
        String S1="Tony";
        String S2="Tony";
        String S3=new String("Tony");
        String sample="Hello World";
        String path="WNEENESENNN";
        String fruits[]={"apple","mango","banana"};
        String random="hi, i am nikhil";
        String com="aaabbcccdd";
        //System.out.println(shortestPath(path));
        //compare(S1,S2,S3);
        //subString(sample);
        //largetString(fruits);
        //stringBuilder();
        //System.out.println(toUpperCase(random));
        System.out.println(compress(com));

    }
}
