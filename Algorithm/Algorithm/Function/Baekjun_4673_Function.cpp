#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <string.h>
#include<stdlib.h> //절대값 , malloc, free
//#include <math.h> //절대값


int selfNumber();

int main() {
	int arr[10001], check;
	for (int i = 1; i < 10001; i++) {
		check = selfNumber(i);
		if (check < 10001) {
			arr[check] = 1;
		}
	}
	for (int i = 1; i < 10001; i++) {
		if (arr[i] != 1) {
			printf("%d\n", i);
		}
	}
	return 0;
}

int selfNumber(int n) {
	int sum = n;
	while (n > 0) {
		sum += n % 10;
		n /= 10;
	}
	return sum;
}