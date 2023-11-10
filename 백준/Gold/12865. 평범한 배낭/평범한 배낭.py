import sys

N, K = map(int, input().split())
stuff = [[0,0]]
knapsack = [[0 for _ in range(K + 1)] for _ in range(N + 1)]

for _ in range(N):
    stuff.append(list(map(int, input().split())))

for i in range(1, N + 1): # 1, 5
    for j in range(1, K + 1): # 1, 7 + 1
        weight = stuff[i][0] # 6 4 3
        value = stuff[i][1] # 13 8 6

        if j < weight: # 6 < 7 knapsack[1][1] = knapsack[0][1] = 0 knapsack[2][1] = knapsack[1][1]
            knapsack[i][j] = knapsack[i - 1][j]  # weight보다 작으면 위의 값을 그대로 가져온다
        else:                      # 6 이랑 7일떄만
            knapsack[i][j] = max(value + knapsack[i - 1][j - weight], knapsack[i - 1][j])
print(knapsack[N][K])