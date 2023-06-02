public class Basic_Arrays
{
    public static int linear_Search(int[] arr1, int key1)
   {
     for(int i=0;i<arr1.length;i++)
      {
        if(arr1[i]==key1)
        {
            return i;
        }
      }
     return -1;
  }
    public static int largest_number(int[] arr1)
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr1.length;i++)
        {
           if(arr1[i]>largest)
               largest=arr1[i];
        }
        return largest;
    }
    public static int smallest_number(int arr1[])
    {
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]<smallest)
                smallest=arr1[i];
        }
        return smallest;
    }
    public static int binary_Search(int arr2[],int key2)
    {
        int start=0,end=arr2.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            //////COMPARISONS
            if(arr2[mid]==key2)
                return mid;
            if(arr2[mid]<key2)   /////RIGHT CONDITION
                start=mid+1;
            else                 /////LEFT CONDITION
              end=mid-1;
        }
        return -1;
    }
    public static void reverseArray(int arr1[])
    {
      int first=0,last=arr1.length-1;
      while(first<last)
      {
          /////SWAP
          int temp=arr1[first];
          arr1[first]=arr1[last];
          arr1[last]=temp;
          first++;
          last--;
      }
    }
    public static void pairs_in_Array(int arr2[])
    {
        System.out.println("\n\nPAIRS IN AN ARRAY");
        for(int i=0;i< arr2.length;i++){
            for(int j=i+1;j<arr2.length;j++)
            {
                System.out.print("("+arr2[i]+","+arr2[j]+")");
            }
            System.out.println();
        }
    }
    public static void subArrays(int arr2[])
    {
     for(int i=0;i<arr2.length;i++)
     {
         for(int j=i;j<arr2.length;j++)
         {
             int c=0;
             for(int k=i;k<=j;k++)
             {
                 System.out.print(arr2[k]+" ");
                 c=c+arr2[k];

             }
             System.out.print("   Sum of subarray is "+c);
             System.out.println();
         }
         System.out.println();
     }
    }
    public static void maxSubArraySum(int arr2[])
    {
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=i;j<arr2.length;j++)
            {
                int currentSum=0;
                for(int k=i;k<=j;k++)
                {
                  currentSum+=arr2[k];
                }
                System.out.println(currentSum);
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Maximum sum is "+maxSum);
    }
    public static void maxSubArraySum_UsingPrefixSum(int arr2[])
    {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr2.length];

        prefix[0]=arr2[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr2[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            int start=i;
            for(int j=i;j<arr2.length;j++)
            {
                int end=j;
                 currentSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currentSum)
                {
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("Maximum sum by prefix method is "+maxSum);
    }
    public static void kadanes(int arr2[])
    {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr2.length;i++)
        {
            currSum=currSum+arr2[i];
            if(currSum<0){
                currSum=0;
            }

            maxSum=Math.max(currSum,maxSum);
        }
        System.out.println("Maximum sum by kadanes algorithm is "+maxSum);
    }
    public static int trapRainWater(int height[])
    {
        int n= height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];   ///For finding maximum from left side at index 0 there will any other left element that's why take it as a maximum only
        for(int i=1;i<n;i++)    ///Starting loop from 1 directly to avoid index zero problem otherwise for index 0 ,(i-1)will be -1 and negative value
        {
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int[n];  ///Creatimg new auxillary array
        rightMax[n-1]=height[n-1];  ///finding maximum right side element
        for(int i=n-2;i>=0;i--)
        {
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++)
        {
            int waterlevel=Math.min(leftMax[i],rightMax[i]);  ///Finding minimum of maxleft and rightmax
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;
    }
    public static int buysellStock(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(buyPrice<prices[i])
            {
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else
            {
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static boolean checkElements(int nums[])
    {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
            if(nums[i]==nums[j])
                return true;}
        }
        return false;
    }
    public static void duplicateArrays(int nums2[])
    {
        for(int i=0;i<nums2.length;i++)
        {
           for(int j=i+1;j<nums2.length;j++){
               for (int k=j+1;k<nums2.length;k++)
               {
                   if(nums2[i]+nums2[j]+nums2[k]==0)
                   {
                       System.out.println("("+nums2[i]+","+nums2[j]+","+nums2[k]+")");
                   }
               }
           }
        }

    }

    public static void main(String[] args)
    {
        int arr1[]={2,38,1,64,8,95,29};
        int key1=20;
        int index=linear_Search(arr1,key1);
        if(index==-1)
        {
            System.out.println("Key not Found");
        }
        else
        {
            System.out.println("Key Found at index "+index);
        }

        //////////PROGRAM FOR LARGEST NUMBER
        int large_no=largest_number(arr1);
        System.out.println("Largest no. in array is "+large_no);

        //////////PROGRAM FOR SMALLEST NUMBER
        int small_no=smallest_number(arr1);
        System.out.println("Smallest no. in array is "+small_no);

        //////////BINARY SEARCH
        int[] arr2 ={1,3,5,7,9,11};
        int key2=9;
        System.out.println("Key is at index "+binary_Search(arr2,key2));

        //////////REVERSE ARRAY
        reverseArray(arr1);
        //<<<<-----Printing array----->>>>
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }

        ////////////PAIRS IN ARRAY
        pairs_in_Array(arr2);

        ////////////SUBARRAYS
        subArrays(arr2);

        ///////////
        maxSubArraySum(arr2);
        maxSubArraySum_UsingPrefixSum(arr2);
        kadanes(arr2);

        /////////TRAPPED RAINWATER
        int height[]={2,4,1,5,8,2,9};
        System.out.println(trapRainWater(height));

        /////////STOCKS
        int prices[]={7,1,5,3,6,4};
        System.out.println(buysellStock(prices));

        /////////CHECKING ELEMENTS REPETATION
        int nums[]={1,2,3,4,5};
        System.out.println(checkElements(nums));

        int nums2[]={-1,0,1,2,-1,-4};
        duplicateArrays(nums2);


    }
}
