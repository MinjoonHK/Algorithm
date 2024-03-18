function solution(n)
{
    let counter = 0;
    
    while(n > 0){
        if(n % 2 == 0){
            n /= 2;
        }
        else{
            n -= 1;
            counter++;
        }
    }

    return counter;
}