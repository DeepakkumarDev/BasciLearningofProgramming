#include<iostream>
#include<cmath>
using namespace std;
#include "Bins.h"

void swap(int *x,int *y){
	int temp=*x;
	*x=*y;
	*y=temp;
};

void BubbleSort(int A[],int n){
	int i,j,flag;
	for(i=0;i<n-1;i++){
		flag=0;
		for(j=0;j<n-i-1;j++){
			if(A[j]>A[j+1]){
				swap(&A[j],&A[j+1]);
				flag=1;
			}
		}
		if(flag==0){
			break;
		}
	}
};
void RecBubbleSort(int A[],int n){
	if (n==1){
		return;
	}
	for(int i=0;i<n-1;i++){
		if(A[i]>A[i+1]){
			swap(&A[i],&A[i+1]);
		}
	}
	RecBubbleSort(A,n-1);
	
};
void InsertionSort(int A[],int n){
	int i,j,x;
	for(i=1;i<n;i++){
		j=i-1;
		x=A[i];
		while(j>-1 && A[j]>x){
			A[j+1]=A[j];
			j--;
		}
		
		A[j+1]=x;
	}
};
void RecInsertionSort(int A[],int n){
	if(n<=1){
		return;
	}
	RecInsertionSort(A,n-1);
	int lastElement=A[n-1];
	int j=n-2;
	while(j>=0 && A[j]>lastElement){
		A[j+1]=A[j];
		j--;
	}
	A[j+1]=lastElement;
};
void SelectionSort(int A[],int n){
	int i,j,k;
	for(i=0;i<n-1;i++){
		for(j=k=i;j<n;j++){
			if(A[j]<A[k]){
				k=j;
			}
		}
		swap(&A[i],&A[k]);
	}
	
};
void RecSelectionSort(int A[],int n,int i=0){
	if(i==n-1){
		return;
	}
	int minIndex=i;
	for(int j=i+1;j<n;j++){
		if(A[j]<A[minIndex]){
			minIndex=j;
		}
	}
	
	swap(&A[i],&A[minIndex]);
	RecSelectionSort(A,n,i+1);
};

int partition(int A[] ,int l,int h){
	int pivot=A[l];
	int i=l,j=h;
	do{
		do{i++;
		}while(A[i]<=pivot);
		do{j--;
		}while(A[j]>pivot);
		
		if(i<j){
			swap(&A[i],&A[j]);
		}
	}while(i<j);
	
	swap(&A[l],&A[j]);
	
	return j;
	
};
void QuickSort(int A[],int l,int h){
	int j;
	if(l<h){
		j=partition(A,l,h);
		QuickSort(A,l,j);
		QuickSort(A,j+1,h);
	}
};

void MergeTwoList(int A[],int B[],int m,int n,int c[]){
	int i,j,k;
	i=j=k=0;
	//int c[n+m];
	while(i<m && j<n){
		if(A[i]<B[j]){
			c[k++]=A[i++];
		}else{
			c[k++]=B[j++];
		}
	}
	for(;i<m;i++){
		c[k++]=A[i];
	}
	
	for(;j<n;j++){
		c[k++]=B[j];
	}
};

void Merge(int A[],int l,int mid,int h){
	
	int i=l,j=mid+1,k=l;
	int *B=new int[h-l+1];
	while(i<=mid && j<=h){
		if(A[i]<A[j]){
			B[k++]=A[i++];
		}else{
			B[k++]=A[j++];
		}
	}
	
	for(;i<=mid;i++){
		B[k++]=A[i];
	}
	for(;j<=h;j++){
		B[k++]=A[j];
	}
	
	for(int i=l;i<=h;i++){
		A[i]=B[i];
	}
	
	delete[] B;
	
};

void IMergeSort(int A[],int n){
	int p,l,h,mid,i;
	for(p=2;p<=n;p=p*2){
		for(i=0;i+p-1<n;i=i+p){
			l=i;
			h=i+p-1;
			mid=(l+h)/2;
			Merge(A,l,mid,h);
		}
	}
	if(p/2<n-1){
		Merge(A,0,p/2-1,n-1);
	}
};

