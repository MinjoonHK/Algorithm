T = int(input())
num_list = list(map(int,input().split()))
num_list.sort()
mid_point = len(num_list) // 2
print(num_list[mid_point])