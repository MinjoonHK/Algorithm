N,M = map(int,input().split())
arr = []
for i in range(1,N+1):
    if N % i == 0:
        arr.append(i)
if len(arr) < M:
    print(0)
else:
    print(arr[M-1])