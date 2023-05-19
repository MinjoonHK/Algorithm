import sys
sys.setrecursionlimit(50000000)
input = sys.stdin.readline

def dfs(x,y):
    if x >= N or x <= -1 or y >= M or y <= -1:
        return False
    if graph[x][y] == 1:
        graph[x][y] = 0
        dfs(x+1,y)
        dfs(x-1,y)
        dfs(x,y+1)
        dfs(x,y-1)
        return True
    return False

T = int(input()) #테스트케이스 숫자 2
for i in range(T):
    M, N, K = map(int,input().split()) # M 가로길이 N 세로길이 K 배추의 수 10 8 7
    graph = [[0] * M for _ in range(N)] #M * N 그래프 생성
    counter = 0
    for j in range(K):
        A,B = map(int,input().split())
        graph[B][A] = 1 #좌표에 따라 1 삽입
    for k in range(M):
        for l in range(N):
            if dfs(l,k) == True:
                counter += 1
    print(counter)

