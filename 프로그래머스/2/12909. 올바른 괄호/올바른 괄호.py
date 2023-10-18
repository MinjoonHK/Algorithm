def solution(s):
    left = []
    right = []
    for i in range(len(s)):
        if s[i] == "(":
            left.append("(")
        elif s[i] == ")":
            if len(left) == 0:
                return False
            elif len(left) > len(right):
                right.append(")")
            elif len(left) < len(right):
                return False
    if len(left) == len(right):
        return True
    else:
        return False
    return False