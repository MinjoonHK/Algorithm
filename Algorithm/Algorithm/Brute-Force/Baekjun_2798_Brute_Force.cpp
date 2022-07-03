#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <string.h>
#include<stdlib.h> //절대값 , malloc, free
//#include <math.h> //절대값


int main() {
	int N, M, sum = 0, max = 0;
	scanf("%d %d", &N, &M);
	int* arr = (int*)malloc(sizeof(int) * N);
	for (int i = 0; i < N; i++) {
		scanf("%d", &arr[i]);
	}
	for (int i = 0; i < N; i++) {
		for (int j = i + 1; j < N; j++) {
			for (int k = j + 1; k < N; k++) {
				sum = arr[i] + arr[j] + arr[k];
				if (sum > max && sum <= M) {
					max = sum;
				}
			}
		}
	}
	printf("%d\n", max);
	return 0;
}
