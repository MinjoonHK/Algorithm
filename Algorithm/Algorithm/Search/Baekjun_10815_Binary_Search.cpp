#define _CRT_SECURE_NO_WARNINGS

#include<stdio.h>
#include <string.h>
#include<stdlib.h> //절대값 , malloc, free
//#include <math.h> //절대값


int compare(const void* num1, const void* num2)
{
    if (*(int*)num1 < *(int*)num2)
        return -1;

    if (*(int*)num1 > *(int*)num2)
        return 1;
    else
        return 0;
}
int binary_search(int* arr, int N, int num)
{
    int start = 0;
    int end = N;
    int mid = (start + end) / 2;
    while (start <= end)
    {
        if (arr[mid] == num)
            return 1;
        else if (arr[mid] < num)
            start = mid + 1;
        else
            end = mid - 1;
        mid = (start + end) / 2;
    }
    return 0;
}
int main()
{
    int* arr, * arr2;
    int i;
    int N, M;
    scanf("%d", &N);
    arr = (int*)malloc(sizeof(int) * N);
    for (i = 0; i < N; i++)
        scanf("%d", &arr[i]);
    scanf("%d", &M);
    arr2 = (int*)malloc(sizeof(int) * M);
    for (i = 0; i < M; i++)
        scanf("%d", &arr2[i]);
    qsort(arr, N, sizeof(int), compare);

    for (i = 0; i < M; i++)
    {
        if (binary_search(arr, N, arr2[i]))
            printf("1 ");
        else
            printf("0 ");
    }

}
