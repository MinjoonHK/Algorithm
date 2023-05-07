for tc in range(1,11):
    N = int(input())
    user_input = str(input())
    sentence = str(input())
    print(f"#{tc}",sentence.count(user_input))