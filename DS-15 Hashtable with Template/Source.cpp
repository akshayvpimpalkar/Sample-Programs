#include <iostream>
#include <conio.h>
#include "Header.h"
#include <string>
using namespace std;

void main() {
	HashTable <char, string> h1(5);

	h1.put('A', "Akshay");
	h1.put('B', "Keshav");
	h1.put('C', "Aaditya");
	h1.put('D', "Priyanka");


	cout << h1.put('A', "Saurabh");
	string ref;

	cout << endl;
	h1.get('C', ref);
	cout << ref << " is found" << endl;

	cout << endl;
	h1.get('D', ref);
	cout << ref << " is found" << endl;


	cout << endl;
	h1.get('B', ref);
	cout << ref << " is found" << endl;

	_getch();
}