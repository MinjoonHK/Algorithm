N = int(input())
weekend = ["MON","TUE","WED","THU","FRI","SAT","SUN"]

for i in range(1,N+1):
    a = str(input())
    if a == "SUN":
        print(f"#{i}",7)
    else:
        print(f"#{i}",6 - weekend.index(a))