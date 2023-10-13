T = int(input())
for i in range(1,T+1):
    num_list = list(map(int,input().split()))
    num_list.sort()
    num_list.pop()
    num_list.pop(0)
    result = round(sum(num_list) / len(num_list))
    print(f"#{i}",result)