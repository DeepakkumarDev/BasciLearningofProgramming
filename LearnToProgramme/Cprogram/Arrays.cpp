#include <iostream>
using namespace std;
template<class T>
class Array
{
private:
    T *A;
    int size;
    int length;
public:
    Array()
    {
        size=10;
        A=new T[10];
        length=0;
    }

    Array(int sz)
    {
        this->size=sz;
        length=0;
        A=new T[size];
    }
    ~Array()
    {
        delete []A;
    }

    void Display();
    void Insert(int index,T x);
    T Delete(int index);
    void Append(T x);
    void swap(T *x,T *y);
    T LinearSearch(T key);
    T ImprovedLinearSearch(T key);
    T BinarySearch(T key);
    T RecBinarySearch(T l, T h ,T key);
    T Get(int index);
    void Set(int index , T x);
    T Max();
    T Min();
    T Sum();
    T Avg();
    T RecSum(int n);
    void Reverse();
    void LeftShift();
    void RightShift();
    void LeftRotate();
    void RightRotate();


};
template<class T>
void Array<T>::Display()
{
    for(int i=0;i<length;i++)
        cout<<A[i]<<" ";
    cout<<endl;
}
template<class T>
void Array<T>::Insert(int index,T x)
{
    if(index>=0 && index<=length)
    {
        for(int i=length-1;i>=index;i--)
        
        {
            A[i+1]=A[i];
        }
        A[index]=x;
        length++;
    }
}
template<class T>
T Array<T>::Delete(int index)
{
    T x;
    if(index>=0 && index<length)
    {
        x=A[index];
        for(int i=index;i<length-1;i++)
        {
            A[i]=A[i+1];
        }
        length--;
    }
    return x;
}
int main() {
    Array<int> arr(10);
    arr.Insert(0,5);
    arr.Insert(1,6);
    arr.Insert(2,9);
    arr.Display();
    cout<<arr.Delete(0)<<endl;
    arr.Display();
    return 0;
}
