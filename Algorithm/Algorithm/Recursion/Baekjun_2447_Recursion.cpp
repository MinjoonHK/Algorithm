#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <string.h>
#include<stdlib.h> //절대값 , malloc, free
//#include <math.h> //절대값


int main() {
	int N, counter = 0;
	scanf("%d", &N);
	int* arr = (int*)malloc(sizeof(int) * N);
	int* arr2 = (int*)malloc(sizeof(int) * N);
	for (int i = 0; i < N; i++) {
		scanf("%d", arr[i]);
	}
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			if (arr[i] > arr[j]) {
				counter++;
			}
		}
		arr2[i] = counter;
		counter = 0;
	}
	for (int i = 0; i < N; i++) {
		printf("%d\n", arr2[i]);
	}
	return 0;
}
