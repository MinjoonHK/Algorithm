import sys

N = int(input())
answer = []
for _ in range(N):
    command = sys.stdin.readline().split()
    if command[0] == 'push':
        answer.append(int(command[1]))
    elif command[0] == 'pop':
        if len(answer) == 0:
            print(-1)
        else:
            print(answer.pop())
    elif command[0] == 'size':
        print(len(answer))
    elif command[0] == 'empty':
        if len(answer) == 0:
            print(1)
        else:
            print(0)
    elif command[0] == 'top':
        if len(answer) == 0:
            print(-1)
        else:
            print(answer[-1])