#include<iostream>
#include<cstring>
using namespace std;

struct Node{
	char data;
	struct Node *next;
}*top=NULL;

void push(char x){
	struct Node *t;
	t=new Node;
	if(t==NULL){
		cout<<"Stack is Full ";
	}
	else{
		t->data=x;
		t->next=top;
		top=t;
	}
};

char pop(){
	struct Node *t;
	char x=-1;
	if(top==NULL){
		cout<<"Stack is Empty ";
	}
	else{
		t=top;
		top=top->next;
		x=t->data;
		delete t;
	}
	return x;
};


void Display(){
	struct Node *p;
	p=top;
	while(p!=NULL){
		cout<<p->data<<" ";
		p=p->next;
	}
	cout<<endl;
};


int isBalanced(char* exp) {
    int i;
    for (i = 0; exp[i] != '\0'; i++) {
        if (exp[i] == '(') {
            push(exp[i]);
        } else if (exp[i] == ')') {
            if (top == NULL) {
                return 0;
            } else {
                pop();
            }
        }
    }
    if (top == NULL) {
        return 1;
    } else {
        return 0;
    }
};

int pre(char x){
	if(x=='+' || x=='-'){
		return 1;
	} else if(x=='*' || x=='/'){
		return 2; 
	}
	return 0;
};
int isOperand(char x){
	if(x=='+'|| x=='-' || x=='*' || x=='/'){
		return 0;
	} else{
		return 1;
	}
	
};

char *InToPost(char *infix){
	int i=0,j=0;
	char *postfix;
	long len=strlen(infix);
	postfix=new char[len+1];
	
	while(infix[i]!='\0'){
		if(isOperand(infix[i])){
			postfix[j++]=infix[i++];
		}else{
			if(pre(infix[i])>pre(top->data)){
				push(infix[i++]);
			}else{
				postfix[j++]=pop();
			}
		}
		
	}
	while(top!=NULL ){
		postfix[j++]=pop();
	}
	postfix[j]='\0';
	
	return postfix;
};

int main(){
	
	char *infix="a+b*c";
	push('#');
	char *postfix=InToPost(infix);
	cout<<"Postfix Expression : "<<postfix<<endl;
	
		
	return 0;
}
