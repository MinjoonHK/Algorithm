T = int(input())
for tc in range(1,T+1):
    N = int(input())
    if N % 2 == 0:
        print(f"#{tc}","Even")
    else:
        print(f"#{tc}","Odd")