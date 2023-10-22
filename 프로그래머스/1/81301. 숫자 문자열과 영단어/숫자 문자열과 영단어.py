def solution(s):
    words = ['zero','one','two','three','four','five','six','seven','eight','nine']
    numbers = [0,1,2,3,4,5,6,7,8,9]
    answer = s
    for i in range(len(words)):
        if answer.find(words[i]) != -1:
            answer = answer.replace(words[i],str(numbers[i]))
    return int(answer)
    