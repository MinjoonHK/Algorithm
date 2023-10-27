from itertools import *
def solution(numbers):
    answer = []
    ncr = list(combinations(numbers,2))
    for i in ncr:
        if sum(i) not in answer:
        	answer.append(sum(i))
    answer.sort()
    return answer