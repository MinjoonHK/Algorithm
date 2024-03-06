process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    for(let i=0; i<parseInt(n[1]); i++){
        let temp = '';
        for(let j=0; j<parseInt(n[0]); j++){
            temp += "*";
        }
        console.log(temp);
    }
});