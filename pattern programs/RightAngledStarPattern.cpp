// RightAngledStarPattern.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
using namespace std;

int main()
{
	int i, j;
	//i = rows
	for (i = 0; i < 5; i++) { 
		//j = columns
		for (j = 0; j < 5; j++) { 
			if (j <= i) {
				cout << "*"; 
				//if u want inverted right angled star pattern then,
				//interchange above statement with statement in else part
			}
			else {
				cout << " ";
			}
		}
		cout << endl;
	}
    return 0;
}

O/P:

*
**
***
****
*****
Press any key to continue . . .


//this pattern is the mirror image of above pattern
	int k, l;
	for (k = 0; k < 5; k++) {
		//k = columns
		for (l = 0; l < 5; l++) {
			//l = columns
			if (l >= 4 - k) {
				cout << "*";
				//if u want inverted right angled star pattern then,
				//interchange above statement with statement in else part
			}
			else {
				cout << " ";
			}
		}
		cout << endl;
	}
	
O/P:

    *
   **
  ***
 ****
*****
Press any key to continue . . .