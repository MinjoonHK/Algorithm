def solution(s):
    arr = list(s)
    first_word = s[0]
    counter1 = 0
    counter2 = 0
    counter3 = 0
    for i in range(len(arr)-1):
        if arr[i] == first_word:
            counter1 += 1
        elif arr[i] != first_word:
            counter2 += 1
        if counter1 == counter2:
            counter3 += 1
            counter1 = 0
            counter2 = 0
            first_word = arr[i+1]
    return counter3 + 1