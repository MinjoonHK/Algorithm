T = int(input())
for i in range(1,T+1):
    result_list = []
    C,D = map(int,input().split())
    A = list(map(int,input().split()))
    B = list(map(int,input().split()))
    if len(A) > len(B):
        for j in range(len(A)-len(B)+1):
            temp = 0
            for k in range(len(B)):
                temp += A[k+j] * B[k]
            result_list.append(temp)
    elif len(A) < len(B):
        for j in range(len(B)-len(A)+1):
            temp = 0
            for k in range(len(A)):
                temp += B[k+j] * A[k]
            result_list.append(temp)
    print(f"#{i}",max(result_list))