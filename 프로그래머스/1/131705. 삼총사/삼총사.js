let combiResult = [];
let counter = 0;

function solution(number) {
    combination([],0,3,number,combiResult);
    return counter;
}

function combination(items,idx,k,list,result){
    if(items.length === k){
        if(items.reduce((a,b) => a+b,0) == 0){
            counter++;
        }
        return
    }
    for(let i=idx; i< list.length;i++){
        combination([...items,list[i]],i+1,k,list,result);
    }
}
