T = int(input())

for test_case in range(1, T + 1):
    N, M, K = map(int, input().split())
    lst = list(map(int, input().split()))
    lst.sort()
    ans = 'Possible'
    bread = 0
    for i in lst:
        bread += 1
        if ((i // M) * K < bread):
            ans = 'Impossible'
            break
    print(f'#{test_case} {ans}')