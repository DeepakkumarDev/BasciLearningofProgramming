#include<iostream>
using namespace std;

void fun1(int n)
{
	if(n>0)
	{
		cout<<"Recursive Function fun1 : "<<n<<endl;
		fun1(n-1);
	}
};

void fun2(int n){
	if(n>0)
	{
		fun2(n-1);
		cout<<"Refursive Function fun2 :"<<n<<endl;
	}
};

void fun3(int n)
{
	if(n>0)
	{
		cout<<"Before Recursive call : "<<n<<endl;
		fun3(n-1);
		cout<<"After Recursive call : "<<n<<endl;
	}
};

int fun4(int n)
{
	//static 
	int x=0;
	if(n>0)
	{
		x++;
		return fun4(n-1)+x;
	}
	return 0;
}

int main()
{
	fun1(5);
	fun2(6);
	fun3(5);
	cout<<"Fun4 : "<<fun4(5);
	return 0;
	
}

