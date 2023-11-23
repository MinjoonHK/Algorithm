import sys
readline = sys.stdin.readline

N = int(readline())
T, P = [], []
for _ in range(N):
    t, p = map(int, readline().split())
    T.append(t)
    P.append(p)

d = [0] * (N+1)

for i in range(N - 1, -1, -1):
    if i + T[i] > N:
        d[i] = d[i+1]
    else:
        d[i] = max(d[i+1], P[i] + d[i + T[i]])

print(d[0])