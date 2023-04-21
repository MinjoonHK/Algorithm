T = int(input())
for i in range(1,T+1):
    N,M = map(int,input().split())
    print(f"#{i}",N // M,N%M)