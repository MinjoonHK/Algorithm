T = int(input())
for test_case in range(1, T+1):
    n = int(input())
    cube = [list(map(str, input().split())) for _ in range(n)]
    result = [[] for _ in range(n)]
    for j in range(n):
        re = ''
        for i in range(n-1, -1, -1):
            re += cube[i][j]
        result[j].append(re)
    for j in range(n-1, -1, -1):
        re = ''
        for i in range(n-1, -1, -1):
            re += cube[j][i]
        result[n-j-1].append(re)
    for j in range(n - 1, -1, -1):
        re = ''
        for i in range(n):
            re += cube[i][j]
        result[n - j - 1].append(re)
    print("#%d" %test_case)
    for k in result:
        print(*k)