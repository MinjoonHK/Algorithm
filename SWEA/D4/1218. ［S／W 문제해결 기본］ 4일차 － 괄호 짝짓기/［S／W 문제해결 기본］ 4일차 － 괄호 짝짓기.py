for i in range(1,11):
    N = int(input())
    arr = list(map(str,input()))
    left = ['<','{','(','[']
    right = ['>','}',')',']']
    stack = list()
    for j in range(N):
        if arr[j] in left:
            stack.append(arr[j])
        if arr[j] in right:
            if right.index(arr[j]) == left.index(stack[-1]):
                stack.pop()
            else:
                break


    result = 0
    if len(stack) == 0:
        result = 1
    print(f"#{i}",result)

