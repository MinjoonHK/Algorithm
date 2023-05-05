T = int(input())
for tc in range(1,T+1):
    A,B = map(int,input().split())
    if A > 9 or B > 9:
        print(f"#{tc}","-1")
    else:
        print(f"#{tc}", A * B)