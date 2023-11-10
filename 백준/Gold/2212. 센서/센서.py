N = int(input())
K = int(input())

arr = list(map(int,input().split()))
arr.sort()

dist = []

for i in range(1,len(arr)):
    dist.append(arr[i] - arr[i-1])
dist.sort()

print(sum(dist[:N-K]))