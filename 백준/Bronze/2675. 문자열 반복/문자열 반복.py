N = int(input())
for i in range(N):
    result = ''
    R,S = input().split()
    for str in S:
        result += str * int(R)
    print(result)