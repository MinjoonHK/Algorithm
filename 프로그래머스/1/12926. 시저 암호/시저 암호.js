function solution(s, n) {
    
    let arr = s.split("");
    for(let i=0; i<arr.length; i++){
        if(arr[i] != " "){
            let charCode = arr[i].charCodeAt() +n;
            if(/^[A-Z]/.test(arr[i]) == true){
                if(charCode > 90){
                    arr[i] = String.fromCharCode(charCode-26);
                }
                else{
                    arr[i] = String.fromCharCode(charCode);
                }
            }
            else{
                if(charCode > 122){
                    arr[i] = String.fromCharCode(charCode-26);
                }
                else{
                    arr[i] = String.fromCharCode(charCode);
                }
            }
        }
    }
    return arr.join("");
}