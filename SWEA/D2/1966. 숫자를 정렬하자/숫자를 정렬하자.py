T = int(input())
for tc in range(1,T+1):
    user_input = int(input())
    arr = list(map(int,input().split()))
    arr.sort()
    print(f"#{tc}",*arr)