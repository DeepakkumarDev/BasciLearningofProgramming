#include<iostream>
using namespace std;

/*
Question 1.
Write a program to reverse an array
*/

void ReverseArrays(int arr[] ,int length){
	int temp;
  for(int i=0,j=length-1;i<j;i++,j--){
    temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
  }
  
};

/*
Question 2.

Find the kth largest element in an array in linear
time complexity.
*/

int kthLargestElement(int A[],int length,int k){
	int temp;
		for(int i=0;i<k;i++){
			for(int j=0;j<length-i-1;j++){
				if(A[j]>A[j+1]){
					temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;						
				}
			}
		}
		
	
	return A[length-k];
	
};

int KthSmallestElement(int A[],int length,int kth){
	int i,j,k,temp;
	for(i=0;i<kth+1;i++){
		for(j=k=i;j<=length-1;j++){
			if(A[j]<A[k]){
				k=j;
			}
		}
		temp=A[i];
		A[i]=A[k];
		A[k]=temp;
	}
	
	return A[kth-1];
};

/*
Question 3.

Kadane's Algorithm 

Given an integer array arr, find the contiguous
subarray (containing at least one number) which
has the largest sum and return its sum and print
the subarray.

*/


int ContigousMaxSubArraySum(int A[],int length){
	int i,j,k,sum=0,maxsum=A[0];
	for(i=0;i<length;i++){
		sum=0;
		for(j=i;j<length;j++){	
			sum+=A[j];
			if(sum>maxsum){
				maxsum=sum;
			}	
		}
	}
	return maxsum;
};


int main(){
	//int arr[]={1,2,3,4,5,6};
	int arr[] = {7, 10, 4, 3, 20, 15};
	for(int j=0;j<6;j++){
		cout<<arr[j]<<" ";
	}
	
	cout<<"kthLargestElement : "<<kthLargestElement(arr,6,4)<<endl;
	
	cout<<"KthSmallestElement : "<<KthSmallestElement(arr,6,3)<<endl;
	//ReverseArrays(arr,6);
	int B[]={5,4,-1,7,8};
	cout<<" ContigousMaxSubArraySum : "<<ContigousMaxSubArraySum(B,5)<<endl;
	
	cout<<"After Reverse Function : ";
	
	for(int j=0;j<6;j++){
		cout<<arr[j]<<" ";
	}

  
  return 0;
}
