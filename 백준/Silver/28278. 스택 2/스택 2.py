import sys
input = sys.stdin.readline

N = int(input())
arr = []
for i in range(N):
    user_input = str(input()).rstrip().split(" ")
    if user_input[0] == '1':
        arr.append(user_input[1])
    elif user_input[0] == '2':
        if arr:
            print(arr.pop())
        else:
            print(-1)
    elif user_input[0] == '3':
        print(len(arr))
    elif user_input[0] == '4':
        if arr:
            print(0)
        else:
            print(1)
    elif user_input[0] == '5':
        if arr:
            print(arr[-1])
        else:
            print(-1)