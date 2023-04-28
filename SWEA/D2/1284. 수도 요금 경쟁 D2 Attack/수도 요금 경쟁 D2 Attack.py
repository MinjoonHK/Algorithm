T = int(input())
for i in range(1,T+1):
    P,Q,R,S,W = map(int,input().split())
    company1 = P * W
    if R > W:
        company2 = Q
    elif R < W:
        company2 = Q + (S * (W - R))
    print(f"#{i}",min(company1,company2))