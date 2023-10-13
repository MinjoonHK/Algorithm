T = int(input())
for i in range(1,T+1):
    N = int(input())
    Word = ""
    for j in range(N):
        A,B = input().split()
        Word += str(A) * int(B)
    print(f"#{i}")
    for k in range(0,len(Word),10):
        print(Word[k:k+10])