void MergeSort(int A[],int l,int h){
	int mid;
	if(l<h){
		mid=(l+h)/2;
		MergeSort(A,l,mid);
		MergeSort(A,mid+1,h);
		Merge(A,l,mid,h);
	}
};

int findMax(int A[],int n){
	int max=INT_MIN;
	int i;
	for(i=0;i<n;i++){
		if(A[i]>max){
			max=A[i];
		}
	}
	return max;
};

void CountSort(int A[],int n){
	int i,j,max,*C;
	max=findMax(A,n);
	C=new int[max+1];
	for(i=0;i<max+1;i++){
		C[i]=0;
	}
	
	for(i=0;i<n;i++){
		C[A[i]]++;
	}
	i=0;j=0;
	while(j<max+1){
		if(C[j]>0){
			A[i++]=j;
			C[j]--;
		}else{
			j++;
		
		}
	}
};

void BinSort(int A[],int n){
	int max,i,j;
	Node **Bins;
	max=findMax(A,n);
	Bins=new Node*[max+1];
	for(i=0;i<max+1;i++){
		Bins[i]=NULL;
	}
	for(i=0;i<n;i++){
		Bins[A[i]]=Insert(Bins[A[i]],A[i]);
	}
	i=0,j=0;
	while(i<max+1){
		while(Bins[i]!=NULL){
			A[j++]=Delete(Bins[i]);
		}
		i++;
	}
	delete[] Bins;
};
void RadixSort(int A[], int n) {
    int max = findMax(A, n);

    // Find the number of digits in the maximum number
    int digits = 0;
    while (max > 0) {
        max /= 10;
        digits++;
    }

    Node** Bins = new Node*[10];
    for (int i = 0; i < 10; i++) {
        Bins[i] = NULL;
    }

    // Perform counting sort for each digit
    for (int d = 0; d < digits; d++) {
        for (int i = 0; i < n; i++) {
            int digit = (A[i] / static_cast<int>(pow(10, d))) % 10;
            Bins[digit] = Insert(Bins[digit], A[i]);
        }

        int i = 0;
        for (int j = 0; j < 10; j++) {
            while (Bins[j] != NULL) {
                A[i++] = Delete(Bins[j]);
            }
        }
    }

    // Clean up memory
    for (int i = 0; i < 10; i++) {
        while (Bins[i] != NULL) {
            Delete(Bins[i]);
        }
    }
    delete[] Bins;
};


void ShellSort(int A[] ,int n){
	int gap,i,j,temp;
	for(gap=n/2;gap>=1;gap/=2){
		for(i=gap;i<n;i++){
			temp=A[i];
			j=i-gap;
			while(j>=0 && A[j]>temp){
				A[j+gap]=A[j];
				j=j-gap;
			}
			A[j+gap]=temp;
		}
	}
};
int main(){
	/*
	int A[]={3,7,9,10},n=4,i;//,6,5,12,4,11,2},n=10,i;
	//BubbleSort(A,n);
	RecBubbleSort(A,n);
	*/
	/*
	int A[]={11,13,7,2,6,9,4,5,10,3},n=10,i;
	InsertionSort(A,n);
	
	int A[]={11,13,7,2,6,9,4,5,10,3},n=10,i;
	//SelectionSort(A,n);
	//RecInsertionSort(A,n);
	RecSelectionSort(A,n);//RecSelectionSort(A,n,0);RecSelectionSort(A,n,1);check if index change what will happen
	
	
	int A[]={11,13,7,2,6,9,4,5,10,3,INT_MAX},n=11,i;
	QuickSort(A,0,10);
	
	int A[]={11,13,7,2,6,9,4,5,10,3},n=10,i;
	IMergeSort(A,n);
	
	
	int m = 4, n = 5;
    int A[] = {1, 3, 5, 7};
    int B[] = {2, 4, 6, 8, 10};
    int c[m + n]; // allocate memory for merged array

    MergeTwoList(A, B, m, n,c);
	*/
	int A[]={11,13,7,2,6,9,24,5,10,3},n=10;
	//MergeSort(A,0,n-1);	
	//CountSort(A,n);
	//BinSort(A,n);
	RadixSort(A,n);
	//ShellSort(A,n);
	for(int i=0;i<n;i++){
		cout<<A[i]<<" ";
	}
	cout<<"\n";
	
	return 0;
	
};
