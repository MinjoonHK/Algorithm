function solution(n, times) {
    var answer = 0;
    return s(n,times);
}
function s(n, times ) {
    times.sort((a,b) => a-b); // 이분탐색은 정렬된 상태에서만 가능
    var min =0 ; // 가장 시간이 적게 걸리는 경우
    var max = n * Math.max(...times); //가장 시간이 오래걸리는 경우
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