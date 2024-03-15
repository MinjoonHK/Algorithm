function solution(a, b) {
    let name = ["FRI","SAT","SUN","MON","TUE","WED","THU"];
    let days = [31,29,31,30,31,30,31,31,30,31,30,31];
    let sumDay = 0;
    for(let i=0; i<a-1; i++){
        sumDay += days[i];
    }
    
    sumDay += b;
    
    for(let i=0; i<sumDay; i++){
        name.push(name.shift());
    }
    return name[name.length-1];

}