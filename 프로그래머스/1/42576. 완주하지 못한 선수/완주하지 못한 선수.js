function solution(participant, completion) {
    let answer;
    let hashMap = new Map()

    participant.forEach(e => {
        if(hashMap.has(e)) {
            hashMap.set(e, hashMap.get(e)+1);
        } else {
            hashMap.set(e, 1)    
        }
    })

    // 3)
    completion.forEach(e => {
        if(hashMap.has(e)) {
            hashMap.set(e, hashMap.get(e)-1);
        }
    })

    for(let [key, value] of hashMap) {
        if(value == 1) {
            answer = key
        }
    }

    return answer;
}