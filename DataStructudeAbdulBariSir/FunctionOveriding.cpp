#include<iostream>
using namespace std;
class Base
{
public:
	void display()
	{
		cout<<"Display of Base "<<endl;
	}
};

class Derived:public Base
{
public:
	void display(int x)//void display()
	{
		cout<<"Display of Derived "<<endl;
	}
	
	
};
int main()
{
	Derived d;
	//d.display();//this is function overriding
	d.Base::display();//This is function overloading
	d.display(10);
	return 0;
}
