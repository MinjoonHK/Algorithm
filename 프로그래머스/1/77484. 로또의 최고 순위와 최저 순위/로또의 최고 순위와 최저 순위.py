def solution(lottos, win_nums):
    ranks= [6,6,5,4,3,2,1]
    minimum,maximum = 0,0
    counter = 0
    zeros = 0
    for i in lottos:
        if i == 0:
            zeros += 1
        if i in win_nums:
            counter += 1
    temp1 = counter + zeros
    temp2 = counter
    
    maximum = ranks[temp1]
    minimum = ranks[temp2]
    
    
    return [maximum,minimum]