T = int(input())
for i in range(1,T+1):
    P,Q,R,S,W = map(int,input().split())
    A = P * W
    if R > W:
        B = Q
    else:
        B = Q + ((W-R) * S)
    if B > A:
        print(f"#{i}",A)
    elif B < A:
        print(f"#{i}",B)