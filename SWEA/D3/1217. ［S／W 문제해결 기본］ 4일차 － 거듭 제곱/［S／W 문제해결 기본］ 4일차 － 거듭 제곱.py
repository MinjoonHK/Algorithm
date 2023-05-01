for tc in range(1,11):
    T = int(input())
    N,M = map(int,input().split())
    dp = [0] * 10000
    dp[0] = N
    for i in range(1,M):
        dp[i] = dp[i-1] * N
    print(f"#{tc}",dp[M-1])