N = list(str(input()))
left = []
right = []
for i in range(len(N) // 2):
    right.append(int(N.pop()))
    left.append(int(N[i]))
if sum(left) == sum(right):
    print("LUCKY")
else:
    print("READY")