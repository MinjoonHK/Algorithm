function solution(n, left, right) {
    let answer = [];

    while(left <= right) {


        let value = [Math.floor(left / n), left % n];


        value = Math.max(value[0], value[1]);
        answer.push(value + 1);

        left += 1;
    }

    return answer;
}