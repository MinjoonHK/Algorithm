from collections import Counter
T = int(input())
for tc in range(1,T+1):
    arr = list(map(int,input().split()))
    count_arr = Counter(arr).most_common()
    if count_arr[0][1] == 2:
        print(f"#{tc}",count_arr[1][0])
    else:
        print(f"#{tc}",count_arr[0][0])