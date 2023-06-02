class Demo5
{
    public static int search(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
           if( numbers[i]==key){
              return i;}
        }
        return -1;
    }
    public static int search_fruit(String str[],String fruit)
    {
        for(int i=0;i<str.length;i++)
        {
            if (str[i].equals(fruit))
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int numbers[]={2,4,6,8,10,12,14,16,18,20};
        String str[]={"Mango","Grapes","Guava","Apple","Orange"};
        int key=20;
        String fruit="Apple";
        int index=search(numbers,key);
        if(index==-1)
        {
            System.out.println("Key Not found");
        }
        else System.out.println("key="+index);
        int fruits=search_fruit(str,fruit);
        if(fruits==-1)
        {
            System.out.println("Fruit not found");
        }
        else System.out.println("Fruit index="+fruits);
    }
}