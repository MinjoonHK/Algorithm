let input = require("fs").readFileSync("/dev/stdin").toString().split("\n");

for(let i=0; i<input.length-1; i++){
    let [a,b,c] = input[i].split(" ").map((el) => parseInt(el)).sort((a,b) => a-b);
    if(a === 0 && b === 0 && c === 0){
        break;
    }
    else if(a**2 + b**2 === c**2){
        console.log("right");
    }
    else{
        console.log("wrong");
    }
}