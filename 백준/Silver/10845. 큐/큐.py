import sys

N = int(input())
result = []
for _ in range(N):
    cmd = sys.stdin.readline().split()
    if cmd[0] == 'push':
        result.append(int(cmd[1]))
    if cmd[0] == 'pop':
        if len(result) == 0:
            print(-1)
        else:
            print(result.pop(0))
    if cmd[0] == 'size':
        print(len(result))
    if cmd[0] == 'empty':
        if len(result) == 0:
            print(1)
        else:
            print(0)
    if cmd[0] == 'front':
        if len(result) == 0:
            print(-1)
        else:
            print(result[0])
    if cmd[0] == 'back':
        if len(result) == 0:
            print(-1)
        else:
            print(result[-1])
