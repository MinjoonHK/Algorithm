#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <string.h>
#include<stdlib.h> //절대값 , malloc, free
//#include <math.h> //절대값

int star(int X, int Y, int N);

int main() {
	int N, i, J;
	scanf("%d", &N);
	i = 0;
	while (i < N) {
		J = 0;
		while (J < N) {
			star(i, J, N);
			J++;
		}
		printf("\n");
		i++;
	}
	return 0;
}

int star(int X, int Y, int N) {
	if ((X / N) % 3 == 1 && (Y / N) % 3 == 1) {
		printf(" ");
	}
	else {
		if (N / 3 == 0) {
			printf("*");
		}
		else {
			return star(X, Y, N / 3);
		}
	}
}
