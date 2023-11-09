import sys

input = sys.stdin.readline

N,M = map(int,input().split())
arr = list(map(int,input().split()))

dp = [0] * (N+1)
dp[1] = arr[0]

for i in range(2,len(dp)):
    dp[i] = dp[i-1] + arr[i-1]

for j in range(M):
    a,b = map(int,input().split())
    print(dp[b] - dp[a-1])