#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <string.h>
#include<stdlib.h> //절대값 , malloc, free
//#include <math.h> //절대값


int main() {
	int N, x = 0, y = 0, counter = 0;
	scanf("%d", &N);
	int* weight = (int*)malloc(sizeof(int) * N);
	int* height = (int*)malloc(sizeof(int) * N);
	for (int i = 0; i < N; i++) {
		scanf("%d", &weight[i]);
		scanf("%d", &height[i]);
	}
	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			if (weight[i] < weight[j] && height[i] < height[j]) {
				counter++;
			}
		}
		printf("%d ", counter + 1);
		counter = 0;
	}
}
