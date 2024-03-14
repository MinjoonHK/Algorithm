function solution(clothes) {
    let answer = 1;
    let hashMap = new Map();


    clothes.forEach(e => {
        if(hashMap.has(e[1])) {
            hashMap.set(e[1], hashMap.get(e[1]) + 1);
        } else {
            hashMap.set(e[1], 1)    
        }
    })


    for(let [key, value] of hashMap) {

        answer *= value + 1;
    }


    answer -= 1;

    return answer;
}