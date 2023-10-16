def solution(s):
    arr = list(s)
    arr2 = []
    arr3 = []
    for i in range(len(arr)):
        arr2.append(ord(arr[i]))
    arr2.sort(reverse = True)
    for j in range(len(arr2)):
        arr3.append(chr(arr2[j]))
    return "".join(arr3)