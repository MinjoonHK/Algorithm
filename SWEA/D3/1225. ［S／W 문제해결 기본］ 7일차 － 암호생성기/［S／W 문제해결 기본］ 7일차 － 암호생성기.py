for tc in range(1,11):
    T = int(input())
    arr = list(map(int,input().split()))
    i = 1
    while(True):
        if arr[-1] <= 0:
            arr[-1] = 0
            break
        if i == 6:
            i = 1
        arr.append(arr[0] - i)
        del arr[0]
        i += 1
    print(f"#{tc}", *arr)