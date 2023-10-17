def gcd(a,b):
    while b>0:
        a,b = b,a%b
    return a

def lcm(a,b):
    return a*b // lcm(a,b)

def solution(n, m):
    answer = []
    temp1,temp2 = n,m
    while m > 0:
        n,m = m,n%m
    answer.append(n)
    answer.append(temp1*temp2 // n)
    return answer