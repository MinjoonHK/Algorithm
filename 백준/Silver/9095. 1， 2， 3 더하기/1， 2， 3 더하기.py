N = int(input())

for i in range(N):
    a = int(input())
    dp = [0] * (a+1)
    for j in range(1,a+1):
        if j == 1:
            dp[j] = 1
        elif j == 2:
            dp[j] = 2
        elif j == 3:
            dp[j] = 4
        else:
            dp[j] = dp[j-1] + dp[j-2] + dp[j-3]
    print(dp[a])