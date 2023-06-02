public class DivideAndConquere
{
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
     int mid=si+(ei-si)/2;
     mergeSort(arr,si,mid);  //left
     mergeSort(arr,mid+1,ei);  //right
     merge(arr,si,mid,ei);
    }
    public static void merge(int[] arr, int si, int mid, int ei)
    {
        int[] temp =new int[ei-si+1];
        int i=si; //iterator for left part
        int j=mid+1;  //iterator for right part
        int k=0;  //iterator for temp array
        while(i<=mid && j<=ei)
        {
            if(arr[i] <arr [j])
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid)  //left part
        {
            temp[k++]=arr[i++];
        }
        while(j<=ei)  //right part
        {
            temp[k++]=arr[j++];
        }
        for(k=0,i=si; k<temp.length; k++,i++)
        {
         arr[i]=temp[k];
        }
    }
    //<<---------QUICK SORT------------->>
    public static void quickSort(int[] arr, int si, int ei)
    {
        if(si>=ei)
            return;
        int pIdx=partition(arr,si,ei);
        quickSort(arr, si,pIdx-1);//left part
        quickSort(arr, pIdx+1, ei);  //Right Part
    }
    public static int partition(int arr[],int si,int ei)
    {
        int pivot=arr[ei];  //Last element
        int i=si-1;  //To make place for elements smaller than pivot.
        for(int j=si;j<ei;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[j];  //swap
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;  //swap
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    //<<<---------Sorted and Rotated Array search---------->>>
    public static int search(int[] arr,int tar,int si,int ei)
    {
        if(si>ei) {
            return -1;
        }
        int mid=(si+ei)/2;
        if(arr[mid]==tar)
            return mid;

        if(arr[si]<=arr[mid])   //mid on L1
        {//case a:left
            if(arr[si]<=tar && tar<=arr[mid])
            {
                return search(arr,tar,si,mid-1);
            }
            else{//case b: Right
                return search(arr,tar,mid+1,ei);
            }
        }
        else  //mid on L2
        {//case C: Right
            if(arr[mid]<=tar && tar<=arr[ei])
            {
                return search(arr,tar,mid+1,ei);
            }
            else{//case D:Left
                return search(arr,tar,si,mid-1);
            }
        }
    }
    public static String [] stringMergeSort(String[] arr2,int lo,int hi)
    {
       if(lo==hi)
       {
           String[] A={arr2[lo]};
           return A;
       }
       int mid=lo+(hi-lo)/2;
       String arr3[]=stringMergeSort(arr2, lo, mid);  //left
       String arr4[]=stringMergeSort(arr2,mid+1,hi);  //right
       String arr5[]=stringMerge(arr3,arr4);
       return arr5;
    }
    public static String[] stringMerge(String arr3[],String arr4[])
    {
        int m=arr3.length;
        int n=arr4.length;
        String arr5[]=new String[m+n];
        int idx=0,i=0,j=0;
        while(i<m && j<n)
        {
            if(isAlphabeticallySmaller(arr3[i],arr4[j]))
            {
                arr5[idx]=arr3[i];
                i++;idx++;
            }
            else
            {
                arr5[idx]=arr4[j];
                j++;idx++;
            }
        }
        while(i<m)
            {
                arr5[idx]=arr3[i];
                i++;idx++;
            }
        while(j<n)
            {
                arr5[idx]=arr4[j];
                j++;idx++;
            }
        return arr5;
    }
    static boolean isAlphabeticallySmaller(String str3,String str4)
    {
        if(str3.compareTo(str4)<0)
        {
            return true;
        }
        return false;
    }
    public static int countInRange(int[] nums,int num,int lo,int hi)
    {
        int count=0;
        for (int i=lo;i<=hi;i++)
        {
            if(nums[i]==num)
            {
                count++;
            }
        }
        return count;
    }
    public static int majorityElementRec(int[] nums,int lo,int hi)
    {
        if (lo==hi)  //base case
        {
            return nums[lo];
        }
        int mid=(hi-lo)/2+lo;
        int left=majorityElementRec(nums,lo,mid);
        int right=majorityElementRec(nums,mid+1,hi);
        if(left==right)
        {
            return left;
        }
        int leftcount=countInRange(nums,left,lo,hi);
        int rightcount=countInRange(nums,right,lo,hi);
        return leftcount>rightcount ? left :right;
    }
    public static int majorityElement(int[] nums)
    {
        return majorityElementRec(nums,0, nums.length-1);
    }
    public static void main(String [] args)
    {
        int arr[]={6,3,9,8,2,5};
        //mergeSort(arr,0,arr.length-1);
        //printArr(arr);
        //quickSort(arr,0,arr.length-1);
        //printArr(arr);
        //int arr1[]={4,5,6,7,0,1,2};
        //int target=4;
        //int taridx=search(arr1,target,0,arr.length-1);
        //System.out.println(taridx);
        //String[] arr2={"sun","earth","mars","mercury"};
        //String[] a=stringMergeSort(arr2,0,arr2.length-1);
        /*for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }*/
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
