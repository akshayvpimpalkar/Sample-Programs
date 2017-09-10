// StarPyramid.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

int main()
{
	
	int rows, c;
	cout << "Enter number of rows: ";
	cin >> rows;


	//Normal star pyramid
	c = 2 * rows - 1;
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < c; j++) {
			if (j >= (rows - 1 - i) && j <= (rows - 1 + i)) {
				cout << "*";
			}
			else {
				cout << " ";
			}
		}
		cout << endl;
	}

	cout << "------------------------------------" << endl;


	//star pyramid with alternate star and space printing

	int k; //to toggle k to print alternate "*" with " " in each row
	for (int i = 0; i < rows; i++) {
		k = 1;
		for (int j = 0; j < c; j++) {
			if (j >= (rows - 1 - i) && j <= (rows - 1 + i) && k) {
				cout << "*";
				k = 0;
			}
			else {
				cout << " ";
				k = 1;
			}
		}
		cout << endl;
	}

	cout << "------------------------------------" << endl;


	//for printing compliment of the first pattern above
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < c; j++) {
			if (j <= (rows - 1 - i) || j >= (rows - 1 + i)) {
				cout << "*";
			}
			else {
				cout << " ";
			}
		}
		cout << endl;
	}
    return 0;
}

