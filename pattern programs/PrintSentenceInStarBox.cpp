// PrintSentenceInStarPattern.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include<iostream>
using namespace std;

int main()
{
	char str[100];
	char word[20];
	char wordArray[20][50];
	cout << "Enter sentence: ";
	gets_s(str);
	int i, len, p, wi = 0, wordSize;
	for (i = 0; str[i] != '\0'; i++) {

	}

	len = i;

	cout << endl;
	int maxWordSize=0;
	for (int k = 0; k < len; k++) {
		p = 0;
		wordSize = 0;
		while(str[k] != ' ' && k != len) {
			word[p++] = str[k++];
			wordSize++;
		}
		if (maxWordSize < wordSize) {
			maxWordSize = wordSize;
		}
		word[p] = '\0';
		strcpy_s(wordArray[wi++], word);
	}

		for (int j = 0; j < maxWordSize + 2; j++) {
			cout << "*";
		}
		cout << endl;
	for (int l = 0; l < wi; l++) {

		//line 2nd to 2nd last printing
		for (int j = 0; j < maxWordSize + 2; j++) {
			if (j == 0) {
				cout << "*";
				j++;
			}
			/*else if (j <= maxWordSize - strlen(wordArray[l])) {
				cout << " ";
			}
			else{
				if(j < maxWordSize -1)
				cout << wordArray[l][j];
			}*/
			/*while (j != maxWordSize - strlen(wordArray[l])) {
				cout << " ";
				j++;
			}*/

			for (int s = 0; s < (maxWordSize - strlen(wordArray[l])); s++) {
				cout << " ";
				j++;
			}
			for (int q = 0; q < strlen(wordArray[l]); q++) {
				cout << wordArray[l][q];
				j++;
			}

			if (j == maxWordSize + 1) {
				cout << "*";
				j++;
			}
		}
		cout << endl;
	}

	for (int j = 0; j < maxWordSize + 2; j++) {
		cout << "*";
	}
	cout << endl;
    return 0;
}
