N = int(input())
vowel = ['a','e','i','o','u']
for i in range(1,N+1):
    A = str(input())
    answer = ''
    for j in range(len(A)):
        if A[j] in vowel:
            continue
        else:
            answer += A[j]
    print(f"#{i}",answer)