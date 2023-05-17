T = int(input())
for tc in range(1,T+1):
    N = int(input())
    arr = []
    result = 0
    for i in range(N):
        A,B = input().split()
        result += float(A) * int(B)
    print(f"#{tc}{result: .6f}")