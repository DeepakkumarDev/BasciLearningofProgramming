#include<iostream>
using namespace std;
class BasicCar
{
public:
	virtual void start()
	{
		cout<<"BasicCar started"<<endl;
	}	
};

class AdvanceCar: public BasicCar
{
public:
	void start()
	{
		cout<<"AdvanceCar Started "<<endl;
	}
};

int main()
{
	//BasicCar *p=new AdvanceCar();
	AdvanceCar ad;
	BasicCar *p=&ad;
	p->start();
	ad.start();
	return 0;
}


/*
class BasicCar
{
public:
void start()
{
	cout<<"BasicCar started"<<endl;
}	
};

class AdvanceCar: public BasicCar
{
public:
	void start()
	{
		cout<<"AdvanceCar Started "<<endl;
	}
};

int main()
{
	//BasicCar *p=new AdvanceCar();
	AdvanceCar ad;
	BasicCar *p=&ad;
	p->start();
	ad.start();
	return 0;
}


*/


/*
class Base
{
public:
	virtual void fun()
	{
		cout<<"fun of Base"<<endl;
	}
};

class Derived:public Base
{
public:
	void fun()
	{
		cout<<"fun of Derived "<<endl;
	}
};

int main()
{
	Base *ptr=new Derived();
	ptr->fun();
	return 0;
}
*/

/*
class Base
{
public:
	void fun()
	{
		cout<<"fun of Base"<<endl;
	}
};

class Derived:public Base
{
public:
	void fun()
	{
		cout<<"fun of Derived "<<endl;
	}
};

int main()
{
	//Base *ptr=new Derived();
	Derived d;
	Base *ptr=&d;
	ptr->fun();
	return 0;
}

*/
