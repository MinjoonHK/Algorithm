function solution(numbers) {

    const length = numbers.length;
    const answer = Array.from({length}, () => -1);
    const stack = [];

    for (let i = length - 1; i >= 0; i--) {
        while (stack.length !== 0 && numbers[i] >= stack.at(-1)) stack.pop();
        if (stack.length !== 0) answer[i] = stack.at(-1);
        stack.push(numbers[i]);
    }
    return answer;
}