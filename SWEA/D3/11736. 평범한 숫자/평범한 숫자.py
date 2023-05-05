T = int(input())
for tc in range(1,T+1):
    user_input = int(input())
    arr = list(map(int,input().split()))
    counter = 0
    for i in range(1,user_input -1):
        if arr[i] != max(arr[i],arr[i+1],arr[i-1]) and arr[i] != min(arr[i],arr[i+1],arr[i-1]):
            counter += 1
    print(f"#{tc}",counter)
