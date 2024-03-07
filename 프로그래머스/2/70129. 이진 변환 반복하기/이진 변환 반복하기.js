function solution(s) {
    let arr = s.split("");
    let counter = 0;
    let zero = 0;
    
        while(true){
            if(arr.join("") == '1'){
                break;
            }
            zero += arr.filter((value) => value == '0').length;
        arr = arr.filter((value) => value == '1');
        arr = arr.length.toString(2).split("");    
        counter++;
        }
        
    
    return [counter,zero];
}