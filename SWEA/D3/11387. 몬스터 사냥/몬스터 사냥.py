T = int(input())
for i in range(1,T+1):
    D,L,N = map(int,input().split())
    answer = 0
    for n in range(N):
        answer += D * (1 + n * L * 0.01)
    print(f"#{i}",int(answer))
