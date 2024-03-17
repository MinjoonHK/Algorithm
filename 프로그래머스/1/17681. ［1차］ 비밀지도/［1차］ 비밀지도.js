function solution(n, arr1, arr2) {
    let answer = Array(n).fill("");
    
    for(let i=0; i<n; i++){
        let temp1 = arr1[i].toString(2).padStart(n,'0');
        let temp2 = arr2[i].toString(2).padStart(n,'0');
        
        for(let j=0; j<n; j++){
            if(temp1[j] == '1' || temp2[j] == '1'){
                answer[i] += "#";
            }
            else if(temp1[j] == '0' && temp2[j] == '0'){
                answer[i] += " ";
            }
        }
    }
    return answer;
}