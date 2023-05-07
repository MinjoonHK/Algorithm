T = int(input())
for tc in range(1,T+1):
    N, D = map(int,input().split())
    water_range = 2*D + 1
    temp = 0
    counter = 0
    while(True):
        if temp >= N:
            break
        temp += water_range
        counter += 1
    print(f"#{tc}",counter)
