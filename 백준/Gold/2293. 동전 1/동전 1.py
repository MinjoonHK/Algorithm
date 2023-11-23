N, K = map(int,input().split())
arr = [int(input()) for _ in range(N)]

dp = [0] * (K+1)
dp[0] = 1

for i in arr:
    for j in range(i,K+1):
        if j-i >= 0:
            dp[j] += dp[j-i]
print(dp[-1])