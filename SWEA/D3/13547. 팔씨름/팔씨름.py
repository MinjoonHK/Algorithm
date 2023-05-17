T = int(input())
for tc in range(1,T+1):
    N = str(input())
    if N.count('x') <= 7:
        print(f"#{tc}","YES")
    else:
        print(f"#{tc}","NO")