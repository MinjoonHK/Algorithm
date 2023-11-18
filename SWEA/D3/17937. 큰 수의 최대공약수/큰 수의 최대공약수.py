T = int(input())

for test_case in range(1, T + 1):
    a,b = map(int,input().split())
    if a == b:
        GCD = a
    else:
        GCD = 1
    print(f'#{test_case} {GCD}') 