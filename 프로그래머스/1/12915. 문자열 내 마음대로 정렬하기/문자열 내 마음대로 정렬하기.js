function solution(a,b){
        a.sort((x, y) => {
            if (x[b] < y[b]) {return -1;}
            else if (x[b] > y[b]) {return 1;}
            else if (x < y) {return -1;}
            else if (x > y) {return 1;}
            return 0
        })
        return a
    }