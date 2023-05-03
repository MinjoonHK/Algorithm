for t in range(1,11):
    length = int(input())
    arr = []
    cnt = 0
    for _ in range(8):
        arr.append(input())
     
    for j in range(8):
        b = [i[j] for i in arr]
        for i in range(0,9-length):
            if list(arr[j][i:length+i]) == list(reversed(arr[j][i:length+i])):
                cnt += 1
            if list(b[i:length+i]) == list(reversed(b[i:length+i])):
                cnt += 1
    
    print("#"+str(t) , cnt)