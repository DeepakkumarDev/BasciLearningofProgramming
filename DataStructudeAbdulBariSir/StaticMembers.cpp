#include<iostream>
using namespace std;

class Student
{
public:
	int roll;
	string name;
	static int addNo;
	Student(string n)
	{
		addNo++;
		roll=addNo;
		name=n;
	}
	void display()
	{
		cout<<"Name "<<name<<endl<<"Roll "<<roll<<endl;
	}
};

int Student::addNo=0;

int main()
{
	Student s1("John");
	Student s2("Ravi");
	Student s3("Khan");
	s1.display();
	s3.display();
	cout<<"Number Admission "<<Student::addNo<<endl;

};


/*

class Innova
{
public:
	static int price;
	static int getPrice()
	{
		return price;
	}
};
int Innova::price=20;

int main()
{
	Innova i1,i2,i3;
	cout<<i1.price<<endl;
	cout<<i3.price<<endl;
	
	cout<<Innova::price<<endl;
	return 0;
}





class Test
{
public:
	int a;
	static int count;
	Test()
	{
		a=10;
		count++;
	}
	
	static int getCount()
	{
		//a++;
		count++;
	}
};
int Test::count=0;
int main()
{
	Test t1,t2;
	//cout<<t1.count<<endl;
	//cout<<t2.count<<endl;
	//t1.count=25;
	//cout<<t2.count<<endl;
	//cout<<Test::count<<endl;
	
	cout<<Test::getCount()<<endl;
	cout<<t1.getCount()<<endl;
	
	
	
	return 0;
}

*/
