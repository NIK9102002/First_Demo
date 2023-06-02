package Nikhil.Java.DEMO.src;

class Demo3
{
    public static void sum(int nums[],int target)
    {
        for (int i=0;i<nums.length;i++)
        {
         for (int j=i+1;j<nums.length;j++)
         {
             if(nums[i]+nums[j]==target)
             {
                 System.out.print(i+","+j);
             }
         }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[]={2,7,1,8,11,9,0,3,6};
        int target=9;
        sum(nums,target);

    }
}