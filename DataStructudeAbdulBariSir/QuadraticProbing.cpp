#include<iostream>
#include<stdio.h>
using namespace std;

#define SIZE 10

int hash(int key){
	return key%SIZE;
};
int probe(int H[],int key){
	int index=hash(key);
	int i=0;
	while(H[(index+i*i)%SIZE]!=0){
		i++;
		
	}
	return (index+i*i)%SIZE;
	
};
void Insert(int H[],int key){
	int index=hash(key);
	if(H[index]!=0){
		index=probe(H,key);
	}
	H[index]=key;
};

int Search(int H[],int key){
	int index=hash(key);
	int i=0;
	while(H[(index+i*i)%SIZE]!=key){
		i++;
	}
	return (index+i*i)%SIZE;
}

int main(){
	int HT[10]={0};
	Insert(HT,23);
	Insert(HT,43);
	Insert(HT,13);
	Insert(HT,27);
	cout<<"\nKey Found at : "<<Search(HT,13)<<endl;
	return 0;
}

