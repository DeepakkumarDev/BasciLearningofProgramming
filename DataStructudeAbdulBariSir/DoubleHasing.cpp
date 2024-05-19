#include<iostream>
#include<stdio.h>
using namespace std;

#define SIZE 10
#define R 7 // The nearest prime number to the size of the hash table

int hash(int key) {
    return key % SIZE;
}

int h1(int key) {
    return key % SIZE;
}

int h2(int key) {
    return R - (key % R);
}

int doubleHash(int H[], int key, int i) {
    return (h1(key) + i * h2(key)) % SIZE;
}

void Insert(int H[], int key) {
    int index = hash(key);
    int i = 0;
    while (H[doubleHash(H, key, i)] != 0) {
        i++;
    }
    H[doubleHash(H, key, i)] = key;
}

int Search(int H[], int key) {
    int index = hash(key);
    int i = 0;
    while (H[doubleHash(H, key, i)] != key) {
        i++;
    }
    return doubleHash(H, key, i);
}

int main() {
    int HT[10] = {0};
    Insert(HT, 5);
    Insert(HT, 25);
    Insert(HT, 15);
    Insert(HT, 35);
    Insert(HT, 95);

    cout << "\nKey Found at : " << Search(HT, 25) << endl;
    return 0;
}

