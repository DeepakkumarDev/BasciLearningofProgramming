#include<iostream>
using namespace std;

/*
lc1
class Rectangle
{
	public:
		int length;
		int breadth;
		
		int area()
		{
			return length*breadth;
			
		}
		int perimeter()
		{
			return 2*(length+breadth);
		}
};
int main()
{
	//Objected created in Heap
	//Rectangle r1;
	//Rectangle *ptr;
	//ptr=&r1;
	Rectangle *ptr=new Rectangle();//Dyanamic object Created in Heap
	ptr->length=10;
	ptr->breadth=5;
	
	cout<<ptr->area()<<endl;
	cout<<ptr->perimeter()<<endl;
	
	
	//objected created in stack 
	Rectangle r1,r2;
	r1.length=10;
	r1.breadth=3;
	int a=r1.area();
	cout<<"Area of rectangle : "<<a<<endl;
	cout
	<<"Perimeter of rectangle : "<<r1.perimeter()<<endl;
	cout<<"Hello tndroduction to OOPS world "<<endl;
	
	return 0;
}
*/

/*
class Rectangle
{
private :
	int length;
	int breadth;
public:

	Rectangle()
	{
		length=1;
		breadth=1;
	}

	Rectangle(int l=1,int b=1)
	{
		setLength(l);
		setBreadth(b);
	}
	
	Rectangle(Rectangle &r)
	{
		length=r.getLength();
		breadth=r.getBreadth();
	}
	
	void setLength(int length)
	{
		if(length<0)
		{
			this->length=0;
		}
		else
		{
			this->length=length;
		}
	}
	void setBreadth(int breadth)
	{
		if(breadth<0)
		{
			this->breadth=0;
		}
		else
		{
			this->breadth=breadth;
		}
	}
	
	int getLength()
	{
		return this->length;
		
	}
	int getBreadth()
	{
		return this->breadth;
	}
	
	int area()
	{
		return length*breadth;
	}
	
	int perimeter()
	{
		return 2*(length+breadth);
	}
};

int main()
{
	//Rectangle r1;
	//r1.setLength(10);
	//r1.setBreadth(5);
	//Rectangle r1(10,5);
	Rectangle r1;
	Rectangle r2(r1);
	
	cout<<"Area of r2 : "<<r2.area()<<endl;
	cout<<r1.area()<<endl;
	cout<<r1.perimeter()<<endl;
	
	return 0;
};


class Rectangle
{
private :
	int length;
	int breadth;
public:
	Rectangle(); //Constructor
	Rectangle(int l,int b); //Constructor
	Rectangle(Rectangle &r); //Constructor
	int getLength(){return length;}; //Accessor
	int getBreadth(){return breadth;};  //Accessor
	void setLength(int l); //Mutator
	void setBreadth(int b); //Mutator
	int area(); //Faciliators
	int perimeter(); //Faciliators
	bool isSquare(); //Enquiry
	~ Rectangle(); //Destructor
};
int main()
{
	Rectangle r1(10,10);
	cout<<"Area "<<r1.area()<<endl;
	if(r1.isSquare())
		cout<<"Yes"<<endl;
	return 0;
}


Rectangle::Rectangle()
{
	length=1;
	breadth=1;
}


Rectangle::Rectangle(int l,int b)
{
	length=l;
	breadth=b;
};


Rectangle::Rectangle(Rectangle &r)
{
	length=r.length;
	breadth=r.breadth;
}
void Rectangle::setLength(int l)
{
	if(l>=0)
	{
		length=l;
	}
	else
	{
		length=1;
	}
};
void Rectangle::setBreadth(int b)
{
	if(b>=0)
	{
		breadth=b;
	}
	else
	{
		b=0;
	}
}



int Rectangle::area()
{
	return length*breadth;
}
int Rectangle::perimeter()
{
	return 2*(length+breadth);
};
bool Rectangle::isSquare()
{
	return length==breadth;
}

Rectangle::~Rectangle()
{
	cout<<"Rectangle Destoryed ";
}



//Operator Overloading
class Complex
{
public:
	int real;
	int img;
	
	Complex(int real=0,int img=0)
	{
		this->real=real;
		this->img=img;
	}
	//Complex add(Complex c)
	Complex operator+(Complex c)
	{
		Complex temp;
		temp.real=real+c.real;
		temp.img=img+c.img;
		return temp;
	}
};
int main()
{
	Complex c1(1,2);
	Complex c2(2,3);
	Complex c3;
	//c3=c1.add(c2);
	c3=c1+c2;
	cout<<c3.real<<"+i"<<c3.img<<endl;
	
	return 0;
};




class Complex
{
private:
	int real;
	int img;
public:
	Complex(){
		this->real=0;
		this->img=0;
	};
	Complex(int real=0,int img=0)
	{
		this->real=real;
		this->img=img;
	};
	void setReal(int real){this->real=real;};
	void setImg(int img){this->img=img;};
	int getReal(){return this->real;};
	int getImg(){return this->img;};
	void Display(){
		cout<<this->real<<"+i"<<this->img<<endl;
	};
	friend Complex operator+(Complex c1,Complex c2);
	
};
int main()
{
	//Complex c1,c2,c3;
	Complex c1(2,3);
	Complex c2(3,4);
	Complex c3=c1+c2;
	c3.Display();
	cout<<c3.getReal()<<"+i"<<c3.getImg()<<endl;
	return 0;
}



Complex operator+(Complex c1,Complex c2)
{
	Complex temp(0,0);
	temp.real=c1.getReal()+c2.getReal();
	temp.img=c1.getImg()+c2.getImg();
	return temp;
}



class Complex
{
public:
	int real;
	int img;
public:
	Complex(int r=0,int i=0)
	{
		real=r;
		img=i;
	}
	void display()
	{
		cout<<real<<"+i"<<img<<endl;
	}
	
	friend ostream & operator<<(ostream &out,Complex &c);//friend void & operator<<(ostream &out,Complex &c);
	
};

ostream & operator<<(ostream &out,Complex &c)//void operator<<(ostream &out,Complex &c)
{
	out<<c.real<<"+i"<<c.img<<endl;
	return out;//return out
}
int main()
{
	Complex c(10,5);
	cout<<c<<endl;
	operator<<(cout,c);
	//c.display();
}





class Rational
{
private:
	int p;
	int q;
public:
	Rational()
	{
		p=1;
		q=1;
	}
	Rational(int p,int q)
	{
		this->p=p;
		this->q=q;
	}
	
	Rational(Rational &r)
	{
		this->p=r.p;
		this->q=r.q;
	}
	
	int getP(){ return p;};
	
	int getQ(){return q;};

	void setP(int p)
	{
		this->p=p;
	}
	
	void setQ(int q)
	{
		this->q=q;
	}

	Rational operator+(Rational r)
	{
		Rational t;
		t.p=this->p*r.q+this->q*r.p;
		t.q=this->q*r.q;
		return t;
	}
	friend ostream & operator<<(ostream &os,Rational &r);
};

ostream & operator<<(ostream &os,Rational &r)
{
	os<<r.p<<"/"<<r.q;
	return os;
}


int main()
{
	Rational r1(3,4),r2(2,5),r3;
	r3=r1+r2;
	cout<<r3<<endl;
	cout<<" r1 : "<<r1<<" r2 : "<<r2<<" r3 : "<<r3<<endl;
	return 0;
};

*/



