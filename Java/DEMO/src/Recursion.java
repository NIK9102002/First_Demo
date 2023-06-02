public class Recursion {
    public static void printDec(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int factnm1=fact(n-1);
        int factn=n*factnm1;
        return factn;
    }
    public static int sumnnatural(int n)
    {
        if(n==1)
            return 1;
        int sum=n+sumnnatural(n-1);
        return sum;
    }
    public static int fib(int n) {
        if (n == 0)
        {
            return 0;
        }
    else if (n==1)
    {
        return 1;
    }
    int fibn=fib(n-1)+fib(n-2);
     return fibn;
    }
    public static boolean isSorted(int arr[],int i)
    {
        if(i== arr.length-1)
            return true;
        if (arr[i]>arr[i+1])
            return false;
        return isSorted(arr,i+1);
    }
    public static int firstOccurence(int arr1[],int key,int i)
    {
        if(i== arr1.length)
            return -1;
        if(arr1[i]==key)
            return i;
        return firstOccurence(arr1,key,i+1);
    }
    public static int lastOccurence(int arr1[],int key,int i)
    {
        if (i == arr1.length)
            return -1;
        int isFound=lastOccurence(arr1,key,i+1);
        if(isFound==-1 && arr1[i]==key)
            return i;
        return isFound;
    }
    public static int firstOccurence=-1;
    public static int lastOccurence=-1;
    public static void firstAndLastOccurence(String str3,int idx,char element)
    {
        if(idx==str3.length())
        {
            System.out.println(firstOccurence);
            System.out.println(lastOccurence);
            return;
        }
        char currChar=str3.charAt(idx);
        if(currChar==element)
        {
            if(firstOccurence==-1)
            {
                firstOccurence=idx;
            }
            else lastOccurence=idx;
        }
        firstAndLastOccurence(str3,idx+1,element);
    }
    public static int power(int x,int n)
    {
        if(n==0)
            return 1;
       //int xnm1=power(x,n-1);
       //int xn=x*xnm1-1;
       //return xn;
        return x*power(x,n-1);
    }
    public static int optimizedPower(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int halfPower=optimizedPower(x,n/2);
        int halfPowerSq = halfPower * halfPower;

        if(n%2!=0)
        {
            halfPowerSq =  x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static int tilingproblem(int n )//n will length of floor
    {
        if(n==0 || n==1)
            return 1;
        //Vertical Choice
        int fnm1=tilingproblem(n-1);
        //Horizontal choice
        int fnm2=tilingproblem(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map)
    {
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true)
        {
            removeDuplicates(str,idx+1,newStr,map);
        }
        else
        {
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static int friendspairing(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        int fnm1=friendspairing(n-1);
        int fnm2=friendspairing(n-2);
        int pairways=(n-1)*fnm2;
        int totalways=pairways+fnm1;
        return totalways;
    }
    public static void printBinStrings(int n,int lastplace,String str )
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        printBinStrings(n-1,0,str+"0");
        if(lastplace==0)
        {
            printBinStrings(n-1,1,str+"1");
        }
    }
    public static void keyOccurences(int arr2[],int idx,int key)
    {
        if(arr2.length==idx)
        {
            return;
        }
        if(arr2[idx]==key)
        {
            System.out.println(idx+ " ");
        }
        keyOccurences(arr2, idx + 1, key);
    }
    public static void printDigits(int n)
    {
        String digits[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(n==0)
        {
            return;
        }
        int lastDigit=n%10;
        printDigits(n/10);
        System.out.print(digits[lastDigit]+" ");
    }
    public static int stringLength(String str1)
    {
        if(str1.length()==0)
        {
            return 0;
        }
       return stringLength(str1.substring(1))+1;
    }
    public static int countSubstring(String str2,int i,int j,int n)
    {
        if(n==1 || n<=0)
        {
            return n;
        }
        int res=countSubstring(str2,i+1,j,n-1)+countSubstring(str2,i,j-1,n-1)-countSubstring(str2,i+1,j-1,n-2);
        if(str2.charAt(i)==str2.charAt(j))
        {
            res++;
        }
        return res;
    }
    public static void towerOfHanoi(int n,String src,String hel,String dest)
    {
        if(n==1)
        {
            System.out.println("Transfer disc"+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,hel);
        System.out.println("Transfer disc"+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1,hel,src,dest);
    }
    public static void printRev(String str2,int idx)
    {
        if(idx==0)
        {
            System.out.println(str2.charAt(idx));
            return;
        }
        System.out.print(str2.charAt(idx));
        printRev(str2,idx-1);
    }
    public static void moveAllX(String str4,int idx,int count,String newString)
    {
        if(idx==str4.length())
        {
            for(int i=0;i<count;i++)
            {
                newString+="x";
            }
            System.out.println(newString);
            return;
        }
        char currChar=str4.charAt(idx);
        if(currChar=='x')
        {
            count++;
            moveAllX(str4,idx+1,count,newString);
        }
        else
        {
            newString+=currChar;
            moveAllX(str4,idx+1,count,newString);
        }
    }
    public static void subSequences(String str5,int idx,String newString)
    {
        if(str5.length()==idx)
        {
            System.out.println(newString);
            return;
        }
        char currChar=str5.charAt(idx);
        subSequences(str5,idx+1,newString+currChar); //to be
        subSequences(str5,idx+1,newString);
    }
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String str6,int idx,String combination)
    {
        if(str6.length()==idx)
        {
            System.out.println(combination);
            return;
        }
        char currchar=str6.charAt(idx);
        String mapping=keypad[currchar-'0'];
        for(int i=0;i<mapping.length();i++)
        {
            printComb(str6,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,6};
        int arr1[]={8,3,6,9,5,10,2,5,3};
        int arr2[]={3,2,4,5,6,2,7,2,2};
        String str1="Nikhil";
        String str="appnnacollege";
        String str2="abcd";
        String str3="abcdaafbaafghaf";
        String str4="axbxcxxdx";
        String str5="abc";
        String str6="23";
        //printDec(10);
        //System.out.println(fact(5));
        //printInc(10);
        //System.out.println(sumnnatural(5));
        //System.out.println(fib(26));
        //System.out.println(isSorted(arr,0));
        //System.out.println(firstOccurence(arr1,5,0));
        //System.out.println(lastOccurence(arr1,5,0));
        //System.out.println(power(2,10));
        //System.out.println(optimizedPower(2,10));
        //System.out.println(tilingproblem(3));
        //removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
        //System.out.println(friendspairing(4));
        //printBinStrings(3,0,"");
        //keyOccurences(arr2,0,2);
        //printDigits(1234);
        //System.out.println(stringLength(str1));
        //System.out.println(countSubstring(str2,0,str2.length()-1,str2.length()));
        //towerOfHanoi(4,"S","H","D");
        //printRev(str2,str2.length()-1);
        //firstAndLastOccurence(str3,0,'a');
        //moveAllX(str4,0,0,"");
        //subSequences(str5,0,"");
        printComb(str6,0,"");

    }
}
