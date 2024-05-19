#include<iostream>
#include<cstring>
#include<stdlib.h>
using namespace std;
int Length(char arr[])
{
	int i;
	for(i=0;arr[i]!='\0';i++)
	{
		
	}
	
	return i;
};

void changeCaseUpToLow(char s[])
{
	int i;
	for(i=0;s[i]!='\0';i++)
	{
		s[i]+=32;
	}
	cout<<s<<endl;
};

void changeCaseUpToLowToUp(char s[])
{
	int i;
	for(i=0;s[i]!='\0';i++)
	{
		if(s[i]>=65 && s[i]<=90)
		{
			s[i]+=32;
		}
		else
		{
			if(s[i]>=97 && s[i]<=122)
			{
				s[i]-=32;
			}
		}
	}
	
	cout<<s<<endl;
};

int countVowel(char s[])
{
	int i,vcount=0;
	for(i=0;s[i]!='\0';i++)
	{
		if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' ||
             s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U')
             {
             	vcount++;
			 }

	}
	return vcount;
};

int countConsonent(char s[]) {
    int vcount = 0, ccount = 0;
    for(int i = 0; s[i] != '\0'; i++) {
        if(s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u' ||
           s[i] == 'A' || s[i] == 'E' || s[i] == 'I' || s[i] == 'O' || s[i] == 'U') {
            vcount++;
        } else if((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z')) {
            ccount++;
        }
    }
    return ccount;
};

int countWords(char s[])
{
	int i ,word=1;
	if(s[0]==' ')
	{
		word=0;
	}
	for(i=0;s[i]!='\0';i++){
		if(s[i]==' ' && s[i-1]!=' ')
		{
			word++;
		}
	}
	return word;
	
};

int valid(char *name)
{
	int i;
	for(i=0;name[i]!='\0';i++)
	{
		if(!(name[i]>=65 && name[i]<=90) && !(name[i]>=97 && name[i]<=122) && !(name[i]>=48 && name[i]<=57))
		{
			return 0;
		}
		
	}
	return 1;
};

void ReverseString(char A[])
{
	int length=strlen(A);
	char *B=new char[length+1];
	int i;
	for(i=0;A[i]!='\0';i++)
	{
		
		
	}
	i-=1;
	int j;
	for(j=0;j<length;i--,j++)
	{
		B[j]=A[i];
		
	}
	B[j]='\0';
	
	printf("%s",B);
	
	delete[] B;
}

void ReverseStringInplace(char A[])
{
	char t;
	int i,j;
	for(j=0;A[j]!='\0';j++)
	{
		
	}
	j=j-1;
	for(i=0;i<j;i++,j--)
	{
		t=A[i];
		A[i]=A[j];
		A[j]=t;
	}
	printf("%s",A);
	
};

void  comparetwostring(char A[],char B[])
{
	int i,j;
	for(i=0,j=0;A[i]!='\0' && B[j]!='\0';i++,j++)
	{
		if(A[i]!=B[j])
		{
			break;
		}
		
	}
	if(A[i]==B[j]){
		printf("Equal");
		
	}
	else if(A[i]<B[j])
	{
		printf("Smaller");
	}
	else
	{
		printf("Greater ");
	}
};

std::string Palindrome(char A[])
{
	int i,j;
	for(i=0;A[i]!='\0';i++)
	{
		
	}
	i=i-1;
	for(j=0;i>=0;i--,j++)
	{
		if(A[j]!=A[i])
		{
			return " The Given String is not Palindrome";
		}
		
		
	}
	
	return "The Given String is Palindrome  ";
};
void Duplicates(char A[])
{
	int H[26]={0};
	int i;
	
	for(i=0;A[i]!='\0';i++)
	{
		H[A[i]-97]+=1;
		
	}
	for(int j=0;j<26;j++)
	{
		if(H[j]>1)
		{
			printf("%c",j+97);
			printf("%d",H[j]);
			printf("\n");
			
		}
		
	}
	
};

void DuplicatesUsingBits(char A[])
{
	long int H=0,x=0;
	for(int i=0;A[i]!='\0';i++)
	{
		x=1;
		x=x<<(A[i]-97);
		if((x&H)>0)
		{
			printf("%c is Duplicate ",A[i]);
		}
		else
		{
			H=x|H;
		}
	}
};
void CheckAnagram(char A[],char B[])
{
	int i,j,H[26]={0};
	for(i=0;A[i]!='\0';i++)
	{
		H[A[i]-97]+=1;
	}
	
	for(j=0;B[j]!='\0';j++)
	{
		H[B[j]-97]-=1;
		if(H[B[j]-97]<0)
		{
			printf("Not an Anagram ");
			break;
		}
	}
	for (i = 0; A[i] != '\0'; i++) 
	{
        if (H[A[i] - 'a'] != 0) 
		{
            printf("Not an Anagram ");
            break;
        }
    }
    
	if(A[i]=='\0')
	{
		printf("it is anagram");
	}

};

void Permutation(char S[],int k)
{
	static int A[10]={0};
	static char Res[10];
	int i;
	

	if(S[k]=='\0')
	{
		Res[k]='\0';
		printf("%s\n",Res);
	}
	else
	{
		
		for(i=0;S[i]!='\0';i++)
		{
			if(A[i]==0)
			{
				Res[k]=S[i];
				A[i]=1;
				Permutation(S,k+1);
				A[i]=0;
			}
		}
	}
	
};

void Perm(char S[],int l,int h)
{
	//int i;
	//char temp;
	if(l==h)
	{
		printf("%s\n",S);
		
	}
	else
	{
		
		for(int i=l;i<=h;i++)
		{
			char temp=S[l];
			S[l]=S[i];
			S[i]=temp;
			//swap(S[l],S[i]);
			Perm(S,l+1,h);
			temp=S[l];
			S[l]=S[i];
			S[i]=temp;			
			//swap(S[l],S[i]);
		}
	}

}

int main(){
	
	char s[]="ABC";
	int len=strlen(s);
	Perm(s,0,len-1);
	//Permutation(s,0);	
	//char A[]="decimal";
	//char B[]="medical";
//	char A[] = "verbose";//"listen";
  //  char B[] = "observe";//"silent";
//	CheckAnagram(A,B);
	//char s[]="finding";
	//DuplicatesUsingBits(s);
	//Duplicates(s);
	/*
	char s[]="Hello World ";
	//cout<<"Length is : "<<Length(s)<<endl;
	//changeCaseUpToLow(s);
	//cout<<'A'+0<<endl;
	//char arr[]="welCOmE";
	//changeCaseUpToLowToUp(arr);
	
	cout<<"countVowel: "<<countVowel(s)<<endl;
	cout<<"countConsonent : "<<countConsonent(s)<<endl;
	cout<<"countWords : "<<countWords(s)<<endl;
	cout<<"valid : "<<valid(s)<<endl;
	//cout<<" ReverseString : "<<endl;
	//ReverseString(s);
	cout<<" ReverseStringInplace : "<<endl;
	ReverseStringInplace(s);
	
	char A[]="painting";
	char B[]="paintin";
	//int x=Palindrome(A,B);
	cout<<"comparetwostring : "<<endl;
	comparetwostring(A,B);
	cout<<endl;
	cout<<"Palindrome : "<<endl;
	cout<<Palindrome("KIK")<<endl;
	*/
	return 0;
};
