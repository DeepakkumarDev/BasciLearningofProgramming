#include<iostream>
using namespace std;
class Sorting
{
public:
    void swap(int &x,int &y)
    {
        int temp;
        temp=x;
        x=y;
        y=temp;
        
    }

    void BubbleSort(int arr[],int len)
    {
        int i=0,j=0,flag=0;
        if(len==0)
            return;
        for(i=0;i<len;i++)
        {
            for(j=0;j<len-i;j++)
            {
                if(arr[i]<arr[j])
                {
                    swap(arr[i],arr[j]);
                }
            }
        }
    }

};
int main()
{
    Sorting s;
    int a=15,b=20;
    cout<<"a : "<<a<<" b : "<<b<<endl;
    s.swap(a,b);
    cout<<"After Swapping"<<endl;
    cout<<"a : "<<a<<" b : "<<b<<endl;
    return 0;
}