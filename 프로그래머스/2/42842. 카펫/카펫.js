function solution(brown, yellow) {
    let sum = brown + yellow;
    
    for(let i=1; i<=brown/2; i++){
        if( i * ((brown - i * 2) / 2 + 2 ) == sum){
            return [i, (brown - i *2) /2 + 2].sort((a,b) => b-a);
        }
    }
}