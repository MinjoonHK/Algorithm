N = int(input())
for i in range(1,N+1):
    A = list(map(int,input().split()))
    print(f"#{i}",max(A))
