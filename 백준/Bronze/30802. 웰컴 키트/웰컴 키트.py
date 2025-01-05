N = int(input())
tArr = list(map(int, input().split()))
T, P = map(int,input().split())
shirt = 0
pen = 0

for tShirt in tArr:
    base = 1
    base += tShirt // T
    if(tShirt % T == 0):
        base -= 1
    shirt += base
print(shirt)
print(f"{N // P} {N % P}")