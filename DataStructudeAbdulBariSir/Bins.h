#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

// Function to insert a node at the beginning of a linked list
Node* Insert(Node* head, int key) {
    Node* newNode = new Node;
    newNode->data = key;
    newNode->next = head;
    return newNode;
}

// Function to delete the front node of a linked list
int Delete(Node*& head) {
    if (head == NULL) {
        cerr << "Error: Trying to delete from an empty list.\n";
        return -1; // Return a sentinel value for error
    }
    int key = head->data;
    Node* temp = head;
    head = head->next;
    delete temp;
    return key;
}
