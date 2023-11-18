T = int(input())

for test_case in range(1,T+1):
    N = int(input())
    num = 1
    for i in range(2,int(N**(1/2))+1):
        if N % i == 0:
            num = i
    num1 = (N//num) - 1
    num += num1 - 1
    print(f"#{test_case}",str(num))