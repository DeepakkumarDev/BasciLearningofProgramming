/*
#include <iostream>
#include <stdio.h>
using namespace std;
class Node {
public:
  int data;
  Node *next;

} *first = nullptr;
void create(int A[], int n) {
  int i;
  Node *t, *last;
  first = new Node;
  first->data = A[0];
  first->next = nullptr;
  last = first;
  for (i = 1; i < n; i++) {
    t = new Node;
    t->data = A[i];
    t->next = NULL;
    last->next = t;
    last = t;
  }
}
void Display(Node *p) {
  while (p != NULL) {
    cout << p->data << endl;
    p = p->next;
  }
}
int main() {
  int A[] = {3, 5, 7, 10, 15};
  create(A, 5);
  Display(first);
  return 0;
}
*/

#include <cstddef>
#include <iostream>
#include <stdlib.h>
//#include <iostream>
#include <climits> // for -2147483648
#include <cstdlib> // for malloc and NULL
//#include <cstddef>  // for nullptr
// using namespace std;
using namespace std;

struct Node {
  int data;
  struct Node *next;
} *first = NULL, *second = NULL, *third = NULL;
// struct Node *first = nullptr;
//*first = nullptr;
//  Node *first; //= new Node;
//  first = nullptr;
void create(int A[], int n) {
  int i;
  struct Node *t, *last;
  first = (struct Node *)malloc(sizeof(struct Node));
  first->data = A[0];
  first->next = NULL;
  last = first;

  for (i = 1; i < n; i++) {
    t = (struct Node *)malloc(sizeof(struct Node));
    t->data = A[i];
    t->next = NULL;
    last->next = t;
    last = t;
  }
}
void create2(int A[], int n) {
  int i;
  struct Node *t, *last;
  second = (struct Node *)malloc(sizeof(struct Node));
  second->data = A[0];
  second->next = NULL;
  last = second;

  for (i = 1; i < n; i++) {
    t = (struct Node *)malloc(sizeof(struct Node));
    t->data = A[i];
    t->next = NULL;
    last->next = t;
    last = t;
  }
}
void Display(struct Node *p) {
  while (p != NULL) {
    cout << p->data << " ";
    p = p->next;
  }
}
void RDisplay(struct Node *p) {
  if (p != NULL) {
    cout << p->data << endl;
    RDisplay(p->next);
  }
}
void LDisplay(struct Node *p) {
  if (p != NULL) {
    LDisplay(p->next);
    cout << p->data << endl;
  }
}
int Count(struct Node *p) {
  int count = 0;
  while (p != NULL) {
    count++;
    p = p->next;
  }
  return count;
}
int RCount(struct Node *p) {

  if (p == NULL)
    return 0;
  return 1 + RCount(p->next);
}
int RICount(struct Node *p) {
  int count = 0;
  if (p) {
    count = RICount(p->next);
    return count + 1;
  } else {
    return count;
  }
}
int Add(struct Node *p) {
  int sum = 0;
  while (p != NULL) {
    sum += p->data;
    p = p->next;
  }
  return sum;
}
int RAdd(struct Node *p) {
  if (p == NULL)
    return 0;
  else
    return RAdd(p->next) + p->data;
}
int Max(struct Node *p) {
  int max = -2147483648; //-2147483648;
  while (p) {
    if (p->data > max)
      max = p->data;
    p = p->next;
  }
  return max;
}
int RMax(struct Node *p) {
  int x = 0;
  if (p == NULL)
    return -2147483648; //-2147483648;
  else
    x = RMax(p->next);
  if (x > p->data)
    return x;
  return p->data;
}
int RMaxUni(struct Node *p) {
  int x = 0;
  if (p == NULL)
    return -2147483648;
  x = RMaxUni(p->next);
  return x > p->data ? x : p->data;
}
Node *searchLinear(struct Node *p, int key) {
  while (p != NULL) {
    if (key == p->data)
      return p;
    p = p->next;
  }
  return NULL;
};
Node *recSearch(struct Node *p, int key) {
  if (p == NULL) {
    return NULL;
  }
  if (key == p->data) {
    return p;
  }
  return recSearch(p->next, key);
};
struct Node *improvedLinearSearch(struct Node *p, int key) {
  struct Node *q = NULL;
  while (p != NULL) {
    // q=p;
    if (key == p->data) {
      q->next = p->next;
      p->next = first;
      first = p;
    }
    q = p;
    p = p->next;
  }
  return NULL;
};
void Insert(struct Node *p, int index, int x) {
  Node *t;
  if (index < 0 || index > Count(p)) {
    return;
  }
  t = new Node;
  t->data = x;
  if (index == 0) {
    t->next = first;
    first = t;
  } else {
    for (int i = 0; i < index - 1; i++) {
      p = p->next;
    }
    t->next = p->next;
    p->next = t;
  }
};
void insertLast(int x) {
  struct Node *t = new Node;
  struct Node *last = NULL;
  t->data = x;
  t->next = NULL;
  if (first == NULL) {
    first = last = t;
  } else {
    last->next = t;
    last = t;
  }
};
void sortedInsert(struct Node *p, int x) {
  struct Node *t, *q = NULL;
  t = new Node;
  t->data = x;
  t->next = NULL;
  if (first == NULL) {
    first = t;
  } else {
    while (p && p->data < x) {
      q = p;
      p = p->next;
    }
    if (p == first) {
      t->next = first;
      first = t;
    } else {
      t->next = q->next;
      q->next = t;
    }
  }
};
int deleteNode(struct Node *p, int index) {
  struct Node *q;
  int x = -1;
  if (index < 1 || index > Count(p)) {
    return -1;
  }
  if (index == 1) {
    q = first;
    x = first->data;
    first = first->next;
    delete q;
    return x;
  } else {
    for (int i = 0; i < index - 1; i++) {
      q = p;
      p = p->next;
    }
    p->next = p->next;
    x = p->data;
    delete p;
    return x;
  }
};
int isSorted(struct Node *p) {
  int x = -65536;
  while (p != NULL) {
    if (p->data < x) {
      return 0;
    } else {
      x = p->data;
      p = p->next;
    }
  }
  return 1;
};
void removeDuplicate(struct Node *p) {
  struct Node *q = p->next;
  while (q != NULL) {
    if (p->data != q->data) {
      p = q;
      q = q->next;
    } else {
      p->next = q->next;
      delete q;
      q = p->next;
    }
  }
};
void Reverse1(struct Node *p) {
  int *A, i = 0;
  struct Node *q = p;

  A = new int[Count(first)];
  while (q != NULL) {
    A[i] = q->data;
    q = q->next;
    i++;
  }
  q = p;
  i--;
  while (q != NULL) {
    q->data = A[i];
    q = q->next;
    i--;
  }
};
void Reverse2(struct Node *p) {
  struct Node *q = NULL, *r = NULL;
  while (p != NULL) {
    r = q;
    q = p;
    p = p->next;
    q->next = r;
  }
  first = q;
};
void Reverse3(struct Node *q, struct Node *p) {
  if (p) {
    Reverse3(p, p->next);
    p->next = q;
  } else {
    first = q;
  }
};
void Concat(struct Node *p, struct Node *q) {
  third = p;
  while (p->next != NULL) {
    p = p->next;
  }
  p->next = q;
}
void Merge(struct Node *p, struct Node *q) {
  struct Node *last;
  if (p->data < q->data) {
    third = last = p;
    p = p->next;
    third->next = NULL;
  } else {
    third = last = q;
    q = q->next;
    third->next = NULL;
  }
  while (p && q) {
    if (p->data < q->data) {
      last->next = p;
      last = p;
      p = p->next;
      last->next = NULL;
    } else {
      last->next = q;
      last = q;
      q = q->next;
      last->next = NULL;
    }
  }
  if (p)
    last->next = p;
  if (q)
    last->next = q;
};

