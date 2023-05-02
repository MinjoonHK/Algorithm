for tc in range(1,11):
    T=int(input())
    arr = [list(map(int,input().split())) for _ in range(100)]
    max_horizontal = 0
    max_diagonal = 0
    max_vertical = 0
    max_diagonal2 = 0
    for i in range(100):
        max_diagonal += arr[i][i]
        if sum(arr[i]) > max_horizontal:
            max_horizontal = sum(arr[i])
        tmp = 0
        for j in range(100):
            tmp += arr[j][i]
        if tmp > max_vertical:
            max_vertical = tmp
    for i in reversed(range(100)):
        max_diagonal2 += arr[i][i]
    print(f"#{tc}",max(max_vertical,max_horizontal,max_diagonal2,max_diagonal))


