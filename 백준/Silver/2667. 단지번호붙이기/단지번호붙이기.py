
def dfs(x,y):
    if x >= T or x <= -1 or y >= T or y <= -1:
        return False
    if graph[x][y] == 1:
        global result
        result += 1
        graph[x][y] = 0
        dfs(x+1,y)
        dfs(x-1,y)
        dfs(x,y+1)
        dfs(x,y-1)
        return True
    return False

T = int(input())
graph = []
num = []

for _ in range(T):
    graph.append(list(map(int,input()))) #2차원 배열 생성
result = 0
counter = 0
for i in range(T):
    for j in range(T):
        if dfs(i,j) == True:
            num.append(result)
            counter += 1
            result = 0
num.sort()
print(counter)
print(*num, sep='\n')



