#include <cstring>
#include <iostream>
#include <vector>
using namespace std;

vector<int> allOccurenance(string big, string small) {
  vector<int> result;
  int index = big.find(small);
  while (index != -1) {
    result.push_back(index);
    index = big.find(small, index + 1);
  }
  return result;
}

void replace_space(char *str) {
  // 1.calc spaces
  int spaces = 0;
  for (int i = 0; str[i] != '\0'; i++) {
    if (str[i] == ' ') {
      spaces += 1;
    }
  }
  int idx = strlen(str) + 2 * spaces;
  str[idx] = '\0';
  for (int i = strlen(str) - 1; i >= 0; i--) {
    if (str[i] == ' ') {
      str[idx - 1] = '0';
      str[idx - 2] = '2';
      str[idx - 3] = '%';
      idx = idx - 3;

    } else {
      str[idx - 1] = str[i];
      idx--;
    }
  }
};

int main() {
  // string s = "Hello world";
  // string s("Welcome");
  // string s;
  // getline(cin, s);
  // getline(cin, s, '.');
  // for (char ch : s) {
  //  cout << ch << endl;
  //}
  /*
  int n = 5;
  vector<string> sarr;
  string temp;
  while (n--) {
    getline(cin, temp);
    sarr.push_back(temp);
  }
  for (string x : sarr) {
    cout << x << "," << endl;
  }
  */

  // cout << s << endl;

  string paragraph =
      "We are learning about STL strings. STL string class is quite powerful";
  /*
  string word;
  getline(cin, word);
  // cout << paragraph.find(word) << endl;
  int index = paragraph.find(word, 0);
  if (index != -1) {
    cout << "First occ " << index << endl;
  }
  index = paragraph.find(word, index + 1);
  if (index != -1) {
    cout << "Second occ " << index << endl;
  }
  if (index == -1) {
    cout << "String not found " << endl;
  }

  // all occereance of a word;
  vector<int> str = allOccurenance(paragraph, "STL");
  for (int i = 0; i < str.size(); i++) {
    cout << str[i] << endl;
  }
  */
  char input[10000];
  cin.getline(input, 1000);
  replace_space(input);
  cout << input << endl;
};
