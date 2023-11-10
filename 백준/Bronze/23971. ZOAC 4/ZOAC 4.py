H,W,N,M = map(int,input().split())

horizontal = 0
vertical = 0
temp1 = 1
temp2 = 1
for i in range(1,W+1):
    if temp1 >W:
        break
    temp1 += M + 1

    horizontal += 1
for j in range(1,H+1):
    if temp2 >H:
        break
    temp2 += N + 1

    vertical += 1
print(horizontal * vertical)