def solution(numbers):
    arr = [str(i) for i in numbers]
    arr.sort(reverse = True, key = lambda x:x*3)
        
    return str(int(''.join(arr)))