#include<iostream>
using namespace std;
class Base
{
public:
	void fun1()
	{
		cout<<"fun1 of Base "<<endl;	
	}
};

class Derived:public Base
{
public:
	void fun2()
	{
		cout<<"fun2 of Derived "<<endl;
	}
};
class Rectangle
{
public:
	void area()
	{
		cout<<"Area of Rectangle "<<endl;
	}
};
class Cuboid:public Rectangle
{
public:
	void volume()
	{
		cout<<"Volume of cuboid "<<endl;
	}
};

class BasicCar
{
public:
	void start()
	{
		cout<<"Car started "<<endl;
	}
};

class AdvanceCar:public BasicCar
{
public:
	void playMusic()
	{
		cout<<"Music Playing "<<endl;
	}
	
};


int main()
{
	AdvanceCar a;
	//a.start();
	//a.playMusic();
	BasicCar *ptr=&a;
	ptr->start();
	//ptr->playMusic();
	BasicCar b;
	//AdvanceCar *q=&b;
	
/*	
	Derived d;
	//d.fun1();
	//d.fun2();
	Base *ptr=&d;
	ptr->fun1();
	//ptr->fun2();
	
	Base b;
	Derived *ptr=&b;
	
	
	Cuboid c;
	c.area();
	c.volume();
	Rectangle *p=&c;
	
	p->area();
	//p->volume();
	Rectangle r;
	//Cuboid *q=&r;
*/
	return 0;
}


