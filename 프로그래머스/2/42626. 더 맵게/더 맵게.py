from heapq import *
def solution(scoville, K):
    heapify(scoville)
    counter = 0
    while scoville[0] < K:
        mix = heappop(scoville) + heappop(scoville) * 2
        heappush(scoville,mix)
        counter += 1
        if len(scoville) == 1 and scoville[0] < K:
            counter = -1
            break
    return counter