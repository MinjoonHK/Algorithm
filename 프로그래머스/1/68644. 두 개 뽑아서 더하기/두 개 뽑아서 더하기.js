let result = [];

function solution(numbers) {
    combination([],0,2,numbers,result);
    let setResult = [...new Set(result)];
    setResult.sort((a,b) => a-b);
    return setResult;
}

function combination(items, idx, k,list, result){
    if(items.length == k){
        result.push(items.reduce((a,b) => a+b));
        return;
    }
    
    for(let i = idx; i<list.length;i++){
        combination([...items,list[i]],i+1,k,list,result);
    }
}