function solution(word) {
    let dict = [];
    let vowel = ["A","E","I","O","U"];
    function dfs(cur,vowel){
        if(cur.length > 5){
            return;
        }
        dict.push(cur);
        for(let i=0; i<vowel.length; i++){
            dfs(cur+vowel[i],vowel);
        }
    }
    dfs("",vowel);
    return dict.indexOf(word);
}