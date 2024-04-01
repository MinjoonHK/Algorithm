function solution(n, times) {
    var answer = 0;

    return s(n,times);
}
function s(n, times ) {
    var min =0 ;
    var max = n * Math.max(...times);
    while (min <= max) {
        //중앙값
        var mid = Math.floor((min + max) / 2);
        //합구하기
        var maxInMid = times.reduce((acc,cur)=>acc += Math.floor(mid/cur) , 0);
        if( n <= maxInMid) {
            max = mid -1;
        } else {
            min = mid + 1;
        }
    }
    return min;
}