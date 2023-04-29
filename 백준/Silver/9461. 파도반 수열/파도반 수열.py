T = [0] * 101
T[1] = 1
T[2] = 1
T[3] = 1
T[4] = 2
T[5] = 2
T[6] = 3
T[7] = 4
T[8] = 5
T[9] = 7
T[10] = 9
N = int(input())
for i in range(1,N+1):
    K = int(input())
    for j in range(11,K+1):
        T[j] = T[j-2]+T[j-3]
    print(T[K])