T = int(input())
for tc in range(1, T + 1):
    N = int(input())
    farm = [list(map(int, input())) for _ in range(N)]
    result = 0
    s,e = N//2, N//2
    for i in range(N):
        for j in range(s,e+1):
            result += farm[i][j]
        if i < N//2:
            s -= 1
            e += 1
        else:
            s += 1
            e -= 1
    print(f"#{tc}",result)
