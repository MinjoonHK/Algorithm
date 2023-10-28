from itertools import *
def solution(numbers):
    arr = list(numbers)
    arr2 = []
    new_nums = []
    answer = []
    for i in range(1,len(numbers)+1):
        arr2 += list(permutations(arr,i))
    for j in arr2:
        new_nums.append(int(''.join(j)))
    for n in new_nums:                 
        if n < 2:
            continue
        check = True
        for k in range(2,int(n**0.5) + 1):
            if n % k ==0:
                check = False
                break
        if check:
            answer.append(n)
    return len(set(answer))


  