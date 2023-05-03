import sys
import heapq
T = int(sys.stdin.readline())
hq = []
for i in range(1,T+1):
    user_input = int(sys.stdin.readline())
    if user_input != 0:
        heapq.heappush(hq,(abs(user_input),user_input))
    if user_input == 0:
        if len(hq) == 0:
            print(0)
        else:
            print(heapq.heappop(hq)[1])