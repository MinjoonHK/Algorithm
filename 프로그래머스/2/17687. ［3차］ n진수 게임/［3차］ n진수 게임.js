function solution(n, t, m, p) {
    let answer = '';
    let str = '';

    for(let i=0; i<t*m; i++) {
        /*----------------------
        * ex) 2진법 
        * 011011100101110111
        * 0 1 10 11 100 101 110 111
        ----------------------*/
        str += i.toString(n);
    }


    for(let i=p-1; i<t*m; i+=m) {
        
        answer += str[i].toUpperCase();
    }

    return answer;
}