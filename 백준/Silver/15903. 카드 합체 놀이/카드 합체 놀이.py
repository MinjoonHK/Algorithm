import sys
from heapq import *

input = sys.stdin.readline

M,N = map(int,input().split())

arr = list(map(int,input().split()))
heapify(arr)
for _ in range(N):
    a = heappop(arr)
    b = heappop(arr)
    result = a + b
    heappush(arr,result)
    heappush(arr,result)
print(sum(arr))