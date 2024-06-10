function solution(n, works) {
    if(works.reduce((a,b) => a+b) <= n) return 0;
    works.sort((a,b) => b-a);
    while(n){
        
        let max = works[0];
        for(let i=0; i<works.length; i++){
            if(works[i] >= max){
                works[i]--;
                n--;
            }
            if(!n){
            break;
        }
        }

    }
    return works.reduce((acc,cur) => acc + Math.pow(cur,2),0);
}