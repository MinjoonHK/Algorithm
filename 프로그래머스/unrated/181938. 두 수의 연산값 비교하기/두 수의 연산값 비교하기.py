def solution(a, b):
    if int(str(a) + str(b)) > 2 * a * b:
        answer = int(str(a) + str(b))
    else:
        answer = 2 * a * b
    return answer