N = int(input())
for j in range(1,N+1):
    T = int(input())
    result = 0
    for i in range(1, T + 1):
        if i % 2 == 0:
            result -= i
        if i % 2 != 0:
            result += i
    print(f"#{j}", result)