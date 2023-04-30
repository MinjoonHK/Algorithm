T = int(input())
result_hour = 0
result_minute = 0
for tc in range(1,T+1):
    hour1, minute1, hour2, minute2 = map(int, input().split())
    result_hour = hour1 + hour2
    result_minute = minute1 + minute2
    if result_minute >= 60:
        result_hour += 1
        result_minute -= 60
    if result_hour > 12:
        result_hour -= 12

    print(f"#{tc}",result_hour,result_minute)