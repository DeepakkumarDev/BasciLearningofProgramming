#include<iostream>
using namespace std;

class Base
{
public:
	virtual void fun1()=0;
	//{
	//	cout<<"fun1 from Base"<<endl;
	//}
	
	virtual void fun2()=0;
	
	//{
	//	cout<<"fun2 from Base "<<endl;
	//}
};

class Derived:public Base
{
public:
	void fun1()
	{
		
	}
	void fun2()
	{
		cout<<"fun2 of Derived "<<endl;
	}
	
};

int main()
{
	Derived d;
	d.fun1();
	d.fun2();
	return 0;
};




/*

class Car
{
public:
	virtual void start()=0;//{};//=0;//{cout<<"Car Started "<<endl;};
	
};

class Innova:public Car
{
public:
	void start(){cout<<"Innova Started "<<endl;};
};

class Swift:public Car
{
public:
	void start(){cout<<"Swift started "<<endl;};
};

int main()
{
	//Car c;
	Car *p=new Innova();
	p->start();
	p=new Swift();
	p->start();
	return 0;

};

*/
