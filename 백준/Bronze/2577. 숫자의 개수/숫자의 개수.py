A = int(input())
B = int(input())
C = int(input())
multi = str(A * B * C)
numbers = ['0','1','2','3','4','5','6','7','8','9']
for i in numbers:
    print(multi.count(i))