int isLoop(struct Node *f) {
  struct Node *p, *q;
  p = q = f;
  do {
    p = p->next;
    q = q->next;
    q = q ? q->next : q;
  } while (p && q && p != q);
  if (p == q) {
    return 1;
  } else {
    return 0;
  }
}
int main() {

  struct Node *t1, *t2;
  int A[] = {10, 20, 30, 40, 50};
  create(A, 5);
  t1 = first->next->next;
  t2 = first->next->next->next->next;
  t2->next = t1;
  cout << "Is Loop : " << isLoop(first) << endl;

  /*
  int A[] = {10, 20, 20, 20, 20, 30, 40, 50};
  // int B[] = {1, 2, 3, 4, 5};
  int B[] = {52, 115, 252, 352, 452};
  create(A, 8);
  create2(B, 5);

  Display(first);
  cout << endl;
  Display(second);
  cout << endl;
  Merge(first, second);
  Display(third);


    // Concat(first, second);
    // Display(third);
    Concat(second, first);
    cout << endl;
    Display(third);


    // Reverse2(first);
    Reverse3(NULL, first);
    cout << endl;
    Display(first);

   removeDuplicate(first);
   cout << endl;
   Display(first);

   cout << "IsSorted : " << isSorted(first) << endl;
   if (isSorted(first)) {
     cout << "Sorted" << endl;
   } else {
     cout << "Not Sorted " << endl;
   }
   deleteNode(first, 1);
   cout << endl;
   Display(first);


   Display(first);
   cout << endl;
   sortedInsert(first, 35);
   Display(first);


   // Insert(first,1,10);
   Insert(first, 0, 10);
   Insert(first, 1, 20);
   Insert(first, 2, 30);
   Insert(first, 0, 5);
   Display(first);



   int A[]={3,5,7};
   create(A,3);
   Insert(first,0,10);
   Display(first);
   */

  /*
  // Node *first;
  // first = NULL;
  struct Node * temp;
  int A[] = {3,5,7,10,25,8,32,2};
  int n = sizeof(A) / sizeof(A[0]);
  create(A, n);
  Display(first);
  cout<<endl;
  struct Node *Linear;
  Linear=searchLinear(first,25);
  if(Linear){
    cout<<"Key is found "<<Linear->data<<endl;
  }else{
    cout<<"Key is Not found"<<endl;
  }

  temp=improvedLinearSearch(first,2);
  temp=improvedLinearSearch(first,2);
  if(temp){
    cout<<"Key is found : "<<temp->data<<endl;
  }
  else{
    cout<<"Key not found \n";
  }
  Display(first);
  cout<<"Search :  "<<searchLinear(first,2)<<"\n"<<" Recursive Search :
  "<<recSearch(first,2)<<endl;

  //cout<<" After improved Linear Search :
  "<<searchLinear(temp,2)->data<<endl;
*/

  /*
    cout << "RDisplay" << endl;
    RDisplay(first);
    cout << "LDisplay" << endl;
    LDisplay(first);
    cout << "Count Function : " << endl;

    cout << "count : " << Count(first) << "\n"
         << " RCount : " << RCount(first) << "\n"
         << " RICount : " << RICount(first) << "\n"
         << "Add :" << Add(first) << "\n"
         << " RAdd : " << RAdd(first) << " \n"
         << " Max : " << Max(first) << "\n"
         << " RMAx : " << RMax(first) << " \n"
         << "RMaxUni : " << RMaxUni(first) << endl;
  */

  return 0;
}

