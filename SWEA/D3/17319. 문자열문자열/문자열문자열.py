N = int(input())

for i in range(1,N+1):
    T = int(input())
    input_string = str(input())
    answer = "Yes"
    if T <= 1:
        answer = "No"
    elif input_string[:len(input_string)//2] != input_string[len(input_string)//2:]:
        answer = "No"
    print(f"#{i}",answer)