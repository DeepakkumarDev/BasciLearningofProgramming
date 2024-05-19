//#include<iostream>
#include<stdio.h>
#include<stdlib.h>
//using namespace std;
/*
struct Array{
	int *A;
	int size;
	int length;
};
void Display(struct Array arr){
	int i;
	printf("\nElements are\n");
	for(i=0;i<arr.length;i++){
		printf("%d ",arr.A[i]);
	}
}
int main(){
	struct Array arr;
	int n,i;
	printf("Ente the Size of an array : ");
	scanf("%d",&arr.size);
	arr.A=(int *)malloc(arr.size*sizeof(int));
	arr.length=0;
	printf("Enter number of Numbers : ");
	scanf("%d",&n);
	printf("Enter all elements\n");
	
	for(i=0;i<n;i++){
		scanf("%d",&arr.A[i]);
	}
	arr.length=n;
	
	Display(arr);
	
	
	
	
	
	return 0;
	
}
*/
struct Array{

	int A[10];
	int size;
	int length;
};
void Display(struct Array arr){
	int i;
	printf("\nElements are\n");
	for(i=0;i<arr.length;i++){
		printf("%d ",arr.A[i]);
	}
};
void Append(struct Array *arr,int x){
	if(arr->length<arr->size){
		arr->A[arr->length++]=x;
	}
};
void Insert(struct Array *arr,int index,int x){
	int i;
	if(index>=0 && index<=arr->length){
		for(i=arr->length;i>index;i--){
			arr->A[i]=arr->A[i-1];
		}
		arr->A[index]=x;
		arr->length++;
	}
};
int Delete(struct Array *arr,int index){
	int x=0;
	int i;
	if(index>=0 && index<arr->length){
		x=arr->A[index];
		for(i=index;i<arr->length-1;i++){
			arr->A[i]=arr->A[i+1];
		}
		arr->length--;
		return x;
	}
	return 0;
};
void swap(int *x,int *y){
	int temp;
	temp=*x;
	*x=*y;
	*y=temp;
};
int LinearSearch(struct Array arr,int key){
	int i;
	for(i=0;i<arr.length;i++){
		if(key==arr.A[i]){
			return i;
		}
	}
	return -1;
};
int ImprovedLinearSearch(struct Array *arr,int key){
	int i;
	for(i=0;i<arr->length;i++){
		if(key==arr->A[i]){
			//swap(&arr->A[i],&arr->A[i-1]);//This is called transposition
			swap(&arr->A[i],&arr->A[0]);//Move to front/Head
			return i;
		}
	}
	return -1;
};
int BinarySearch(struct Array arr,int key){
	int l,mid ,h;
	l=0;
	h=arr.length-1;
	while(l<=h){
		mid=(l+h)/2;
		if(key==arr.A[mid]){
			return mid;
		}
		else if(key<arr.A[mid]){
			h=mid-1;
		}
		else {
			l=mid+1;
		}
	}
	return -1;
};
int RecBinarySearch(int a[],int l,int h,int key){
	int mid;
	if(l<=h){
		mid=(l+h)/2;
		if(key==a[mid]){
			return mid;
		}
		else if(key<a[mid]){
			return RecBinarySearch(a,l,mid-1,key);
		}
		else {
			return RecBinarySearch(a,mid+1,h,key);
		}
	}
	return -1;
};

int Get(struct Array arr, int index){
	if(index>=0 && index<arr.length){
		
		return arr.A[index];
	}
	
	return -1;
};

void Set(struct Array *arr,int index,int x){
	if(index>=0 && index<arr->length){
		arr->A[index]=x;
	}
	
	
};
int Max(struct Array arr ){
	int max=arr.A[0];
	for(int i=0;i<arr.length;i++){
		if(arr.A[i]>max){
			max=arr.A[i];
		}
	}
	return max;
};

int Min(struct Array arr){
	int min=arr.A[0];
	for(int i=0;i<arr.length;i++){
		if(arr.A[i]<min){
			min=arr.A[i];
		}
	}
	return min;
};

int Sum(struct Array arr){
	int total=0;
	for(int i=0;i<arr.length;i++){
		total+=arr.A[i];
	}
	return total;
	
};

int RecSum(struct Array arr,int n){
	
	if(n<0){
		return 0;
	}else{
		return RecSum(arr,n-1)+arr.A[n];
	}
};
float Avg(struct Array arr){
	int total=0;
	for(int i=0;i<arr.length;i++){
		total=total+arr.A[i];
	}
	return (float) total/2;
};

void Reverse(struct Array *arr){
	int * B;
	int i,j;
	B=(int *)malloc(arr->length*sizeof(int));
	for(i=arr->length-1,j=0;i>=0;i--,j++){
		B[j]=arr->A[i];
	}
	for(i=0;i<arr->length;i++){
		arr->A[i]=B[i];
	}
	
};
void Reverse2(struct Array *arr){
	int i,j,temp;
	for(i=0,j=arr->length-1;i<j;i++,j--){
		temp=arr->A[i];
		arr->A[i]=arr->A[j];
		arr->A[j]=temp;
		
	}
};
void LeftShift(struct Array *arr){
	int i;
	for(i=0;i<arr->length-1;i++){
		arr->A[i]=arr->A[i+1];
		
	}
	arr->A[arr->length-1]=0;
	
};
void LeftRotate(struct Array *arr){
	int i;
	int temp=arr->A[0];
	for(i=0;i<arr->length-1;i++){
		arr->A[i]=arr->A[i+1];
	}
	arr->A[arr->length-1]=temp;
	
};
void RightShift(struct Array *arr){
	int i;
	for(i=arr->length-1;i>=0;i--){
		
		arr->A[i]=arr->A[i-1];
			
	}
	arr->A[0]=0;
	
};
void RightRotate(struct Array *arr){
	int i;
	int temp=arr->A[arr->length-1];
	for(i=arr->length-1;i>=0;i--){
		
		arr->A[i]=arr->A[i-1];
			
	}
	arr->A[0]=temp;
};
int main(){
	struct Array arr={{2,3,4,5,6},10,5};
	//Append(&arr,10);
	//Insert(&arr,2,10);
	//printf("%d\n",Delete(&arr,0));
	Display(arr);
	
	//Reverse2(&arr);
	//LeftShift(&arr);
	//LeftRotate(&arr);
	//RightShift(&arr);
	RightRotate(&arr);
	
	
	/*
	printf("Get Function : ");
	printf("%d\n",Get(arr,0));
	printf("\nSet Function");
	Set(&arr,0,15);
	Display(arr);
	//printf("%d\n",Set(&arr,0,15));
	printf("\nMax Function : ");
	printf("%d\n",Max(arr));
	printf("\nMin Function : ");
	printf("%d\n",Min(arr));
	printf("\nSum Function : ");
	printf("%d\n",Sum(arr));
	
	printf("\nRecSum function :");
	printf("%d\n",RecSum(arr,arr.length));
	printf("\nAverage Function : ");
	printf("%f\n",Avg(arr));
	
	
	//printf("\n%d\n",LinearSearch(arr,4));
	//printf("\n%d\n",ImprovedLinearSearch(&arr,5));
	//printf("RecBinarySearch result : ");
	//printf("%d",RecBinarySearch(arr.A,0,arr.length,5));
	//printf("\n%d\n",BinarySearch(arr,522));
	*/
	Display(arr);
	
	
	
	
	
	return 0;
	
};
