N = int(input())
counter = 0
while(N>0):
    counter += N % 10
    N = N // 10
print(counter)