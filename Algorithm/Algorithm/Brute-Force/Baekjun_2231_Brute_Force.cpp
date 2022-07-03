#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <string.h>
#include<stdlib.h> //절대값 , malloc, free
//#include <math.h> //절대값


int main() {
	int N;
	scanf("%d", &N);
	for (int i = 1; i < N; i++) {
		int temp = i;
		int num = i;
		while (temp > 0) {
			num += temp % 10;
			temp /= 10;
		}
		if (num == N) {
			printf("%d", i);
			N = 0;
			break;
		}
	}
	if (N != 0) {
		printf("0");
	}
}
