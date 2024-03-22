var floor = n => Math.floor(n);

function solution(n, times) {
    var answer = 0;

    return s(n,times);
}
function s(n, times ) {
    var min =0 , max = n * Math.max.apply(null, times);
    while (min <= max) {
        var mid = floor((min + max) / 2);
        var maxInMid = times.reduce((acc,cur)=>acc += floor(mid/cur) , 0);
        if( n <= maxInMid) {
            max = mid -1;
        } else {
            min = mid + 1;
        }
    }
    return min;
}