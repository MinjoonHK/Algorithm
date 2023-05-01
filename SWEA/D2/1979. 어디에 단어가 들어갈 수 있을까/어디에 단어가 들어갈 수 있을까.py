T = int(input())
for tc in range(1,T+1):
    N, K = map(int,input().split())
    table = [list(map(int,input().split())) for _ in range(N)]
    result = 0
    for i in range(N): #배열에 진입
        counter = 0
        for j in range(N):
            if table[i][j] == 1: #1행 1 2 3 4 5 요소
                counter += 1
            if table[i][j] == 0 or j == N-1: #만약 요소가 0 이거나
                if K == counter:
                    result += 1
                if table[i][j] == 0:
                    counter = 0

    for i in range(N):
        counter = 0
        for j in range(N):
            if table[j][i] == 1:
                counter += 1
            if table[j][i] == 0 or j == N-1:
                if K == counter:
                    result += 1
                if table[j][i] == 0:
                    counter = 0

    print(f"#{tc}",result)