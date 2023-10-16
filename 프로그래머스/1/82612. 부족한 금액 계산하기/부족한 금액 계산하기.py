def solution(price, money, count):
    Yogeum = 0 
    for i in range(1,count+1):
        Yogeum += price * i
    answer = Yogeum - money
    if answer <= 0:
        return 0
    return answer