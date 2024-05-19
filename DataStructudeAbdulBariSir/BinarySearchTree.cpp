#include<stdio.h>
#include<stdlib.h>
#include<iostream>
#include "Stack.h"
using namespace std;

struct Node{
	struct Node *lchild;
	int data;
	struct Node *rchild;
}*root=NULL;

void Insert(int key){
	struct Node *t=root;
	struct Node *r=NULL,*p;

	if(root==NULL)
	{
		p=(struct Node *)malloc(sizeof(struct Node));
		p->data=key;
		p->lchild=p->rchild=NULL;
		root=p;
		return ;
	}
	while(t!=NULL)
	{
		r=t;
		if(key<t->data)
		{
			t=t->lchild;
			
		}
		else if(key>t->data)
		{
			t=t->rchild;
		}
		else
		{
			return ;
		}
		
		
	}
	p=(struct Node *)malloc(sizeof(struct Node));
	p->data=key;
	p->lchild=p->rchild=NULL;
	
	
	if(key<r->data){
		r->lchild=p;
	}
	else
	{
		r->rchild=p;
	}
};

void Inorder(struct Node *p){
	if(p)
	{
		Inorder(p->lchild);
		printf("%d ",p->data);
		Inorder(p->rchild);
	}
};


struct Node * Search(int key)
{
	struct Node *t=root;
	while(t!=NULL){
		if(key==t->data)
		{
			return t;
		}
		else if(key<t->data)
		{
			t=t->lchild;
		}
		else
		{
			t=t->rchild;
		}
	}
	
	return NULL;
};

struct Node *RInsert(struct Node *p,int key)
{
	struct Node *t=NULL;
	if(p==NULL)
	{
		t=(struct Node *)malloc(sizeof(struct Node));
		t->data=key;
		t->lchild=t->rchild=NULL;
		return t;
	}
	if(key<p->data)
	{
		p->lchild=RInsert(p->lchild,key);
	}
	else if(key>p->data)
	{
		p->rchild=RInsert(p->rchild,key);
	}
	
	return p;
};

int Height(struct Node *p)
{
	int x,y;
	if(p==NULL)
	{
		return 0;
	}
	x=Height(p->lchild);
	y=Height(p->rchild);
	return x>y?x+1:y+1;
}

struct Node *InPre(struct Node *p)
{
	while(p && p->rchild!=NULL)
	{
		p=p->rchild;
	}
	return p;
}

struct Node *InSucc(struct Node *p)
{
	while(p && p->lchild!=NULL)
	{
		p=p->lchild;
		
	}
	return p;
}


struct Node *Delete(struct Node *p,int key)
{
	struct Node *q;
	if(p==NULL)
	{
		return NULL;
	}
	if(p->lchild==NULL && p->rchild==NULL)
	{
		if(p==root)
		{
			root=NULL;
		}
		free(p);
		return NULL;
	}
	if(key<p->data)
	{
		p->lchild=Delete(p->lchild,key);
	}
	else if(key>p->data)
	{
		p->rchild=Delete(p->rchild,key);
	}
	else
	{
		if(Height(p->lchild)>Height(p->rchild))
		{
			q=InPre(p->lchild);
			p->data=q->data;
			p->lchild=Delete(p->lchild,q->data);
		}
		else
		{
			q=InSucc(p->rchild);
			p->data=q->data;
			p->rchild=Delete(p->rchild,q->data);
		}
	}
	return p;
};

void createPre(int pre[],int n)
{
	struct Node *p;
	struct Stack stk;
	struct Node *t;
	int i=0;
	
	root=new Node;
	root->data=pre[i++];
	root->lchild=root->rchild=NULL;
	p=root;
	create(&stk);
    push(&stk, INT_MAX);
	while(i<n)
	{
		if(pre[i]<p->data)
		{
			t=new Node;
			t->data=pre[i++];
			t->lchild=t->rchild=NULL;
			p->lchild=t;
			push(&stk,p->data);
			p=t;
		}
		else
		{
			if(pre[i]>p->data && (isEmpty(&stk) || pre[i] <StackTop(&stk)))
			{
				t=new Node;
				t->data=pre[i];
				t->lchild=t->rchild=NULL;
				p->rchild=t;
				p=t;
				
			}
			else
			{
				p=Search(pop(&stk));
			}
		}
	}

};

int main(){
	
	struct Node *temp;
	/*
	root=RInsert(root,10);
	RInsert(root,5);
	RInsert(root,20);
	RInsert(root,8);
	RInsert(root,30);
	
	//Insert(30);
	//Insert(60);
	//Insert(50);
	//Insert(15);
	//Insert(20);
	//Insert(40);
	//Insert(10);
	
	//Delete(root,10);
	*/
	int pre[] = {30, 20, 10, 15, 25, 40, 50, 45};
    int n = sizeof(pre) / sizeof(pre[0]);

    createPre(pre, n);
	Inorder(root);
	printf("\n");
	
	temp=Search(120);
	if(temp!=NULL)
	{
		printf("Element %d is Found\n",temp->data);
	}
	else
	{
		printf("Element is not Found ");
	}
	//printf("%d ",temp->data);
		
	return 0;
}