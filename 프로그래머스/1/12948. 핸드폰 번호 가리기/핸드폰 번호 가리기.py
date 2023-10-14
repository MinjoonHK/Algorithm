def solution(phone_number):
    last4 = phone_number[len(phone_number)-4:]
    answer = "*" * (len(phone_number) -4) + last4
    return answer