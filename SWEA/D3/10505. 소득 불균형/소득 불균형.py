T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = list(map(int,input().split()))
    average = sum(arr) // N
    counter = 0
    for i in range(N):
        if arr[i] <= average:
            counter+=1
    print(f"#{tc}",counter)