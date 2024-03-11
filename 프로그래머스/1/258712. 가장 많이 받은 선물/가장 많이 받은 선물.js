function solution(friends, gifts) {
    let dict = new Map();
    let jisoo = new Map();
    
    for(let i =0; i<friends.length; i++){
        dict.set(friends[i],[]);
        jisoo.set(friends[i],0);
    }
    
    for(let i=0; i<gifts.length;i++){
        let cmd = gifts[i].split(" ");
        dict.get(cmd[0]).push(cmd[1]);
        jisoo.set(cmd[0],jisoo.get(cmd[0])+1);
        jisoo.set(cmd[1],jisoo.get(cmd[1])-1);
    }
    
    
    let maxVal = 0;
    
    for(let i=0; i<friends.length;i++){ // muzi, ryan, frodo, neo
        let counter = 0;
        for(let j=0; j<friends.length; j++){ // muzi, ryan, frodo, neo
            let send = dict.get(friends[i]).filter((value) => value == friends[j]).length
            let receive = dict.get(friends[j]).filter((value) => value == friends[i]).length
            // console.log(friends[i],friends[j],send,receive, dict.get(friends[i]));
            if(send > receive){
                counter++;
            }
            else if(send == receive){
                if(jisoo.get(friends[i]) > jisoo.get(friends[j])){
                    counter++;
                }
            }
        }
        
        if(counter > maxVal){
            maxVal = counter;
        }
    }
        
    return maxVal;
}