import itertools

T = int(input())
for tc in range(1,T+1):
    arr = list(map(int,input().split()))
    result = []
    for i in itertools.combinations(arr,3):
        if sum(i) not in result:
            result.append(sum(i))
        else:
            pass
    result.sort()
    print(f"#{tc}",result[len(result)-5])
