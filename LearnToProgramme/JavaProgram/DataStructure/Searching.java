import java.lang.Math.*;
class Search{
    int LinearSearch(int[] arr,int key)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    };

    int BinarySearch(int[] arr,int key)
    {
        int left=0;
        int right=arr.length-1;

        while(left<=right)
        {
            int mid=(left+right) / 2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]<key)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }

        return -1;

    } 

    int BinarySearchRec(int[] arr,int left,int right,int target)
    { 
    
        if(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target){
                return BinarySearchRec(arr, mid+1,right , target);
            }
            else

            {
                return BinarySearchRec(arr, left, mid-1, target);

            }
            
            
        }
        return -1;
    
    }

    int TernarySearch(int[] arr,int left,int right ,int target)
    {
        if(right>=left)
        {
            int partitionSize=(right-left)/3;
            int mid1=left+partitionSize;
            int mid2=right-partitionSize;

            if(arr[mid1]==target)
            {
                return mid1;
            }
            if(arr[mid2]==target)
            {
                return mid2;
            }
            if(arr[mid1]>target)
            {
                return TernarySearch(arr, left,mid1-1,target);
            }
            if(arr[mid2]<target)
            {
                return TernarySearch(arr, mid2+1, right, target);
            }

            return TernarySearch(arr, mid1+1, mid2-1, target);
        }

        return -1;
       

    }

    int JumpSearch(int[] arr,int target)
    {
        int blockSize=(int) Math.sqrt(arr.length-1);
        int start=0;
        int next=blockSize;
        while(start<arr.length-1 && arr[next-1]<target)
        {
            start=next;
            next+=blockSize;
            if(next>arr.length)
            {
                next=arr.length;
            }
        }
        for(int i=start;i<next;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;

    }

    int ExponentialSearch(int[] arr,int target)
    {
        int bound=1;
        while(bound<arr.length-1 && arr[bound]<target)
        {
            bound*=2;
        }
        int left=bound/2;
        int right=Math.min(bound,arr.length-1);
        return BinarySearchRec(arr, left, right, target);
    }

    int lowerBound(int[] arr,int target)
    {
        int left=0;
        int right=arr.length-1;
        int ans=-1;

        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                right=mid-1;
            }
            else if(arr[mid]>target)
            {
                right=mid-1;
            }
            else 
            {
                left=mid+1;
            }
        }
        return ans;

    }

};


public class Searching{
    public static void main(String args[]){
        Search s=new Search();
        int[] arr={0,1,1,1,2,2,2,3,4,4,5,6,10};
        int len=arr.length-1;
        int lb=s.lowerBound(arr,3);
        System.out.println("Lower Bound "+lb);
    
        /*
        int ls= s.LinearSearch(arr,1);
        System.out.println("Linear Search : "+ls);
        int bs=s.BinarySearch(arr, 1);
        System.out.println("Binary Search : "+bs);
        int bsr=s.BinarySearchRec(arr,0,len,1);
        System.out.println("BinarySearch Recursive : " +bsr);
        int ts=s.TernarySearch(arr,0,len,1);
        System.out.println("Ternary Search : "+ts);
        int js=s.JumpSearch(arr, 1);
        System.out.println("JumpSearch : "+js);
        */

    }
};