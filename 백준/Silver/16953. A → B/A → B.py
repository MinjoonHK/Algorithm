import sys
from collections import deque

input = sys.stdin.readline


def bfs(a, b):
    queue = deque()
    queue.append((a,1))

    while queue:
        now, cnt = queue.popleft()
        if now == b:
            print(cnt)
            return

        if now * 2 <= b:
            queue.append((now * 2, cnt + 1))
        if now * 10 + 1 <= b:
            queue.append((now * 10 + 1, cnt + 1))
    print(-1)


a, b = map(int, input().split())
bfs(a, b)