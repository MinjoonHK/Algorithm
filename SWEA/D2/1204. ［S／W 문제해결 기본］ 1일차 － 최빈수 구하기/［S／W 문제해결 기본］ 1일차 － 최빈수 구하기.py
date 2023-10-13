from collections import Counter

T = int(input())
for i in range(1,T+1):
    TC = int(input())
    num_list = list(map(int,input().split()))
    count_num_list = Counter(num_list)
    most_common = count_num_list.most_common()
    print(f"#{i}",most_common[0][0])
