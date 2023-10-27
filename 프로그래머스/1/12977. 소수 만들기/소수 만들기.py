from itertools import *

def solution(nums):
    max_num = 3000
    arr = [False,False] + [True] * (max_num-1)
    primes = []
    comb = list(combinations(nums,3))
    answer = 0
    for i in range(2,max_num):
        if arr[i]:
            primes.append(i)
            for j in range(2*i,max_num-1,i):
                arr[j] = False
    for j in comb:
        if sum(j) in primes:
            answer += 1
    return answer