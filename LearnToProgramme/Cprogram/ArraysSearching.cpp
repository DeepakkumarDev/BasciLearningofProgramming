#include<iostream>
#include<cmath>
using namespace std;
class Searching
{
public:
    int LinearSearch(int arr[],int size,int key)
    {  
        for(int i=0;i<size;i++)
        {
            if(arr[i]==key)
            {
                return i+1;
            }
        }
        return -1;
    }

    int BinarySearch(int arr[],int size,int key)
    {
        return BinarySearchRec(arr,0,size,key);
    }
 

    int BinarySearchItr(int arr[],int size,int key)
    {
        int low=0;
        int high=size;
        

        while(low<=high)
        {
            int mid=low+(high -low)/2;
            if(arr[mid]==key)
            {
                return mid+1;
            }
            else if(arr[mid]<key)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;

    } 


    int BinarySearchRec(int arr[],int low,int high,int key)
    {  

    
        if(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==key)
            {
                return mid+1;
            }
            else if(arr[mid]<key)
            {
                return BinarySearchRec(arr,mid+1,high,key);
            }
            else{
                return BinarySearchRec(arr,low,mid-1,key);
            }
        }
        return -1;
     
    }

    int TernarySearch(int arr[],int left,int right,int target)
    {
        if(left<=right)
        {
            int partitionSize=(right-left)/3;
            int mid1=left+partitionSize;
            int mid2=right-partitionSize;
            if(arr[mid1]==target)
            {
                return mid1+1;
            }
            if(arr[mid2]==target)
            {
                return mid2+1;
            }
            if(target<arr[mid1])
            {
                return TernarySearch(arr,left,mid1-1,target);
            }
            if(target>arr[mid2])
            {
                return TernarySearch(arr,mid2+1,right,target);
            }
            return TernarySearch(arr,mid1+1,mid2-1,target);
        }
        return -1;
    }

    int JumpSearch(int arr[],int len,int target)
    {
        int blockSize=(int) sqrt(len);//pow(length ,0.5);
        int start=0;
        int next=blockSize;
        while(start<len && arr[next-1]<target)
        {
            start=next;
            next+=blockSize;
            if(next>len)
            {
                next=len;
            }
        }
        for(int i=start;i<next;i++)
        {
            if(arr[i]==target)
            {
                return i+1;
            }
        }
        return -1;
    }


    int ExponentialSearch(int arr[],int len,int target)
    {
        int bound=1;
        while(bound<len && arr[bound]<target)
        {
            bound*=2;
        }

        int left=bound/2;
        int right=min(bound,len);

        return BinarySearchRec(arr,left,right,target);
    }

};


int main()
{
    Searching s;
    int arr[]={};//1,2,3,4,5,6,7,8,9};

    int size = sizeof(arr) / sizeof(arr[0]);
    cout<<"Size : "<<size<<endl;
    cout<<"LinearSearch : "<<endl;
    cout<<s.LinearSearch(arr,size,1)<<endl;
    cout<<"Binary Serach :" <<endl;
    cout<<s.BinarySearch(arr,size,1)<<endl;
    cout<<"Ternary Search : "<<endl;
    cout<<s.TernarySearch(arr,0,size,1)<<endl;
    cout<<"Jump Search : "<<s.JumpSearch(arr,size,1)<<endl;
    cout<<"ExponentialSearch : "<<s.ExponentialSearch(arr,size,1)<<endl;
    return 0;
};

