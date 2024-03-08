function solution(progresses, speeds) {
   let takeDays = [];

    for(let i=0; i<progresses.length; i++) {
      const leftProgresses = 100-progresses[i]
      takeDays.push(Math.ceil(leftProgresses/speeds[i]))
    }

    let compare = takeDays[0]; 
    let count = 0;
    let result = [];

    for(let i = 0; i < takeDays.length; i++) {
        if(compare >= takeDays[i]) {
            count++;
        } else {
            result.push(count);
            count = 1;
            compare = takeDays[i];
        }
    }

    result.push(count);

    return result;
}

