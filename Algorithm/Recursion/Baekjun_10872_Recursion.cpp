#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <string.h>
#include<stdlib.h> //절대값 , malloc, free
//#include <math.h> //절대값

int factorial(int N);

int main() {
	int N;
	scanf("%d", &N);
	printf("%d", factorial(N));
	return 0;
}

int factorial(int N) {
	if (N == 0) {
		return 1;
	}
	else if (N == 1) {
		return 1;
	}
	else {
		return N * factorial(N - 1);
	}
}