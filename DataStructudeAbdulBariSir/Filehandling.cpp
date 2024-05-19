#include<iostream>
using namespace std;
#include<fstream>

int main()
{
	/*
	//writing in a file
	ofstream ofs("My.txt");
	ofs<<"John"<<endl;
	ofs<<25<<endl;
	ofs<<"cs"<<endl;
	ofs<<"MCA"<<endl;
	ofs.close();
	
	*/
	
	ifstream ifs("My.txt");
	string name;
	int roll;
	string branch;
	ifs>>name>>roll>>branch;
	ifs.close();
	cout<<"Name "<<name<<endl;
	cout<<"Roll "<<roll<<endl;
	cout<<"Branch "<<branch<<endl;
	
	return 0;
};
