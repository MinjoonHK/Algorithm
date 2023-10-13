T = int(input())
for i in range(1,T+1):
    N = int(input())
    result = 0
    speed = 0
    for j in range(N):
        arr = list(map(int,input().split()))
        if arr[0] == 0:
            result += speed
        elif arr[0] == 1:
            speed += arr[1]
            result += speed
        elif arr[0] == 2:
            speed -= arr[1]
            if speed < 0:
                speed = 0
            result += speed
    print(f"#{i}",result)