T = int(input())
for i in range(1,T+1):
    N = int(input())
    num_list = list(map(int,input().split()))
    num_list.sort()
    print(f"#{i}",*num_list)