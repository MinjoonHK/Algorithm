T = int(input())
Date_list = [0,31,28,31,30,31,30,31,31,30,31,30,31]
for i in range(1,T+1):
    A,B,C,D = map(int,input().split())
    result = 0
    if A == C:
        result = D - B + 1
    else:
        for j in range(A+1,C):
            result += Date_list[j]
        result += Date_list[A] - B + D + 1
    print(f"#{i}", result)