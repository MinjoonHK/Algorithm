#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <string.h>
#include<stdlib.h> //절대값 , malloc, free
//#include <math.h> //절대값

int fibo(int N);

int main() {
	int N;
	scanf("%d", &N);
	printf("%d", fibo(N));
	return 0;
}

int fibo(int N) {
	if (N == 0) {
		return 0;
	}
	if (N == 1) {
		return 1;
	}
	return fibo(N - 1) + fibo(N - 2);
}